package com.example.covidapp.ui.history

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.example.covidapp.R
import com.example.covidapp.model.HealthRecord
import java.util.*

class HistoryListAdapter(
    private val context: Context,
    private val healthRecordList: ArrayList<HealthRecord>
) : BaseAdapter() {

    private val inflater: LayoutInflater = LayoutInflater.from(this.context)

    override fun getCount(): Int {
        return healthRecordList.size
    }

    override fun getItem(position: Int): Any {
        return healthRecordList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val rowView = inflater.inflate(R.layout.history_record_layout, parent, false)

        val image = rowView.findViewById<ImageView>(R.id.historyItemImage)
        val moodText = rowView.findViewById<TextView>(R.id.moodText)
        val dateText = rowView.findViewById<TextView>(R.id.dateText)
        val riskText = rowView.findViewById<TextView>(R.id.riskText)

        val healthRecord = getItem(position) as HealthRecord
        var imageResource = 0

        @Suppress("DUPLICATE_LABEL_IN_WHEN")
        when (healthRecord.overallMood) {
            HealthRecord.MoodLevel.TERRIBLE -> {
                imageResource = R.drawable.ic_big_thumb_down_red_24dp
                moodText.setTextColor(context.getColor(R.color.my_kinda_red_variant))
            }
            HealthRecord.MoodLevel.BAD -> {
                imageResource = R.drawable.ic_thumb_down_red_24dp
                moodText.setTextColor(context.getColor(R.color.my_kinda_red_variant))
            }
            HealthRecord.MoodLevel.OK -> {
                imageResource = R.drawable.ic_thumbs_up_down_black_24dp
                moodText.setTextColor(Color.BLACK)
            }
            HealthRecord.MoodLevel.GOOD -> {
                imageResource = R.drawable.ic_thumb_up_green_24dp
                moodText.setTextColor(context.getColor(R.color.my_green_or_mint))
            }
            HealthRecord.MoodLevel.EXCELLENT -> {
                imageResource = R.drawable.ic_big_thumb_up_green_24dp
                moodText.setTextColor(context.getColor(R.color.my_green_or_mint))
            }
        }

        moodText.text = context.getString(
            R.string.feelingInfo,
            healthRecord.overallMood.name.toLowerCase(Locale.ROOT)
        )
        dateText.text = healthRecord.getDateString()
        riskText.text = healthRecord.getRiskShortenedInfo()
        image.setImageResource(imageResource)

        return rowView
    }
}
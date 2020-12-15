package com.example.covidapp.ui.history

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.covidapp.R
import com.example.covidapp.model.HealthRecord
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

class HistoryListAdapter(
    private val context: Context?,
    private val healthRecordList: ArrayList<HealthRecord>
) : BaseAdapter() {

    private val inflater: LayoutInflater = LayoutInflater.from(this.context)
//        context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return healthRecordList.size
    }

    override fun getItem(position: Int): Any {
        return healthRecordList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val rowView = inflater.inflate(R.layout.history_record_layout, parent, false)

        val image = rowView.findViewById<ImageView>(R.id.historyItemImage)
        val moodText = rowView.findViewById<TextView>(R.id.moodText)
        val dateText = rowView.findViewById<TextView>(R.id.dateText)
        val riskText = rowView.findViewById<TextView>(R.id.riskText)

        val healthRecord = getItem(position) as HealthRecord

        val imageResource = when (healthRecord.overallMood) {
            HealthRecord.MoodLevel.TERRIBLE -> R.drawable.ic_big_thumb_down_red_24dp
            HealthRecord.MoodLevel.BAD -> R.drawable.ic_thumb_down_red_24dp
            HealthRecord.MoodLevel.OK -> R.drawable.ic_thumbs_up_down_black_24dp
            HealthRecord.MoodLevel.GOOD -> R.drawable.ic_thumb_up_green_24dp
            HealthRecord.MoodLevel.EXCELLENT -> R.drawable.ic_big_thumb_up_green_24dp
        }

        moodText.text = healthRecord.overallMood.name.toLowerCase(Locale.ROOT)
        dateText.text = healthRecord.getDateString()
        riskText.text = healthRecord.getRiskShortenedInfo()
        GlobalScope.launch {
            image.setImageResource(imageResource)
        }

        return rowView
    }
}
package com.example.covidapp.ui.history

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.covidapp.R
import com.example.covidapp.model.HealthRecord
import java.util.*
import kotlin.collections.ArrayList

class SingleRecordListAdapter(
    private val context: Context,
    private val symptomsList: ArrayList<Pair<String, HealthRecord.SymptomsStrength>>
) : BaseAdapter() {
    private val inflater: LayoutInflater = LayoutInflater.from(this.context)

    override fun getCount(): Int {
        return symptomsList.size
    }

    override fun getItem(position: Int): Pair<String, HealthRecord.SymptomsStrength> {
        return symptomsList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.symptom_detailed_record, parent, false)

        val symptomName = rowView.findViewById<TextView>(R.id.symptomName)
        val symptomStrength = rowView.findViewById<TextView>(R.id.symptomStrength)

        val singleSymptom = getItem(position)
        symptomName.text = singleSymptom.first
        symptomStrength.text =
            singleSymptom.second.name.toLowerCase(Locale.ROOT).capitalize(Locale.ROOT)
                .replace('_', ' ')

        return rowView
    }

}
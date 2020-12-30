package com.example.covidapp.ui.history

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.health.SystemHealthManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.covidapp.MainActivity
import com.example.covidapp.R
import com.example.covidapp.managers.HealthRecordManager
import com.example.covidapp.model.HealthRecord
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HistoryFragment : Fragment() {

    private lateinit var historyViewModel: HistoryViewModel
    private val healthManager = HealthRecordManager()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        historyViewModel =
            ViewModelProvider(this).get(HistoryViewModel::class.java)
        val view = inflater.inflate(R.layout.fragment_history, container, false)

        val listView = view.findViewById<ListView>(R.id.healthRecordListView)
        val myAdapter = HistoryListAdapter(view.context, healthManager.getAll())
        val addRecordBtn = view.findViewById<FloatingActionButton>(R.id.addRecordBtn)
        addRecordBtn.setOnClickListener{
            val intent = Intent(this.context, RecordViewModel::class.java) 
            startActivity(intent)
        }
        listView.adapter = myAdapter

        return view
    }
}
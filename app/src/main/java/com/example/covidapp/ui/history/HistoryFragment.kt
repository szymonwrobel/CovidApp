package com.example.covidapp.ui.history

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.AdapterView
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.covidapp.R
import com.example.covidapp.managers.HealthRecordManager
import com.example.covidapp.model.HealthRecord
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HistoryFragment : Fragment() {

    private val healthManager = HealthRecordManager()
    private lateinit var listView: ListView
    private lateinit var myAdapter: HistoryListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_history, container, false)
        setHasOptionsMenu(true)
        listView = view.findViewById(R.id.healthRecordListView)
        myAdapter = HistoryListAdapter(view.context, healthManager.getAll())
        val addRecordBtn = view.findViewById<FloatingActionButton>(R.id.addRecordBtn)
        addRecordBtn.setOnClickListener {
            val intent = Intent(this.context, RecordViewModel::class.java)
            startActivity(intent)
        }
        listView.adapter = myAdapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, _, position, _ ->
            val item = parent.getItemAtPosition(position) as HealthRecord

            val singleRecordFragment = SingleRecordFragment()
            val bundle = Bundle()
            bundle.putSerializable("fearIsTheKey", item)
            bundle.putSerializable("adapter", myAdapter)
            singleRecordFragment.arguments = bundle

            val fragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.nav_host_fragment, singleRecordFragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.health_records_reverse_order, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        myAdapter = HistoryListAdapter(requireContext(), healthManager.getAllReversed())
        listView.adapter = myAdapter
        return true
    }

    override fun onResume() {
        println("Halko halko\n")
        super.onResume()
        notifyDataSetChanged()
    }

    fun notifyDataSetChanged() {
        myAdapter.notifyDataSetChanged()
    }
}























package com.example.covidapp.ui.history

import android.os.Bundle
import android.view.*
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.example.covidapp.R
import com.example.covidapp.dao.HealthRecordRepository
import com.example.covidapp.model.HealthRecord
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class SingleRecordFragment : Fragment() {

    private lateinit var healthRecord: HealthRecord
    private lateinit var listView: ListView
    private lateinit var myAdapter: SingleRecordListAdapter
    private lateinit var adapterFromHistoryFragment: HistoryListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_single_health_record, container, false)

        setMenuVisibility(false)
        setHasOptionsMenu(false)

        if (arguments?.getSerializable("fearIsTheKey") != null) {
            healthRecord = requireArguments().getSerializable("fearIsTheKey") as HealthRecord
        }
        if (arguments?.getSerializable("adapter") != null) {
            adapterFromHistoryFragment = requireArguments().getSerializable("adapter") as HistoryListAdapter
        }

        val dateText = view.findViewById<TextView>(R.id.date)
        dateText.text = healthRecord.getDateString(true)

        listView = view.findViewById(R.id.listView)
        myAdapter = SingleRecordListAdapter(view.context, healthRecord.getAllSymptomsAsPairs())
        listView.adapter = myAdapter

        val backButton = view.findViewById<AppCompatButton>(R.id.backButton)
        backButton.setOnClickListener {
            val fragmentManager = requireActivity().supportFragmentManager
            fragmentManager.popBackStack()
        }

        val deleteButton = view.findViewById<AppCompatButton>(R.id.deleteButton)
        deleteButton.setOnClickListener {
            MaterialAlertDialogBuilder(view.context)
                .setTitle(resources.getString(R.string.deleteRecordQuestion))
                .setMessage(resources.getString(R.string.deleteRecordInfo))
                .setNegativeButton(resources.getString(R.string.Cancel)) { _, _ -> }
                .setPositiveButton(resources.getString(R.string.deleteImSure)) { _, _ ->
                    HealthRecordRepository.remove(healthRecord)
                    adapterFromHistoryFragment.notifyDataSetChanged()
                    val fragmentManager = requireActivity().supportFragmentManager
                    fragmentManager.popBackStack()
                }.show()
        }
        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menu.findItem(R.id.reversed_order).isVisible = false
    }
}
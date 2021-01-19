package com.example.covidapp.ui.history

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.example.covidapp.R
import com.example.covidapp.model.HealthRecord

class SingleRecordFragment : Fragment() {

    private lateinit var healthRecord: HealthRecord
    private lateinit var listView: ListView
    private lateinit var myAdapter: SingleRecordListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_single_health_record, container, false)

        setMenuVisibility(false)

        if (arguments?.getSerializable("fearIsTheKey") != null) {
            healthRecord = requireArguments().getSerializable("fearIsTheKey") as HealthRecord
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

//        MaterialAlertDialogBuilder(context)
//            .setTitle(resources.getString(R.string.title))
//            .setMessage(resources.getString(R.string.supporting_text))
//            .setNeutralButton(resources.getString(R.string.cancel)) { dialog, which ->
//                // Respond to neutral button press
//            }
//            .setNegativeButton(resources.getString(R.string.decline)) { dialog, which ->
//                // Respond to negative button press
//            }
//            .setPositiveButton(resources.getString(R.string.accept)) { dialog, which ->
//                // Respond to positive button press
//            }
//            .show()

        return view
    }
}
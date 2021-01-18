package com.example.covidapp.ui.history

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.covidapp.R
import com.example.covidapp.model.HealthRecord


class SingleRecordFragment : Fragment() {

    var healthRecord: HealthRecord? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_single_health_record, container, false)

        if (arguments?.getSerializable("fearIsTheKey") != null) {
            healthRecord = requireArguments().getSerializable("fearIsTheKey") as HealthRecord
        }

        



        val backButton = view.findViewById<AppCompatButton>(R.id.backButton)
        backButton.setOnClickListener {
            val fragmentManager = requireActivity().supportFragmentManager
            fragmentManager.popBackStack()
        }

        return view
    }
}
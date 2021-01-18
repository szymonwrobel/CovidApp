package com.example.covidapp.ui.history

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.example.covidapp.R


class SingleRecordFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_single_health_record, container, false)

        val backButton = view.findViewById<AppCompatButton>(R.id.backButton)
        backButton.setOnClickListener {
            val fragmentManager = requireActivity().supportFragmentManager
            fragmentManager.popBackStack()
        }

        return view
    }
}
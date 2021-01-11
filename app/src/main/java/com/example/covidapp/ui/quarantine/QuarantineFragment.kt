package com.example.covidapp.ui.quarantine

import android.opengl.Visibility
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.covidapp.R
import com.example.covidapp.model.QuarantineInfo

class QuarantineFragment : Fragment() {

    private lateinit var quarantineViewModel: QuarantineViewModel
    private lateinit var addQuarantineButton: Button
    private val quarantineInfo = QuarantineInfo()
    private lateinit var calendarView: CalendarView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_quarantine, container, false)
        calendarView = view.findViewById(R.id.calendarView)
        addQuarantineButton = view.findViewById(R.id.addQuarantine)
        calendarView.visibility = View.INVISIBLE

        if (quarantineInfo.userOnQuarantine) {
            addQuarantineButton.visibility = View.INVISIBLE
        }

        addQuarantineButton.setOnClickListener {
            calendarView.visibility = View.VISIBLE
            addQuarantineButton.text = "aaa"
            println(calendarView.weekDayTextAppearance)
        }

        return view
    }
}
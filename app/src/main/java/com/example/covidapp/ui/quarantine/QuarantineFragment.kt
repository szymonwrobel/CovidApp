package com.example.covidapp.ui.quarantine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.covidapp.R

class QuarantineFragment : Fragment() {

    private lateinit var quarantineViewModel: QuarantineViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        quarantineViewModel =
                ViewModelProvider(this).get(QuarantineViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_quarantine, container, false)
        val textView: TextView = root.findViewById(R.id.text_quarantine)
        quarantineViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
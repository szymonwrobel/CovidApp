package com.example.covidapp.ui.quarantine

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuarantineViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is quarantine Fragment"
    }
    val text: LiveData<String> = _text
}
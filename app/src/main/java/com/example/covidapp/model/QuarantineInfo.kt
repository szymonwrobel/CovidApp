package com.example.covidapp.model

import java.util.*

class QuarantineInfo {

    var userOnQuarantine = false
    lateinit var quarantineStartDate: Calendar
    lateinit var quarantineEndDate: Calendar

    init {
        //TODO("read from a file if the user is currently in quarantine, set the status to the right value and set the dates")
    }
}
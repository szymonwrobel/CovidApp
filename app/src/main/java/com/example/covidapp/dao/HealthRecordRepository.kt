package com.example.covidapp.dao

import android.content.Context
import com.example.covidapp.model.HealthRecord
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.io.Serializable
import java.lang.Exception
import java.lang.IndexOutOfBoundsException
import java.util.*
import kotlin.collections.ArrayList
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.coroutineContext

object HealthRecordRepository : Serializable {

    private var healthRecords: ArrayList<HealthRecord> = ArrayList()
    lateinit var context: Context
    private var printReversed = false

    init {
        //TODO: add reading from a file
//        val hr1 = HealthRecord()
//        val hr2 = HealthRecord()
//        val hr3 = HealthRecord()
//        val hr4 = HealthRecord()
//        val hr5 = HealthRecord()
//        val cal = Calendar.getInstance()
//        cal.time = Date(2020 - 1900, 6, 15)
//        hr1.calendar = cal
//        hr2.calendar = cal
//        hr3.calendar = cal
//        hr4.calendar = cal
//        hr5.calendar = cal
//
//        add(hr1)
//        add(hr2)
//        add(hr3)
//        add(hr4)
//        add(hr5)
    }

    fun add(healthRecord: HealthRecord) {
        this.healthRecords.add(healthRecord)
    }

    fun get(index: Int): HealthRecord {
        if (index < healthRecords.size) {
            return this.healthRecords[index]
        }
        throw IndexOutOfBoundsException();
    }

    fun getAll(): ArrayList<HealthRecord> {
        this.healthRecords.sort()
        if (printReversed)
            this.healthRecords.reverse()
        return this.healthRecords
    }

    fun getAllReversed(): ArrayList<HealthRecord> {
        this.printReversed = !this.printReversed
        return getAll()
    }

    fun update(index: Int, healthRecord: HealthRecord): Boolean {
        if (index < healthRecords.size) {
            this.healthRecords[index] = healthRecord
            return true
        }
        return false
    }

    fun remove(index: Int): Boolean {
        if (index < healthRecords.size) {
            this.healthRecords.removeAt(index)
            return true
        }
        return false
    }

    fun remove(healthRecord: HealthRecord): Boolean {
        if (this.healthRecords.contains(healthRecord)) {
            this.healthRecords.remove(healthRecord)
            return true;
        }
        return false;
    }
}
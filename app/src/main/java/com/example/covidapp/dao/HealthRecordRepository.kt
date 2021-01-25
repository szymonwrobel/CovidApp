package com.example.covidapp.dao

import com.example.covidapp.model.HealthRecord
import java.io.*

object HealthRecordRepository : Serializable {

    private var healthRecords: ArrayList<HealthRecord> = ArrayList()
    private var printReversed = false

    fun add(healthRecord: HealthRecord) {
        this.healthRecords.add(healthRecord)
    }

    fun get(index: Int): HealthRecord {
        if (index < healthRecords.size) {
            return this.healthRecords[index]
        }
        throw IndexOutOfBoundsException();
    }

    fun setAll(healthRecords: ArrayList<HealthRecord>?) {
        if (healthRecords != null)
            this.healthRecords = healthRecords
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
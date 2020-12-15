package com.example.covidapp.dao

import com.example.covidapp.model.HealthRecord
import java.lang.IndexOutOfBoundsException

class HealthRecordRepository {

    private var healthRecords: ArrayList<HealthRecord> = ArrayList()

    init {
        //TODO: add reading from cache or from file
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

    fun getAll(): List<HealthRecord> {
        return this.healthRecords
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
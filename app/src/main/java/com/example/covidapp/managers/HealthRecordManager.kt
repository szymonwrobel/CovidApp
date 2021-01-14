package com.example.covidapp.managers

import android.content.Context
import com.example.covidapp.dao.HealthRecordRepository
import com.example.covidapp.model.HealthRecord
import kotlin.collections.ArrayList

class HealthRecordManager {

    fun add(healthRecord: HealthRecord) {
        HealthRecordRepository.add(healthRecord)
    }

    fun get(index: Int): HealthRecord {
        return HealthRecordRepository.get(index)
    }

    fun getAll(): ArrayList<HealthRecord> {
        return HealthRecordRepository.getAll()
    }

    fun update(index: Int, healthRecord: HealthRecord): Boolean {
        return HealthRecordRepository.update(index, healthRecord)
    }

    fun remove(index: Int): Boolean {
        return HealthRecordRepository.remove(index)
    }

    fun remove(healthRecord: HealthRecord): Boolean {
        return HealthRecordRepository.remove(healthRecord)
    }
}
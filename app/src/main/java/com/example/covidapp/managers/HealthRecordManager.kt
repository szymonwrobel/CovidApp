package com.example.covidapp.managers

import com.example.covidapp.dao.HealthRecordRepository
import com.example.covidapp.model.HealthRecord

class HealthRecordManager(private val healthRecordRepository: HealthRecordRepository) {

    fun add(healthRecord: HealthRecord) {
        this.healthRecordRepository.add(healthRecord)
    }

    fun get(index: Int): HealthRecord {
        return this.healthRecordRepository.get(index)
    }

    fun getAll(): List<HealthRecord> {
        return this.healthRecordRepository.getAll()
    }

    fun update(index: Int, healthRecord: HealthRecord): Boolean {
        return this.healthRecordRepository.update(index, healthRecord)
    }

    fun remove(index: Int): Boolean {
        return this.healthRecordRepository.remove(index)
    }

    fun remove(healthRecord: HealthRecord): Boolean {
        return this.healthRecordRepository.remove(healthRecord)
    }
}
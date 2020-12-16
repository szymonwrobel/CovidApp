package com.example.covidapp.managers

import com.example.covidapp.dao.HealthRecordRepository
import com.example.covidapp.model.HealthRecord
import java.util.*
import kotlin.collections.ArrayList

class HealthRecordManager {
    private var healthRecordRepository = HealthRecordRepository()

    init {
        // THERE ARE SOME TEST VALUES, TODO: DELETE TEST VALUES
        val hr1 = HealthRecord()
        val hr2 = HealthRecord()
        val hr3 = HealthRecord()
        val hr4 = HealthRecord()
        val hr5 = HealthRecord()
        val hr11 = HealthRecord()
        val hr21 = HealthRecord()
        val hr31 = HealthRecord()
        val hr41 = HealthRecord()
        val hr51 = HealthRecord()
        hr1.overallMood = HealthRecord.MoodLevel.EXCELLENT
        hr2.overallMood = HealthRecord.MoodLevel.GOOD
        hr3.overallMood = HealthRecord.MoodLevel.OK
        hr4.overallMood = HealthRecord.MoodLevel.BAD
        hr5.overallMood = HealthRecord.MoodLevel.TERRIBLE
        val cal = Calendar.getInstance()
        cal.time = Date(2020 - 1900, 6, 15)
        hr1.calendar = cal
        hr2.calendar = cal

        add(hr1)
        add(hr2)
        add(hr3)
        add(hr4)
        add(hr5)
        add(hr11)
        add(hr21)
        add(hr31)
        add(hr41)
        add(hr51)
    }

    fun add(healthRecord: HealthRecord) {
        this.healthRecordRepository.add(healthRecord)
    }

    fun get(index: Int): HealthRecord {
        return this.healthRecordRepository.get(index)
    }

    fun getAll(): ArrayList<HealthRecord> {
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
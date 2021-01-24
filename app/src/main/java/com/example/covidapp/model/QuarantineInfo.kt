package com.example.covidapp.model

import android.content.Context
import android.content.res.Resources
import com.example.covidapp.R
import java.util.*

object QuarantineInfo {

    private var isUserOnQuarantine = false
    private var quarantineEndDate: Calendar? = null


    @JvmStatic
    fun startQuarantine(endDate: Calendar?) {
        isUserOnQuarantine = true
        quarantineEndDate = endDate
    }

    // for testing
    @JvmStatic
    fun startQuarantine() {
        isUserOnQuarantine = true
    }

    @JvmStatic
    fun endQuarantine() {
        isUserOnQuarantine = false
        quarantineEndDate = null
    }

    @JvmStatic
    fun getDaysUntilTheEndOfQuarantine(): Long {
        return if (quarantineEndDate != null) {
            if (quarantineEndDate!!.timeInMillis > Calendar.getInstance().timeInMillis) {
                val timeDiff =
                    quarantineEndDate!!.timeInMillis - Calendar.getInstance().timeInMillis
                timeDiff / 1000 / 60 / 60 / 24 + 1
            } else {
                0
            }
        } else {
            0
        }
    }

    @JvmStatic
    fun returnDayOrDaysString(): String {
        return if (getDaysUntilTheEndOfQuarantine() > 1) {
            "days"
        } else {
            "day"
        }
    }

    @JvmStatic
    fun getIsUserOnQuarantine(): Boolean {
        return isUserOnQuarantine
    }

    @JvmStatic
    fun getDailyTip(context: Context): String {
        val tipsOfDay = context.resources.getStringArray(R.array.quarantineActivities)
        return tipsOfDay[getDaysUntilTheEndOfQuarantine().toInt() % tipsOfDay.size]
    }
}
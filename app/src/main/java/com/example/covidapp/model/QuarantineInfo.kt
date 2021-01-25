package com.example.covidapp.model

import android.content.Context
import android.content.res.Resources
import com.example.covidapp.R
import java.util.*
import kotlin.math.ceil

object QuarantineInfo {

    @JvmStatic
    var hasBeenInitialized = false
    private var isUserOnQuarantine = false
    private var quarantineEndDate: Calendar? = null


    @JvmStatic
    fun startQuarantine(endDate: Calendar?) {
        isUserOnQuarantine = true
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = endDate!!.timeInMillis + (1000 * 60 * 60 * 24) - endDate.timeInMillis % (1000 * 60 * 60 * 24)  - 1
        quarantineEndDate = calendar
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
                var timeDiff =
                    quarantineEndDate!!.timeInMillis - Calendar.getInstance().timeInMillis
                timeDiff /= (1000 * 60 * 60 * 24)
                return timeDiff + 1
            } else {
                endQuarantine()
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
        if (quarantineEndDate != null && quarantineEndDate!!.timeInMillis < Calendar.getInstance().timeInMillis) {
            endQuarantine()
        }
        return isUserOnQuarantine
    }

    @JvmStatic
    fun getDailyTip(context: Context): String {
        val tipsOfDay = context.resources.getStringArray(R.array.quarantineActivities)
        return tipsOfDay[getDaysUntilTheEndOfQuarantine().toInt() % tipsOfDay.size]
    }

    @JvmStatic
    fun quarantineInfoToString(): String {
        var str = ""
        str += if (isUserOnQuarantine) {
            "t" + quarantineEndDate!!.timeInMillis.toString()
        } else {
            "f"
        }
        return str + "\n"
    }

    @JvmStatic
    fun stringToQuarantineInfo(str: String) {
        if (str[0] == 'f') {
            isUserOnQuarantine = false
            quarantineEndDate = null
        } else {
            val millis = str.drop(1).dropLast(1).toLong()
            if (millis > Calendar.getInstance().timeInMillis) {
                isUserOnQuarantine = true
                val cal = Calendar.getInstance()
                cal.timeInMillis = millis
                quarantineEndDate = cal
            } else {
                endQuarantine()
            }
        }
    }
}
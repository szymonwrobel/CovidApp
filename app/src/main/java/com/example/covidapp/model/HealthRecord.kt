package com.example.covidapp.model

import android.app.Application
import java.io.Serializable
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.roundToInt

class HealthRecord : Application(), Comparable<HealthRecord>, Serializable {

    enum class SymptomsStrength {
        NO_SYMPTOMS,
        WEAK_SYMPTOMS,
        MEDIUM_SYMPTOMS,
        STRONG_SYMPTOMS,
    }

    enum class MoodLevel {
        TERRIBLE,
        BAD,
        OK,
        GOOD,
        EXCELLENT
    }

    /*
    * info taken from this website:
    * https://www.who.int/emergencies/diseases/novel-coronavirus-2019/question-and-answers-hub/q-a-detail/coronavirus-disease-covid-19#:~:text=symptoms
    * looks reliably, so I'd stick with it
     */
    var overallMood = MoodLevel.TERRIBLE
    var calendar: Calendar = Calendar.getInstance()
    var riskLevel = 0.0

    // most common COVID symptoms
    var fever = SymptomsStrength.NO_SYMPTOMS
    var dryCough = SymptomsStrength.NO_SYMPTOMS
    var tiredness = SymptomsStrength.NO_SYMPTOMS

    //less common COVID symptoms
    var achesAndPains = SymptomsStrength.NO_SYMPTOMS
    var soreThroat = SymptomsStrength.NO_SYMPTOMS
    var diarrhea = SymptomsStrength.NO_SYMPTOMS
    var conjunctivitis = SymptomsStrength.NO_SYMPTOMS
    var headache = SymptomsStrength.NO_SYMPTOMS
    var lossOfTasteOrSmell = SymptomsStrength.NO_SYMPTOMS
    var rashOnSkin = SymptomsStrength.NO_SYMPTOMS
    var discolourationOfFingersOrToes = SymptomsStrength.NO_SYMPTOMS

    // serious COVID symptoms
    var difficultyBreathingOrShortnessOfBreath = SymptomsStrength.NO_SYMPTOMS
    var chestPainOrPressure = SymptomsStrength.NO_SYMPTOMS
    var lossOfSpeechOrMovement = SymptomsStrength.NO_SYMPTOMS

    fun setRisk(value: Double) {
        riskLevel = value
        overallMood = if (riskLevel <= 20) {
            MoodLevel.EXCELLENT
        } else if (riskLevel > 20 && riskLevel <= 40) {
            MoodLevel.GOOD
        } else if (riskLevel > 40 && riskLevel <= 60) {
            MoodLevel.OK
        } else if (riskLevel > 60 && riskLevel <= 80) {
            MoodLevel.BAD
        } else {
            MoodLevel.TERRIBLE
        }
    }

    fun getRiskShortenedInfo(): String {
        return riskLevel.roundToInt().toString() + "%"
    }

    fun getDateString(withHour: Boolean = false): String {
        val d = if (calendar.get(Calendar.DAY_OF_MONTH) > 9) {
            calendar.get(Calendar.DAY_OF_MONTH)
        }
        else {
            "0" + calendar.get(Calendar.DAY_OF_MONTH)
        }
        val month = if (calendar.get(Calendar.MONTH) + 1 > 9) {
            calendar.get(Calendar.MONTH) + 1
        }
        else {
            "0" + (calendar.get(Calendar.MONTH) + 1)
        }
        val y = calendar.get(Calendar.YEAR)
        val h = if (calendar.get(Calendar.HOUR_OF_DAY) > 9) {
            calendar.get(Calendar.HOUR_OF_DAY)
        } else {
            "0" + calendar.get(Calendar.HOUR_OF_DAY)
        }
        val m = if (calendar.get(Calendar.MINUTE) > 9) {
            calendar.get(Calendar.MINUTE)
        } else {
            "0" + calendar.get(Calendar.MINUTE)
        }
        val s = if (calendar.get(Calendar.SECOND) > 9) {
            calendar.get(Calendar.SECOND)
        } else {
            "0" + calendar.get(Calendar.SECOND)
        }

        return if (withHour) {
            "$d/$month/$y $h:$m:$s"
        } else {
            "$d/$month/$y"
        }
    }

    override fun compareTo(other: HealthRecord): Int {
        return this.calendar.compareTo(other.calendar)
    }

    fun getAllSymptomsAsPairs(): ArrayList<Pair<String, SymptomsStrength>> {
        val arrayList = ArrayList<Pair<String, SymptomsStrength>>()
        arrayList.add(Pair("Fever", fever))
        arrayList.add(Pair("Dry cough", dryCough))
        arrayList.add(Pair("Tiredness", tiredness))

        arrayList.add(Pair("Aches and pains", achesAndPains))
        arrayList.add(Pair("Sore throat", soreThroat))
        arrayList.add(Pair("Diarrhea", diarrhea))
        arrayList.add(Pair("Conjunctivitis", conjunctivitis))
        arrayList.add(Pair("Headache", headache))
        arrayList.add(Pair("Loss of taste or smell", lossOfTasteOrSmell))
        arrayList.add(Pair("Rash on skin", rashOnSkin))
        arrayList.add(Pair("Discolouration of fingers or toes", discolourationOfFingersOrToes))

        arrayList.add(Pair("Difficulty breathing", difficultyBreathingOrShortnessOfBreath))
        arrayList.add(Pair("Chest pain or pressure", chestPainOrPressure))
        arrayList.add(Pair("Loss of speech or movement", lossOfSpeechOrMovement))

        return arrayList
    }
}
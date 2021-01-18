package com.example.covidapp.model

import android.app.Application
import android.content.res.Resources
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import com.example.covidapp.R
import java.io.Serializable
import java.util.*
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
    var calendar = Calendar.getInstance()
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

    fun calculateRisk(): Double {
        return 0.0
    }

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

    fun getDateString(): String {
        return calendar.get(Calendar.DAY_OF_MONTH)
            .toString() + "/" + (calendar.get(Calendar.MONTH) + 1) + "/" + calendar.get(Calendar.YEAR)
    }

    override fun compareTo(other: HealthRecord): Int {
        return this.calendar.compareTo(other.calendar)
    }

}
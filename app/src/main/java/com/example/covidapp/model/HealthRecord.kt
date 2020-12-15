package com.example.covidapp.model

import java.util.*

class HealthRecord {

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
    var calendar = Calendar.getInstance()
    var overallMood = MoodLevel.OK

    // most common COVID symptoms
    var fever = SymptomsStrength.NO_SYMPTOMS
    var dryCough = SymptomsStrength.NO_SYMPTOMS
    var tiredness = SymptomsStrength.NO_SYMPTOMS

    //less common COVID symptoms
    var achesAndPains = SymptomsStrength.NO_SYMPTOMS
    var soreThroat = SymptomsStrength.NO_SYMPTOMS
    var diarrhoea = SymptomsStrength.NO_SYMPTOMS
    var conjunctivitis = SymptomsStrength.NO_SYMPTOMS
    var headache = SymptomsStrength.NO_SYMPTOMS
    var lossOfTasteOrSmell = SymptomsStrength.NO_SYMPTOMS
    var rashOnSkin = SymptomsStrength.NO_SYMPTOMS
    var discolourationOfFindersOrToes = SymptomsStrength.NO_SYMPTOMS

    // serious COVID symptoms
    var difficultyBreathingOrShortnessOfBreath = SymptomsStrength.NO_SYMPTOMS
    var chestPainOrPressure = SymptomsStrength.NO_SYMPTOMS
    var lossOfSpeechOrMovement = SymptomsStrength.NO_SYMPTOMS

    private fun calculateTheRisk(): Double {
        //TODO: implement the method which calculates the risk of being infected, based on the user's input.
        achesAndPains = SymptomsStrength.MEDIUM_SYMPTOMS
        return 0.0;
    }

    fun getRiskInfo(): String {
        //TODO: return the string about the risk of being infected based on the calculateTheRisk() method.
        return "";
    }

    fun getRiskShortenedInfo(): String {
        //TODO: return the infection risk in a single word, like "high", "low", "medium", whatever.
        return "HIGH"
    }

    fun getDateString(): String {
        return calendar.get(Calendar.DAY_OF_MONTH)
            .toString() + "/" + (calendar.get(Calendar.MONTH) + 1) + "/" + calendar.get(Calendar.YEAR)
    }

}
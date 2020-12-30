package com.example.covidapp.ui.history;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import com.example.covidapp.R;
import com.example.covidapp.model.Symptom;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class RecordViewModel extends AppCompatActivity {

    private List<Symptom> symptoms;
    private double currentRisk = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_view_model);
        symptoms = new ArrayList<>();
        symptoms.add(new Symptom("fever", 4));
        symptoms.add(new Symptom("dryCough", 4 ));
        symptoms.add(new Symptom("tiredness", 3 ));
        symptoms.add(new Symptom("achesAndPains", 4 ));
        symptoms.add(new Symptom("soreThroat", 2 ));
        symptoms.add(new Symptom("diarrhea", 1 ));
        symptoms.add(new Symptom("conjunctivitis", 1 ));
        symptoms.add(new Symptom("headache", 1 ));
        symptoms.add(new Symptom("lossOfTasteOrSmell", 5 ));
        symptoms.add(new Symptom("rashOnSkin", 2 ));
        symptoms.add(new Symptom("discolourationOfFingersOrToes", 3 ));
        symptoms.add((new Symptom("difficultyBreathingOrShortnessOfBreath", 5 )));
        symptoms.add(new Symptom("chestPainOrPressure", 4 ));
        symptoms.add(new Symptom("lossOfSpeechOrMovement", 5 ));
    }


    public double calculateRisk(){
        double result = 0;
        for(int i = 0; i < symptoms.size(); i++){
            result += symptoms.get(i).getRisk() * symptoms.get(i).getSeverity();
        }
        result = result / 132 * 100;
        return result;
    }

    public String getRiskInfo(){
            return "Your risk of being infected is " + currentRisk + "%";
    }

    public String getShortRiskInfo(){
        if(currentRisk<=20){
            return "VERY LOW";
        }
        else if(currentRisk>20 && currentRisk<=40){
            return "LOW";
        }
        else if(currentRisk>40 && currentRisk<=60){
            return "MEDIUM";
        }
        else if(currentRisk>60 && currentRisk<=80){
            return "HIGH";
        }
        else {
            return "VERY HIGH";
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public String getDateString() {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        return day + "/" + month + "/" + year;
    }
}
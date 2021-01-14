package com.example.covidapp.ui.history;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.covidapp.R;
import com.example.covidapp.managers.HealthRecordManager;
import com.example.covidapp.model.HealthRecord;
import com.example.covidapp.model.Symptom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RecordViewModel extends AppCompatActivity {

    private List<Symptom> symptoms;
    private double currentRisk = 0;
    private final HealthRecord hr = new HealthRecord();
    private static final Map<Integer, Boolean> firstRow = new HashMap<>();
    private static final Map<Integer, Boolean> secondRow = new HashMap<>();
    private static final Map<Integer, Boolean> thirdRow = new HashMap<>();
    private static final Map<Integer, Boolean> fourthRow = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_view_model);
        ListView symptomsList = findViewById(R.id.symptomsList);

        symptoms = new ArrayList<>();
        symptoms.add(new Symptom("fever", "Fever", 4));
        symptoms.add(new Symptom("dryCough", "Dry cough", 4));
        symptoms.add(new Symptom("tiredness", "Tiredness", 3));
        symptoms.add(new Symptom("achesAndPains", "Aches and pains", 4));
        symptoms.add(new Symptom("soreThroat", "Sore throat", 2));
        symptoms.add(new Symptom("diarrhea", "Diarrhea", 1));
        symptoms.add(new Symptom("conjunctivitis", "Conjunctivitis", 1));
        symptoms.add(new Symptom("headache", "Headache", 1));
        symptoms.add(new Symptom("lossOfTasteOrSmell", "Loss of taste or smell", 5));
        symptoms.add(new Symptom("rashOnSkin", "Rash on skin", 2));
        symptoms.add(new Symptom("discolourationOfFingersOrToes", "Discolouration of fingers or toes", 3));
        symptoms.add(new Symptom("difficultyBreathingOrShortnessOfBreath", "Difficulty breathing or shortness of breath", 5));
        symptoms.add(new Symptom("chestPainOrPressure", "Chest pain or pressure", 4));
        symptoms.add(new Symptom("lossOfSpeechOrMovement", "Loss of speech or movement", 5));

        symptomsList.setAdapter(new MyListAdapter());

        Button confirm = findViewById(R.id.ConfirmSymptomsBtn);
        confirm.setOnClickListener(v -> {
            currentRisk = calculateRisk();
            HealthRecordManager healthRecordManager = new HealthRecordManager();
            hr.setRisk(currentRisk);
            healthRecordManager.add(hr);
            finish();
        });
    }

    public double calculateRisk() {
        double result = 0;
        for (int i = 0; i < symptoms.size(); i++) {
            result += symptoms.get(i).getRisk() * symptoms.get(i).getSeverity();
        }
        result = result / 132 * 100;
        return result;
    }

    private class MyListAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return symptoms.size();
        }

        @Override
        public Object getItem(int position) {
            return symptoms.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @SuppressLint("ViewHolder")
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(getApplicationContext());

            convertView = inflater.inflate(R.layout.symptom_record, parent, false);

            TextView symptomName = convertView.findViewById(R.id.symptomName);
            RadioGroup btnGroup = convertView.findViewById(R.id.groupBtn);
            btnGroup.clearCheck();
            Symptom symptom = (Symptom) getItem(position);
            symptomName.setText(symptom.getName());

            btnGroup.setOnCheckedChangeListener((group, checkedId) -> {
                switch (checkedId) {
                    case R.id.noSymptoms:
                        if (!firstRow.containsKey(position)) {
                            firstRow.put(position, true);
                            secondRow.remove(position);
                            thirdRow.remove(position);
                            fourthRow.remove(position);
                        }
                        symptom.setSeverity(0);
                        try {
                            hr.getClass().getField(symptom.getId()).set(hr, HealthRecord.SymptomsStrength.NO_SYMPTOMS);
                        } catch (NoSuchFieldException | IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        break;
                    case R.id.lowSymptoms:
                        if (!secondRow.containsKey(position)) {
                            secondRow.put(position, true);
                            firstRow.remove(position);
                            thirdRow.remove(position);
                            fourthRow.remove(position);
                        }
                        symptom.setSeverity(1);
                        try {
                            hr.getClass().getField(symptom.getId()).set(hr, HealthRecord.SymptomsStrength.WEAK_SYMPTOMS);
                        } catch (NoSuchFieldException | IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        break;
                    case R.id.mediumSymptoms:
                        if (!thirdRow.containsKey(position)) {
                            thirdRow.put(position, true);
                            secondRow.remove(position);
                            firstRow.remove(position);
                            fourthRow.remove(position);
                        }
                        symptom.setSeverity(2);
                        try {
                            hr.getClass().getField(symptom.getId()).set(hr, HealthRecord.SymptomsStrength.MEDIUM_SYMPTOMS);
                        } catch (NoSuchFieldException | IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        break;
                    case R.id.highSymptoms:
                        if (!fourthRow.containsKey(position)) {
                            fourthRow.put(position, true);
                            secondRow.remove(position);
                            firstRow.remove(position);
                            thirdRow.remove(position);
                        }
                        symptom.setSeverity(3);
                        try {
                            hr.getClass().getField(symptom.getId()).set(hr, HealthRecord.SymptomsStrength.STRONG_SYMPTOMS);
                        } catch (NoSuchFieldException | IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        break;
                }
            });
            return convertView;
        }
    }
}
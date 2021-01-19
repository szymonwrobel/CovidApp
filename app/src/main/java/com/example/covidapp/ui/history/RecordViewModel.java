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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.covidapp.R;
import com.example.covidapp.managers.HealthRecordManager;
import com.example.covidapp.model.HealthRecord;
import com.example.covidapp.model.Symptom;

import java.sql.SQLOutput;
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
            healthRecordManager.getAll();
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
            RadioButton r1 = convertView.findViewById(R.id.noSymptoms);
            RadioButton r2 = convertView.findViewById(R.id.lowSymptoms);
            RadioButton r3 = convertView.findViewById(R.id.mediumSymptoms);
            RadioButton r4 = convertView.findViewById(R.id.highSymptoms);

            Symptom symptom = (Symptom) getItem(position);
            symptomName.setText(symptom.getName());

            if (firstRow.containsKey(position)) {
                r1.setChecked(firstRow.get(position));
            }
            if (secondRow.containsKey(position)) {
                r2.setChecked(secondRow.get(position));
            }
            if (thirdRow.containsKey(position)) {
                r3.setChecked(thirdRow.get(position));
            }
            if (fourthRow.containsKey(position)) {
                r4.setChecked(fourthRow.get(position));
            }
            btnGroup.clearCheck();

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
                        setFields(position, HealthRecord.SymptomsStrength.NO_SYMPTOMS);
                        break;
                    case R.id.lowSymptoms:
                        if (!secondRow.containsKey(position)) {
                            secondRow.put(position, true);
                            firstRow.remove(position);
                            thirdRow.remove(position);
                            fourthRow.remove(position);
                        }
                        symptom.setSeverity(1);
                        setFields(position, HealthRecord.SymptomsStrength.WEAK_SYMPTOMS);
                        break;
                    case R.id.mediumSymptoms:
                        if (!thirdRow.containsKey(position)) {
                            thirdRow.put(position, true);
                            secondRow.remove(position);
                            firstRow.remove(position);
                            fourthRow.remove(position);
                        }
                        symptom.setSeverity(2);
                        setFields(position, HealthRecord.SymptomsStrength.MEDIUM_SYMPTOMS);
                        break;
                    case R.id.highSymptoms:
                        if (!fourthRow.containsKey(position)) {
                            fourthRow.put(position, true);
                            secondRow.remove(position);
                            firstRow.remove(position);
                            thirdRow.remove(position);
                        }
                        symptom.setSeverity(3);
                        setFields(position, HealthRecord.SymptomsStrength.STRONG_SYMPTOMS);
                        break;
                }
            });
            return convertView;
        }

        private void setFields(int position, HealthRecord.SymptomsStrength symptomStrength) {
            switch (position) {
                case 0: {
                    hr.setFever(symptomStrength);
                    break;
                }
                case 1: {
                    hr.setDryCough(symptomStrength);
                    break;
                }
                case 2: {
                    hr.setTiredness(symptomStrength);
                    break;
                }
                case 3: {
                    hr.setAchesAndPains(symptomStrength);
                    break;
                }
                case 4: {
                    hr.setSoreThroat(symptomStrength);
                    break;
                }
                case 5: {
                    hr.setDiarrhea(symptomStrength);
                    break;
                }
                case 6: {
                    hr.setConjunctivitis(symptomStrength);
                    break;
                }
                case 7: {
                    hr.setHeadache(symptomStrength);
                    break;
                }
                case 8: {
                    hr.setLossOfTasteOrSmell(symptomStrength);
                    break;
                }
                case 9: {
                    hr.setRashOnSkin(symptomStrength);
                    break;
                }
                case 10: {
                    hr.setDiscolourationOfFingersOrToes(symptomStrength);
                    break;
                }
                case 11: {
                    hr.setDifficultyBreathingOrShortnessOfBreath(symptomStrength);
                    break;
                }
                case 12: {
                    hr.setChestPainOrPressure(symptomStrength);
                    break;
                }
                case 13: {
                    hr.setLossOfSpeechOrMovement(symptomStrength);
                    break;
                }
            }
        }
    }
}
package com.example.covidapp.ui.history;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

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
        ListView symptomsList = findViewById(R.id.symptomsList);

        symptoms = new ArrayList<>();
        symptoms.add(new Symptom("Fever", 4));
        symptoms.add(new Symptom("Dry cough", 4 ));
        symptoms.add(new Symptom("Tiredness", 3 ));
        symptoms.add(new Symptom("Aches and pains", 4 ));
        symptoms.add(new Symptom("Sore throat", 2 ));
        symptoms.add(new Symptom("Diarrhea", 1 ));
        symptoms.add(new Symptom("Conjunctivitis", 1 ));
        symptoms.add(new Symptom("Headache", 1 ));
        symptoms.add(new Symptom("Loss of taste or smell", 5 ));
        symptoms.add(new Symptom("Rash on skin", 2 ));
        symptoms.add(new Symptom("Discolouration of fingers or toes", 3 ));
        symptoms.add(new Symptom("Difficulty breathing or shortness of breath", 5 ));
        symptoms.add(new Symptom("Chest pain or pressure", 4 ));
        symptoms.add(new Symptom("Loss of speech or movement", 5 ));

        symptomsList.setAdapter(new MyListAdapter());

        Button confirm = findViewById(R.id.ConfirmSymptomsBtn);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentRisk = calculateRisk();
                Toast.makeText(getApplicationContext(), "Current risk is: " + currentRisk + "%", Toast.LENGTH_SHORT).show();
            }
        });
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
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
                LayoutInflater infalter = LayoutInflater.from(getApplicationContext());

                convertView = infalter.inflate(R.layout.symptom_record, parent, false);

                TextView symptomName = convertView.findViewById(R.id.symptomName);
                RadioGroup btnGroup = convertView.findViewById(R.id.groupBtn);
                Symptom symptom = (Symptom) getItem(position);
                symptomName.setText(symptom.getName());
                btnGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @SuppressLint("NonConstantResourceId")
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                        switch (checkedId) {
                            case R.id.noSymptoms:
                                symptom.setSeverity(0);
                                //Toast.makeText(getApplicationContext(), "Set severity to 0 for: " + symptoms.get(position).getName(), Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.lowSymptoms:
                                symptom.setSeverity(1);
                                //Toast.makeText(getApplicationContext(), "Set severity to 1 for: " + symptoms.get(position).getName(), Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.mediumSymptoms:
                                symptom.setSeverity(2);
                                //Toast.makeText(getApplicationContext(), "Set severity to 2 for: " + symptoms.get(position).getName(), Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.highSymptoms:
                                symptom.setSeverity(3);
                                //Toast.makeText(getApplicationContext(), "Set severity to 3 for: " + symptoms.get(position).getName(), Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }
                });
            return convertView;
        }
    }
}
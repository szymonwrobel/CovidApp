package com.example.covidapp.ui.quarantine;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.covidapp.R;
import com.example.covidapp.model.QuarantineInfo;

import org.jetbrains.annotations.NotNull;

import java.util.Calendar;

public class QuarantineFragment extends Fragment implements DatePickerDialog.OnDateSetListener {

    private Context mContext;
    private Button addQuarantineBtn;
    private TextView quarantineEndDate;
    private QuarantineInfo quarantineInfo = new QuarantineInfo();

    @Override
    public void onAttach(@NotNull Context context){
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_quarantine, container, false);

        addQuarantineBtn = view.findViewById(R.id.addQuarantineBtn);
        if(quarantineInfo.isUserOnQuarantine()){
            addQuarantineBtn.setVisibility(View.INVISIBLE);
        }

        quarantineEndDate = view.findViewById(R.id.quarantineEndDate);
        quarantineEndDate.setVisibility(View.INVISIBLE);
        addQuarantineBtn.setOnClickListener(view1 -> displayDatePickerDialog());

        return view;
    }

    public void displayDatePickerDialog(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                mContext,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }


    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
        addQuarantineBtn.setVisibility(View.INVISIBLE);
        quarantineEndDate.setVisibility(View.VISIBLE);
        String date = year + "/" + month + 1 + "/" + dayOfMonth;
        quarantineEndDate.setText(date);
    }
}
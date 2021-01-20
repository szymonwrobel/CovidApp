package com.example.covidapp.ui.quarantine;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.covidapp.R;
import com.example.covidapp.model.QuarantineInfo;

import org.jetbrains.annotations.NotNull;

import java.util.Calendar;


public class QuarantineFragment extends Fragment implements DatePickerDialog.OnDateSetListener {

    private Context mContext;
    private Button addQuarantineBtn;
    private TextView quarantineInfoText;
    private TextView tipOfTheDay;
    private TextView tipOfTheDayConstText;
    private ImageView coronavirus;
    private TextView untilTheEndOfQuarantineText;

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        quarantineInfo.startQuarantine();

        View view = inflater.inflate(R.layout.fragment_quarantine, container, false);

        addQuarantineBtn = view.findViewById(R.id.addQuarantineBtn);
        quarantineInfoText = view.findViewById(R.id.quarantineInfoText);
        untilTheEndOfQuarantineText = view.findViewById(R.id.untilTheEndOfQuarantineText);
        tipOfTheDay = view.findViewById(R.id.tipOfTheDay);
        coronavirus = view.findViewById(R.id.coronavirusImageView);
        tipOfTheDayConstText = view.findViewById(R.id.tipOfTheDayConstText);
        untilTheEndOfQuarantineText.setText(getString(R.string.daysCounter, "" + QuarantineInfo.getDaysUntilTheEndOfQuarantine(), QuarantineInfo.returnDayOrDaysString()));
        tipOfTheDay.setText(QuarantineInfo.getDailyTip(requireContext()));

        if (QuarantineInfo.getIsUserOnQuarantine()) {
            addQuarantineBtn.setVisibility(View.INVISIBLE);
            quarantineInfoText.setVisibility(View.INVISIBLE);
            coronavirus.setVisibility(View.INVISIBLE);
            untilTheEndOfQuarantineText.setVisibility(View.VISIBLE);
            tipOfTheDay.setVisibility(View.VISIBLE);
            tipOfTheDayConstText.setVisibility(View.VISIBLE);
        }

        addQuarantineBtn.setOnClickListener(v -> {
            displayDatePickerDialog();
            addQuarantineBtn.setEnabled(false);
        });

        return view;
    }

    public void displayDatePickerDialog() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                mContext,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));

        datePickerDialog.getDatePicker().setMinDate((Calendar.getInstance().getTimeInMillis()));
        addQuarantineBtn.setEnabled(true);
        datePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(year, month, dayOfMonth);
        QuarantineInfo.startQuarantine(c);
        addQuarantineBtn.setVisibility(View.INVISIBLE);
        quarantineInfoText.setVisibility(View.INVISIBLE);
        coronavirus.setVisibility(View.INVISIBLE);
        untilTheEndOfQuarantineText.setText(getString(R.string.daysCounter, "" + QuarantineInfo.getDaysUntilTheEndOfQuarantine(), QuarantineInfo.returnDayOrDaysString()));
        tipOfTheDay.setText(QuarantineInfo.getDailyTip(requireContext()));
        untilTheEndOfQuarantineText.setVisibility(View.VISIBLE);
        tipOfTheDay.setVisibility(View.VISIBLE);
        tipOfTheDayConstText.setVisibility(View.VISIBLE);
    }
}
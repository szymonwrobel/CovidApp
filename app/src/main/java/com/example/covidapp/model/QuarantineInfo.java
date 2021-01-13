package com.example.covidapp.model;

import java.time.LocalDate;
import java.util.Date;

public class QuarantineInfo {

    private boolean userOnQuarantine = false;
    private LocalDate quarantineEndDate;

    public QuarantineInfo(){}

    public void startQuarantine(){
        userOnQuarantine = true;

    }

    public boolean isUserOnQuarantine() {
        return userOnQuarantine;
    }
}

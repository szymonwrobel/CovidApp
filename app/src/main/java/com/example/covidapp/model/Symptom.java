package com.example.covidapp.model;

public class Symptom {
    String name;
    int risk;
    int severity;

    public Symptom(String name, int risk) {
        this.name = name;
        this.risk = risk;

    }

    public String getName() {
        return name;
    }

    public int getRisk() {
        return risk;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }
}



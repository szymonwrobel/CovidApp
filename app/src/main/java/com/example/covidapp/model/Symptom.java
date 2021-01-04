package com.example.covidapp.model;

public class Symptom {
    String id;
    String name;
    int risk;
    int severity;

    public Symptom(String id, String name, int risk) {
        this.id = id;
        this.name = name;
        this.risk = risk;

    }

    public String getId() {
        return id;
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



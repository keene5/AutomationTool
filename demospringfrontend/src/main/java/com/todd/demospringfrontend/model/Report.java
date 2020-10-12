package com.todd.demospringfrontend.model;

import java.time.LocalDate;

public class Report {
    String scenarioId;
    String scenarioDescription;
    LocalDate dateRun;
    String jurisdiction;
    String ratingProgram;
    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getScenarioId() {
        return scenarioId;
    }

    public void setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
    }

    public String getScenarioDescription() {
        return scenarioDescription;
    }

    public void setScenarioDescription(String scenarioDescription) {
        this.scenarioDescription = scenarioDescription;
    }

    public LocalDate getDateRun() {
        return dateRun;
    }

    public void setDateRun(LocalDate dateRun) {
        this.dateRun = dateRun;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getRatingProgram() {
        return ratingProgram;
    }

    public void setRatingProgram(String ratingProgram) {
        this.ratingProgram = ratingProgram;
    }
}

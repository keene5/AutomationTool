package com.todd.demospringfrontend.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Report {
    protected Report() {
    }

    public Report(String scenarioId, String scenarioDescription, LocalDate dateRun,
                  String jurisdiction, String ratingProgram, String status) {
        this.scenarioId = scenarioId;
        this.dateRun = dateRun;
        this.scenarioDescription = scenarioDescription;
        this.jurisdiction = jurisdiction;
        this.ratingProgram = ratingProgram;
        this.status = status;
    }
    @Id
    @GeneratedValue
    private Long id;

    private String scenarioId;
    private String scenarioDescription;
    private LocalDate dateRun;
    private String jurisdiction;
    private String ratingProgram;
    private String status;

    public Long getId() {
        return id;
    }

    public String getScenarioId() {
        return scenarioId;
    }

    public String getScenarioDescription() {
        return scenarioDescription;
    }

    public LocalDate getDateRun() {
        return dateRun;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public String getRatingProgram() {
        return ratingProgram;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", scenarioId='" + scenarioId + '\'' +
                ", scenarioDescription='" + scenarioDescription + '\'' +
                ", dateRun=" + dateRun.toString() +
                ", jurisdiction='" + jurisdiction + '\'' +
                ", ratingProgram='" + ratingProgram + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

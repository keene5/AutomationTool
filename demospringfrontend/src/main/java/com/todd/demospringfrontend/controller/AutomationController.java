package com.todd.demospringfrontend.controller;

import com.todd.demospringfrontend.Entities.Report;
import com.todd.demospringfrontend.repositories.ReportRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("automation")
public class AutomationController {
    ReportRepository reportRepository;

    public AutomationController(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @GetMapping(value = "/report", produces = "application/json")
    public Iterable<Report>getReport() {
        Iterable<Report> reports = reportRepository.findAll();
        return reports;
    }
}

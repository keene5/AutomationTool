package com.todd.demospringfrontend.controller;

import com.todd.demospringfrontend.model.Report;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("automation")
public class AutomationController {

    @GetMapping(value = "/report", produces = "application/json")
    public Report getReport() {
        Report report = new Report();
        report.setName("New report");
        return report;
    }
}

package com.todd.demospringfrontend.controller;

import com.todd.demospringfrontend.Entities.Report;
import com.todd.demospringfrontend.Entities.ScenarioData;
import com.todd.demospringfrontend.dto.ScenarioDataRequest;
import com.todd.demospringfrontend.dto.ScenarioDataResponse;
import com.todd.demospringfrontend.repositories.ReportRepository;
import com.todd.demospringfrontend.repositories.ScenarioDataRepository;
import com.todd.demospringfrontend.repositories.ScopeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("automation")
public class AutomationController {

    ReportRepository reportRepository;
    ScenarioDataRepository scenarioDataRepository;
    ScopeRepository scopeRepository;

    public AutomationController(ReportRepository reportRepository,ScopeRepository scopeRepository,
                                ScenarioDataRepository scenarioDataRepository) {
        this.reportRepository = reportRepository;
        this.scopeRepository = scopeRepository;
        this.scenarioDataRepository = scenarioDataRepository;
    }

    @GetMapping(value = "/report", produces = "application/json")
    public Iterable<Report>getReport() {
        Iterable<Report> reports = reportRepository.findAll();
        return reports;
    }

    @PostMapping("/scenariodata")
    public ScenarioData setScenarioData(@RequestBody ScenarioDataRequest scenarioDataRequest) {
        return  scenarioDataRepository.save(scenarioDataRequest.getScenarioData());
    }

    @GetMapping("/getscenariodata")
    public ScenarioDataResponse getAllScenarioData() {
        ScenarioDataResponse scenarioDataResponse = new ScenarioDataResponse(scenarioDataRepository.findAll());
        return  scenarioDataResponse;
    }
}

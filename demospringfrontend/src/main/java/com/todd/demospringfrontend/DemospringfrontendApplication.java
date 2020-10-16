package com.todd.demospringfrontend;




//import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.todd.demospringfrontend.Entities.Report;

//import com.todd.demospringfrontend.Entities.ScenarioData;
//import com.todd.demospringfrontend.Entities.Scope;
import com.todd.demospringfrontend.Entities.ScenarioData;
import com.todd.demospringfrontend.Entities.Scope;
import com.todd.demospringfrontend.dto.ScenarioDataRequest;
import com.todd.demospringfrontend.repositories.ReportRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;
import java.util.Optional;

@SpringBootApplication
public class DemospringfrontendApplication extends SpringBootServletInitializer {
    //create a logger for this class so we can demo the JPA save
    private static final Logger log = LoggerFactory.getLogger(DemospringfrontendApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemospringfrontendApplication.class, args);
    }

    @Bean public CommandLineRunner demoDatabaseMethods(ReportRepository reportRepository){
        return (args) -> {


            Scope scope = new Scope(1,"NH", "Omega2");
            ScenarioData scenarioData = new ScenarioData(1,"207-123-123456", scope);
            ScenarioDataRequest scenarioDataRequest = new ScenarioDataRequest();
            scenarioDataRequest.setScenarioData(scenarioData);

            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(scenarioDataRequest);
            log.info(json);


//
//            ObjectMapper mapper = new ObjectMapper();
//            //Converting the Object to JSONString
//            String jsonString = mapper.writeValueAsString(scenarioData);
//            log.info(jsonString);


            LocalDate date = LocalDate.of(2020, Month.APRIL, 8);
            // save a few customers
            reportRepository.save(new Report("EarlyShopperV0", "Early Shopper is present when renewal",date,"IL","Omega2", "Pass", "1"));
            reportRepository.save(new Report("HomeOwnerV0", "HomeOwner is present when renewal",date,"IL","Omega2", "Pass","2"));
            reportRepository.save(new Report("AccidentForgivenessV0", "AccidentForgiveness is present when renewal",date,"IL","Omega2", "Pass","1"));


            // fetch all customers
            log.info("Scenarios found with findAll():");
            log.info("-------------------------------");
            for (Report report : reportRepository.findAll()) {
                log.info(report.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Optional<Report> oneReportById = reportRepository.findById(1L);
            log.info("Report found with findById(1L):");
            log.info("--------------------------------");
            log.info(oneReportById.get().toString());
            log.info("");

        };
    }
    }




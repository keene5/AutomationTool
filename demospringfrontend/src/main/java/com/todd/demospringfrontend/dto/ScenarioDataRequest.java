package com.todd.demospringfrontend.dto;

import com.todd.demospringfrontend.Entities.ScenarioData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ScenarioDataRequest {
    private ScenarioData scenarioData;
}

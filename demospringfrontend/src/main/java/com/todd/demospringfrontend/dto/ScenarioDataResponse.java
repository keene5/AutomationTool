package com.todd.demospringfrontend.dto;

import com.todd.demospringfrontend.Entities.ScenarioData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ScenarioDataResponse {

    private List<ScenarioData> scenarioDataList;
}

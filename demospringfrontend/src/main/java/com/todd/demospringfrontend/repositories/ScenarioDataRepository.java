package com.todd.demospringfrontend.repositories;

import com.todd.demospringfrontend.Entities.ScenarioData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScenarioDataRepository extends JpaRepository<ScenarioData, Integer> {
}

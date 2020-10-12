package com.todd.demospringfrontend.repositories;

import com.todd.demospringfrontend.Entities.Report;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ReportRepository extends CrudRepository<Report,Long> {

    Optional<Report> findById(Long id);
}

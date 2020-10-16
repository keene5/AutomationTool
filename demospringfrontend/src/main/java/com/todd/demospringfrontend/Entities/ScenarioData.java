package com.todd.demospringfrontend.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString

@Table(name = "scenariodata")
public class ScenarioData {

    @Id
    @GeneratedValue
    private int id;
    private String phone;
    @OneToOne(targetEntity = Scope.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "sd_fk",referencedColumnName = "id")
    private Scope scope;
}


package com.fleet.fleetcheck.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InspectionResult {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String inspectionName;
    private String result;

    public InspectionResult(String inspectionName, String result) {
        this.inspectionName = inspectionName;
        this.result = result;
    }

    public String getInspectionName() {
        return inspectionName;
    }

    public void setInspectionName(String inspectionName) {
        this.inspectionName = inspectionName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

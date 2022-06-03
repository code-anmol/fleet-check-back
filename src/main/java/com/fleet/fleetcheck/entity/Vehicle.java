package com.fleet.fleetcheck.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private String unitNumber;

    @OneToMany(cascade = CascadeType.ALL)
    List<InspectionReport> inspectionReports;

    public Vehicle() {
    }
    public Vehicle(String unitNumber, List<InspectionReport> inspectionReports) {
        this.inspectionReports = inspectionReports;
        this.unitNumber = unitNumber;
    }

    public Vehicle( String unitNumber) {
        this.unitNumber = unitNumber;
    }



    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public InspectionReport addInspectionReport(InspectionReport inspectionReport){
        inspectionReports.add(inspectionReport);
        return inspectionReport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<InspectionReport> getInspectionReports() {
        return inspectionReports;
    }

    public void setInspectionReports(List<InspectionReport> inspectionReports) {
        this.inspectionReports = inspectionReports;
    }


}

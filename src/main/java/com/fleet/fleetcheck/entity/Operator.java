package com.fleet.fleetcheck.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Operator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String tagNumber;

    @OneToMany(cascade = CascadeType.ALL)
    private List<InspectionReport> inspectionReports;

    public Operator(String name, String tagNumber, List<InspectionReport> inspectionReports) {
        this.name = name;
        this.tagNumber = tagNumber;
        this.inspectionReports = inspectionReports;
    }

    public Operator() {
    }

    public Operator(String tagNumber) {

        this.tagNumber = tagNumber;
    }

    public List<InspectionReport> getInspectionReports() {
        return inspectionReports;
    }

    public void setInspectionReports(List<InspectionReport> inspectionReports) {
        this.inspectionReports = inspectionReports;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTagNumber() {
        return tagNumber;
    }

    public void setTagNumber(String tagNumber) {
        this.tagNumber = tagNumber;
    }

    public InspectionReport addInspectionReport(InspectionReport inspectionReport){
        inspectionReports.add(inspectionReport);
        return inspectionReport;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tagNumber='" + tagNumber + '\'' +
                ", inspectionReports=" + inspectionReports +
                '}';
    }
}

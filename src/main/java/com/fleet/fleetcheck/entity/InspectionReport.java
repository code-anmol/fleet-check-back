package com.fleet.fleetcheck.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class InspectionReport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Operator operator;

    @ManyToOne(cascade = CascadeType.ALL)
    private Vehicle vehicle;



    @OneToMany(cascade = CascadeType.ALL)
    private List<InspectionResult> inspectionResults;
    private String isPreOrPost;


    public InspectionReport() {
    }

    public InspectionReport(Operator operator, Vehicle vehicle, String isPreOrPost, List<InspectionResult> inspectionResults) {
        this.operator = operator;
        this.vehicle = vehicle;
        this.isPreOrPost = isPreOrPost;
        this.inspectionResults = inspectionResults;
    }



    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getIsPreOrPost() {
        return isPreOrPost;
    }

    public void setIsPreOrPost(String isPreOrPost) {
        this.isPreOrPost = isPreOrPost;
    }

    public List<InspectionResult> getInspectionResults() {
        return inspectionResults;
    }

    public void setInspectionResults(List<InspectionResult> inspectionResults) {
        this.inspectionResults = inspectionResults;
    }
}

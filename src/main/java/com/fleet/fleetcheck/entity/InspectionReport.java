package com.fleet.fleetcheck.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class InspectionReport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;



    @OneToMany(cascade = CascadeType.ALL)
    private List<InspectionResult> inspectionResults;
    private String comment;

    private Date date;



    public InspectionReport() {
    }

    public InspectionReport(String comment, List<InspectionResult> inspectionResults) {

        this.comment = comment;
        this.inspectionResults = inspectionResults;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<InspectionResult> getInspectionResults() {
        return inspectionResults;
    }

    public void setInspectionResults(List<InspectionResult> inspectionResults) {
        this.inspectionResults = inspectionResults;
    }

    @Override
    public String toString() {
        return "InspectionReport{" +
                "id=" + id +
                ", inspectionResults=" + inspectionResults +
                ", isPreOrPost='" + comment + '\'' +
                "} /n";
    }



}

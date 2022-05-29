package com.fleet.fleetcheck.dto;

import com.fleet.fleetcheck.entity.InspectionResult;

import java.util.List;

public class InspectionReportDto {

    List<InspectionResult> inspectionResults;
    String operatorTagNumber;
    String vehicleNumber;

    String isPreOrPost;

    public InspectionReportDto(List<InspectionResult> inspectionResults, String operatorTagNumber, String vehicleNumber, String isPreOrPost) {
        this.inspectionResults = inspectionResults;
        this.operatorTagNumber = operatorTagNumber;
        this.vehicleNumber = vehicleNumber;
        this.isPreOrPost = isPreOrPost;
    }



    public InspectionReportDto() {
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

    public String getOperatorTagNumber() {
        return operatorTagNumber;
    }

    public void setOperatorTagNumber(String operatorNumber) {
        this.operatorTagNumber = operatorNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public String toString() {
        return "InspectionReportDto{" +
                "inspectionDtoList=" + inspectionResults +
                ", operatorTagNumber='" + operatorTagNumber + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                '}';
    }
}

package com.fleet.fleetcheck.dto;

import com.fleet.fleetcheck.entity.InspectionResult;

import java.util.List;

public class InspectionReportDto {

    private List<InspectionResult> inspectionResults;
    private String operatorTagNumber;
    private String vehicleUnitNumber;
    private String operatorName;
    private String comment;

    public InspectionReportDto(List<InspectionResult> inspectionResults, String operatorTagNumber, String vehicleUnitNumber, String operatorName, String comment) {
        this.inspectionResults = inspectionResults;
        this.operatorTagNumber = operatorTagNumber;
        this.vehicleUnitNumber = vehicleUnitNumber;
        this.operatorName = operatorName;
        this.comment = comment;
    }

    public InspectionReportDto() {
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
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

    public String getOperatorTagNumber() {
        return operatorTagNumber;
    }

    public void setOperatorTagNumber(String operatorNumber) {
        this.operatorTagNumber = operatorNumber;
    }

    public String getVehicleUnitNumber() {
        return vehicleUnitNumber;
    }

    public void setVehicleUnitNumber(String vehicleUnitNumber) {
        this.vehicleUnitNumber = vehicleUnitNumber;
    }

    @Override
    public String toString() {
        return "InspectionReportDto{" +
                "inspectionDtoList=" + inspectionResults +
                ", operatorTagNumber='" + operatorTagNumber + '\'' +
                ", vehicleNumber='" + vehicleUnitNumber + '\'' +
                '}';
    }

}

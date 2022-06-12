package com.fleet.fleetcheck.controller;

import com.fleet.fleetcheck.dto.InspectionReportDto;
import com.fleet.fleetcheck.service.InspectionReportService;
import org.springframework.web.bind.annotation.*;

@RestController
public class InspectionFormController {

    public final InspectionReportService inspectionReportService;

    public InspectionFormController(InspectionReportService inspectionReportService) {
        this.inspectionReportService = inspectionReportService;
    }

    @GetMapping("/v1/getform/")
    public InspectionReportDto getInspectionType(@RequestParam int vehicleID){

        InspectionReportDto inspectionReport = inspectionReportService.createInspectionReport(vehicleID);
        return inspectionReport;

    }

    @PostMapping("/v1/saveInspectionReport/")
    public void saveInspectionReport(@RequestBody InspectionReportDto inspectionReportDto){
        System.out.println(inspectionReportDto);
        inspectionReportService.saveInspectionReport(inspectionReportDto);

    }

}

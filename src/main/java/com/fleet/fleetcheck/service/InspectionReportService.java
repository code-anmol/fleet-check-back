package com.fleet.fleetcheck.service;

import com.fleet.fleetcheck.dto.InspectionReportDto;
import com.fleet.fleetcheck.entity.*;
import com.fleet.fleetcheck.mapper.InspectionReportMapper;
import com.fleet.fleetcheck.repository.InspectionReportRepository;
import com.fleet.fleetcheck.repository.VehicleTypeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InspectionReportService {

    public final VehicleTypeRepository vehicleTypeRepository;
    public final InspectionReportRepository inspectionReportRepository;

    public InspectionReportService(VehicleTypeRepository vehicleTypeRepository, InspectionReportRepository inspectionReportRepository) {
        this.vehicleTypeRepository = vehicleTypeRepository;
        this.inspectionReportRepository = inspectionReportRepository;
    }

    public InspectionReportDto createInspectionReport(int vehicleId){
        List<InspectionType> inspectionTypes = vehicleTypeRepository.getReferenceById(vehicleId).getInspectionTypes();
        InspectionReportDto inspectionReportDto = new InspectionReportDto();

      List<InspectionResult> inspectionResults = new ArrayList<InspectionResult>();

        for (InspectionType inspectionType: inspectionTypes) {
            inspectionResults.add(new InspectionResult(inspectionType.getName(), ""));
        }


        inspectionReportDto.setInspectionResults(inspectionResults);

        return inspectionReportDto;
    }

    public void saveInspectionReport(InspectionReportDto inspectionReportDto) {
        InspectionReport inspectionReport = InspectionReportMapper.INSTANCE.getEntity(inspectionReportDto);
        inspectionReportRepository.save(inspectionReport);

    }
}

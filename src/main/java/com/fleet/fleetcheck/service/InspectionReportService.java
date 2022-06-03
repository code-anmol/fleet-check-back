package com.fleet.fleetcheck.service;

import com.fleet.fleetcheck.dto.InspectionReportDto;
import com.fleet.fleetcheck.entity.*;
import com.fleet.fleetcheck.mapper.InspectionReportMapper;
import com.fleet.fleetcheck.repository.InspectionReportRepository;
import com.fleet.fleetcheck.repository.OperatorRepository;
import com.fleet.fleetcheck.repository.VehicleRepository;
import com.fleet.fleetcheck.repository.VehicleTypeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InspectionReportService {

    public final VehicleTypeRepository vehicleTypeRepository;
    public final InspectionReportRepository inspectionReportRepository;

    public final VehicleRepository vehicleRepository;

    public final OperatorRepository operatorRepository;

    public InspectionReportService(VehicleTypeRepository vehicleTypeRepository, InspectionReportRepository inspectionReportRepository, VehicleRepository vehicleRepository, OperatorRepository operatorRepository) {
        this.vehicleTypeRepository = vehicleTypeRepository;
        this.inspectionReportRepository = inspectionReportRepository;
        this.vehicleRepository = vehicleRepository;
        this.operatorRepository = operatorRepository;
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


        String operatorName = inspectionReportDto.getOperatorName();
        String operatorTagNumber = inspectionReportDto.getOperatorTagNumber();
        String unitNumber = inspectionReportDto.getVehicleUnitNumber();

        Operator operator = operatorRepository.findByTagNumber(operatorTagNumber);
        Vehicle vehicle = vehicleRepository.findByUnitNumber(unitNumber);


        if(operator == null)
            operator = new Operator(operatorName,operatorTagNumber,new ArrayList<>());

        if(vehicle == null)
            vehicle = new Vehicle(unitNumber, new ArrayList<>());

        operator.addInspectionReport(inspectionReport);
        vehicle.addInspectionReport(inspectionReport);
        inspectionReportRepository.save(inspectionReport);
        operatorRepository.save(operator);
        vehicleRepository.save(vehicle);


    }
}

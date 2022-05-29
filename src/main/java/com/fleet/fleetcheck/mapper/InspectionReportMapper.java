package com.fleet.fleetcheck.mapper;

import com.fleet.fleetcheck.dto.InspectionReportDto;
import com.fleet.fleetcheck.entity.InspectionReport;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper
public interface InspectionReportMapper {

//    VehicleTypeMapper INSTANCE = Mappers.getMapper(VehicleTypeMapper.class);

    InspectionReportMapper INSTANCE = Mappers.getMapper(InspectionReportMapper.class);

    @Mapping(source = "operatorTagNumber" , target = "operator.tagNumber")
    @Mapping(source = "vehicleNumber" , target = "vehicle.unitNumber")
    @Mapping(source = "isPreOrPost" , target = "isPreOrPost")
    @Mapping(source = "inspectionResults", target = "inspectionResults")
    public InspectionReport getEntity(InspectionReportDto inspectionReportDto);
}

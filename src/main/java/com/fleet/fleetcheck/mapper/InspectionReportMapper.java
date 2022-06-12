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


    @Mapping(source = "comment", target = "comment")
    @Mapping(source = "inspectionResults", target = "inspectionResults")
    @Mapping(source = "date", target = "date")
    public InspectionReport getEntity(InspectionReportDto inspectionReportDto);
}

package com.fleet.fleetcheck.mapper;

import com.fleet.fleetcheck.entity.VehicleType;
import com.fleet.fleetcheck.dto.VehicleTypeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VehicleTypeMapper {
    VehicleTypeMapper INSTANCE = Mappers.getMapper(VehicleTypeMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    public VehicleTypeDto toDto(VehicleType vehicleType);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "id", target = "id")
    public VehicleType toEntity(VehicleTypeDto vehicleTypeDto);
}

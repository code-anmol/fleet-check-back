package com.fleet.fleetcheck.service;

import com.fleet.fleetcheck.dto.VehicleTypeDto;
import com.fleet.fleetcheck.mapper.VehicleTypeMapper;
import com.fleet.fleetcheck.repository.VehicleTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehicleTypeService {

    private final VehicleTypeRepository vehicleTypeRepository;

    public VehicleTypeService(VehicleTypeRepository vehicleTypeRepository){
        this.vehicleTypeRepository = vehicleTypeRepository;

    }

    public List<VehicleTypeDto> getAllVehicleTypeDto(){
        List<VehicleTypeDto> vehicleTypeDtos = vehicleTypeRepository.findAll()
                                                .stream()
                                                .map(vehicleType -> VehicleTypeMapper.INSTANCE.toDto(vehicleType))
                                                .collect(Collectors.toList());
        return  vehicleTypeDtos;

    }


}

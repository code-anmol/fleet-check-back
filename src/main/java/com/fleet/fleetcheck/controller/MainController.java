package com.fleet.fleetcheck.controller;

import com.fleet.fleetcheck.dto.VehicleTypeDto;
import com.fleet.fleetcheck.entity.VehicleType;
import com.fleet.fleetcheck.service.VehicleTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final VehicleTypeService vehicleTypeService;

    public MainController(VehicleTypeService vehicleTypeService ){
        this.vehicleTypeService = vehicleTypeService;

    }

    @GetMapping("/v1/home")
    public List<VehicleTypeDto> getVehicleTypes(){
        List<VehicleTypeDto> allVehicleTypeDto = vehicleTypeService.getAllVehicleTypeDto();
        System.out.print(allVehicleTypeDto.size());

        return allVehicleTypeDto;
    }
}

package com.fleet.fleetcheck.controller;

import com.fleet.fleetcheck.dto.VehicleTypeDto;
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

    @GetMapping("/v1/inspection")
    public List<VehicleTypeDto> getVehicleTypes(){
        List<VehicleTypeDto> allVehicleTypeDto = vehicleTypeService.getAllVehicleTypeDto();

        return allVehicleTypeDto;
    }

    @GetMapping("/")
    public void api(){
        System.out.println("method is accesses");
    }

}

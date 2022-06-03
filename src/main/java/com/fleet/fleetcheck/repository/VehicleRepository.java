package com.fleet.fleetcheck.repository;

import com.fleet.fleetcheck.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

    Vehicle findByUnitNumber(String unitNumber);
}

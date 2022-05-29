package com.fleet.fleetcheck.repository;

import com.fleet.fleetcheck.entity.InspectionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InspectionTypeRepository extends JpaRepository<InspectionType, Integer> {
}

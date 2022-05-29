package com.fleet.fleetcheck.repository;

import com.fleet.fleetcheck.entity.InspectionReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InspectionReportRepository extends JpaRepository<InspectionReport , Integer> {
}

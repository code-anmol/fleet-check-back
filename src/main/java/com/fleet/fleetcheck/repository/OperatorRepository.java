package com.fleet.fleetcheck.repository;

import com.fleet.fleetcheck.entity.Operator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperatorRepository extends JpaRepository<Operator, Integer> {

     Operator findByTagNumber(String name);
}

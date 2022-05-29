package com.fleet.fleetcheck;

import com.fleet.fleetcheck.entity.InspectionType;
import com.fleet.fleetcheck.entity.VehicleType;
import com.fleet.fleetcheck.repository.InspectionTypeRepository;
import com.fleet.fleetcheck.repository.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FleetCheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleetCheckApplication.class, args);
	}

//	@Component
//	public class MyRunner implements CommandLineRunner {
//
//		@Autowired
//		private InspectionTypeRepository inspectionTypeRepository;
//		@Autowired
//		private VehicleTypeRepository vehicleTypeRepository;
//
//		@Override
//		public void run(String... args) throws Exception {
//
//			VehicleType car = new VehicleType("CAR");
//			VehicleType pickup = new VehicleType("PICKUP TRUCK");
//			VehicleType suv = new VehicleType("SUV");
//
//
//			List<InspectionType> inspectionTypeCar = new ArrayList<>();
//			inspectionTypeCar.add(new InspectionType("BRAKES"));
//			inspectionTypeCar.add(new InspectionType("WINDOWS"));
//			inspectionTypeCar.add(new InspectionType("LAMPS"));
//			inspectionTypeCar.add(new InspectionType("WHEELS"));
//			inspectionTypeCar.add(new InspectionType("LIGHTS"));
//			inspectionTypeCar.add(new InspectionType("REFLECTORS"));
//			inspectionTypeCar.add(new InspectionType("ALARMS"));
//			inspectionTypeCar.add(new InspectionType("CONTROLS"));
//			inspectionTypeCar.add(new InspectionType("WIRING"));
//			inspectionTypeCar.add(new InspectionType("Air Brake System"));
//			inspectionTypeCar.add(new InspectionType("Electric Brake System"));
//			inspectionTypeCar.add(new InspectionType("Hydraulic Brake System"));
//			inspectionTypeCar.add(new InspectionType("Pedal"));
//			inspectionTypeCar.add(new InspectionType("Compressor"));
//
//			car.setInspectionTypes(inspectionTypeCar);
//
//			vehicleTypeRepository.save(car);
//			vehicleTypeRepository.save(pickup);
//			vehicleTypeRepository.save(suv);
//		}
//	}

}

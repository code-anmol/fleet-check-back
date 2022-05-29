package com.fleet.fleetcheck.entity;

import javax.persistence.*;
import java.util.List;


@Entity
public class VehicleType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<InspectionType> inspectionTypes;

    public VehicleType(){

    }

    public VehicleType(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<InspectionType> getInspectionTypes() {
        return inspectionTypes;
    }

    public void setInspectionTypes(List<InspectionType> inspectionTypes) {
        this.inspectionTypes = inspectionTypes;
    }
}

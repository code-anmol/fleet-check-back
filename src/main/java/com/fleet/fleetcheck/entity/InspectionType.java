package com.fleet.fleetcheck.entity;

import javax.persistence.*;

@Entity
public class InspectionType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;



    public InspectionType(){

    }

    public  InspectionType(String name){
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

    @Override
    public String toString() {
        return "InspectionType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

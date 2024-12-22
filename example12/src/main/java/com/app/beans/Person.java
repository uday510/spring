package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

//    @Autowired
    private Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {
        System.out.println("Person Bean Created");
        this.vehicle = vehicle;
    }

    private String name = "Human Being🧍";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    @Autowired(required = false)
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}

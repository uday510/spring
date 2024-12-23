package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="personBean")
public class Person {

    private final String name = "Human Being🧍";
    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }


    public Vehicle getVehicle() {
        return vehicle;
    }

}

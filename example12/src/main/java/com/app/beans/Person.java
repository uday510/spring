package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Human Being🧍";
    private final Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("vehicle1") Vehicle vehicle) {
        System.out.println("Person Bean Created");
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }


    public Vehicle getVehicle() {
        return vehicle;
    }

}

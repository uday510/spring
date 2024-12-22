package com.app.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name = "Vehicle🚗";

    public Vehicle() {
        System.out.println("Vehicle Bean Created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

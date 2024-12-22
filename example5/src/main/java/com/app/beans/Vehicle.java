package com.app.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initialize() { this.name = "Vehicle 1"; }

    public void printGreeting() {
        System.out.println("Hello, World!");
    }
}

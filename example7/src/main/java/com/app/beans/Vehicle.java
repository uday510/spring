package com.app.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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
    public void initialize() {
        this.name = "Vehicle 1";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Vehicle destroyed");
    }

    public void printGreeting() {
        System.out.println("Hello, World!");
    }
}

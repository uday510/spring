package com.app.beans;

public class Vehicle {

    private String name;

    public Vehicle() {
        System.out.println("Vehicle Bean Created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printGreeting() {
        System.out.println("Hello, World!");
    }


}

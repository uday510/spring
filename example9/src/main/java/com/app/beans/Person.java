package com.app.beans;

public class Person {

    public Person() {
        System.out.println("Person Bean Created");
    }

    private String name;
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Vehicle: " + vehicle);
    }

}

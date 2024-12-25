package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="personBean")
@Scope(BeanDefinition.SCOPE_SINGLETON)
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

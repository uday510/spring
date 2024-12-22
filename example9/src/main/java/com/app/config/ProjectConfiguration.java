package com.app.config;

import com.app.beans.Person;
import com.app.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {

    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Vehicle 1");

        return vehicle;
    }

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("Person 1");
        person.setVehicle(vehicle());

        return person;
    }

}

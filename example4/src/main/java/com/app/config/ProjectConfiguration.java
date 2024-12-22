package com.app.config;

import com.app.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfiguration {

    @Bean(name="vehicle1")
    Vehicle Vehicle1() {
        var vehicle = new Vehicle();
        vehicle.setName("Vehicle 1");

        return vehicle;
    }

    @Bean(value="vehicle2")
    Vehicle Vehicle2() {
        var vehicle = new Vehicle();
        vehicle.setName("Vehicle 2");

        return vehicle;
    }

    @Primary
    @Bean("vehicle3")
    Vehicle Vehicle3() {
        var vehicle = new Vehicle();
        vehicle.setName("Vehicle 3");

        return vehicle;
    }

}

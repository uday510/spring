package com.app.config;

import com.app.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfiguration {

    @Primary
    @Bean
    Vehicle Vehicle1() {
        var vehicle = new Vehicle();
        vehicle.setName("Vehicle 1");

        return vehicle;
    }

    @Bean
    Vehicle Vehicle2() {
        var vehicle = new Vehicle();
        vehicle.setName("Vehicle 1");

        return vehicle;
    }

    @Bean
    Vehicle Vehicle3() {
        var vehicle = new Vehicle();
        vehicle.setName("Vehicle 1");

        return vehicle;
    }

}

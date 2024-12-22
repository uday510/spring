package com.app.config;

import com.app.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {

    @Bean
    Vehicle Vehicle() {
        var vehicle = new Vehicle();
        vehicle.setName("Vehicle 1");

        return vehicle;
    }

    @Bean
    Integer number() {
        return 10;
    }

    @Bean
    String greeting() {
        return "Hello! World!";
    }
}

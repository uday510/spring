package com.app.config;

import com.app.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages =  "com.app.beans")
public class ProjectConfiguration {

    @Bean
    Vehicle vehicle1() {
        var vehicle = new Vehicle();
        vehicle.setName("Vehicle 1");

        return vehicle;
    }

    @Bean
    Vehicle vehicle2() {
        var vehicle = new Vehicle();
        vehicle.setName("Vehicle 2");

        return vehicle;
    }

    @Bean
    @Primary
    Vehicle vehicle3() {
         var vehicle = new Vehicle();
         vehicle.setName("Vehicle 3");

         return vehicle;
     }
}

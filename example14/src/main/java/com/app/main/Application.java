package com.app.main;

import com.app.config.ProjectConfiguration;
import com.app.services.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        VehicleService vehicleService1 = context.getBean(VehicleService.class);
        VehicleService vehicleService2 = context.getBean(VehicleService.class);

        System.out.println("Hash code of vehicleService1: " + vehicleService1.hashCode());
        System.out.println("Hash code of vehicleService2: " + vehicleService2.hashCode());
    }
}

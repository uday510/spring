package com.app.main;

import com.app.beans.Vehicle;
import com.app.config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Vehicle 1");

        System.out.println("Java POJO : " + vehicle.getName());



        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Vehicle vehicle2 = context.getBean(Vehicle.class);

        System.out.println("Java Spring Context : " + vehicle2.getName());


    }
}

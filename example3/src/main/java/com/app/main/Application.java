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

        Vehicle vehicle2 = context.getBean("vehicle1", Vehicle.class);

        System.out.println("Spring Context : " + vehicle2.getName());


    }
}

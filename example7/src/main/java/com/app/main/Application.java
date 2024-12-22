package com.app.main;

import com.app.beans.Vehicle;
import com.app.config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Vehicle vehicle = context.getBean(Vehicle.class);

        System.out.println("Spring Context : " + vehicle.getName());

        vehicle.printGreeting();
        context.close();

    }
}

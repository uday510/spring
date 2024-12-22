package com.app.main;

import com.app.beans.Vehicle;
import com.app.config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("beans.xml");

        Vehicle vehicle = context.getBean(Vehicle.class);

        System.out.println("Spring Context : " + vehicle.getName());

        vehicle.printGreeting();
        context.close();

    }
}

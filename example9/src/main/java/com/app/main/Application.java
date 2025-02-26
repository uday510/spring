package com.app.main;

import com.app.beans.Person;
import com.app.beans.Vehicle;
import com.app.config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        System.out.println("Person Name From Spring Context: " + person.getName());
        System.out.println("Vehicle Name From Spring Context: " + vehicle.getName());
        System.out.println("Vehicle Owned by Person: " + person.getVehicle().getName());

    }
}

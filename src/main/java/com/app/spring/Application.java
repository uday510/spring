package com.app.spring;

import com.app.spring.beans.Vehicle;
import com.app.spring.config.ProjectConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Car");
        System.out.println("Vehicle name: " + vehicle.getName());

        /**
         *  The var keyword was introduced in Java 10. Type inference is used in
         *  var keyword in which it detects automatically the datatype of a variable
         *  based on the surrounding context.
         */

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Context: " + context);

        Vehicle vehicle1 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from the spring context: " + vehicle1.getName());

        /**
         *   We don’t need to do any explicit casting while fetching a bean from context.
         *   Spring is smart enough to look for a bean of the type you requested in its context.
         *   If such a bean doesn’t exist,Spring will throw an exception.
         */

        String hello = context.getBean(String.class);
        System.out.println("Hello from the spring context: " + hello);
        Integer number = context.getBean(Integer.class);
        System.out.println("Number from the spring context: " + number);

    }

}

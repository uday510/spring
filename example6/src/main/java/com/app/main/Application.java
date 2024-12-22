package com.app.main;

import com.app.beans.Vehicle;
import com.app.config.ProjectConfiguration;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Application {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setName("Vehicle 1");
        Supplier<Vehicle> vehicle1Supplier = () -> vehicle1;

        Supplier<Vehicle> vehicle2Supplier = () -> {
            Vehicle vehicle2 = new Vehicle();
            vehicle2.setName("Vehicle 2");

            return vehicle2;
       };

        Random random = new Random();
        int randomInt = random.nextInt(100);

         System.out.println("Random : " + randomInt);

         if (randomInt % 2 == 0) {
            context.registerBean("vehicle1", Vehicle.class, vehicle1Supplier);
         } else {
            context.registerBean("vehicle2", Vehicle.class, vehicle2Supplier);
         }

         Vehicle v1 = null;
         Vehicle v2 = null;

         try {
            v1 = context.getBean("vehicle1", Vehicle.class);
         } catch (NoSuchBeanDefinitionException e) {
            e.printStackTrace();
         }

         try {
            v2 = context.getBean("vehicle2", Vehicle.class);
         } catch (NoSuchBeanDefinitionException e) {
            e.printStackTrace();
         }

         if (v1 != null) {
            System.out.println(v1.getName());
         } else if (v2 != null) {
            System.out.println(v2.getName());
         }

    }
}

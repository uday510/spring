package com.app.main;

import com.app.beans.Person;
import com.app.config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        System.out.println("Context created...");
        Person person = context.getBean(Person.class);
        System.out.println("After retrieving person bean...");

    }
}

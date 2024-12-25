package com.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.app.services", "com.app.services.implementation"})
@ComponentScan(basePackageClasses = {com.app.beans.Vehicle.class, com.app.beans.Person.class})
public class ProjectConfiguration {

}

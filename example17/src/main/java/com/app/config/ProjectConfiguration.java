package com.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.app.services", "com.app.services.implementation", "com.app.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfiguration {

}

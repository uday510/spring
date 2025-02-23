package com.app.example20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Example18Application {

    public static void main(String[] args) {
        SpringApplication.run(Example18Application.class, args);
    }

}

package com.northcoders;

import controllers.CityController;
import controllers.PersonController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.northcoders.controller", "com.northcoders.model", "forecast.City"})
public class DemoSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBootApplication.class, args);
        SpringApplication.run(PersonController.class, args);
        SpringApplication.run(CityController.class, args);
    }

}

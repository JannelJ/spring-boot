package com.northcoders.controller;


import com.northcoders.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello there!";
    }

    @RestController
    @RequestMapping("api/v1")

    Person person = new Person("Jannel", 23,
            "my@house.com", "UK", "mushroom");

}

package controllers;


import com.northcoders.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/v1")
public class PersonController {


    @GetMapping("/person")
    public List<Person> getPerson() {

        Person person1 = new Person("Jannel", 23, "my@house.com",
                "UK", "mushroom");
        Person person2 = new Person("Maya", 25, "her@email.com",
                "Vietnam", "Broccoli" );

        return List.of(person1, person2);
    }
}

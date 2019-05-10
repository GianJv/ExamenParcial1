package com.parcial.examen.controller;

import com.parcial.examen.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    private final List<Person> listPerson;
    @PostMapping("/save")
    public String postSavePerson(@RequestBody Integer id, @RequestBody String name, @RequestBody String last_name,
                                 @RequestBody String dni, @RequestBody String mobile){
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setLast_name(last_name);
        person.setDni(dni);
        person.setMobile(mobile);

        listPerson.add(person);
        return "saved successfully";
    }
    public String postUpdatePerson(@RequestBody Integer id, @RequestBody String name, @RequestBody String last_name,
                                   @RequestBody String dni, @RequestBody String mobile) {

        for (Person person1 :
                listPerson) {
            if (person1.getDni().equals(dni)) {
                person1.setId(id);
                person1.setName(name);
                person1.setLast_name(last_name);
                person1.setMobile(mobile);
            }

        }
        return "saved successfully";
    }
}
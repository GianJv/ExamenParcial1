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
    @PostMapping("/agregar")
    public String postSavePerson(@RequestBody Integer id, @RequestBody String name, @RequestBody String last_name,
                                 @RequestBody String dni, @RequestBody String mobile){
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setLast_name(last_name);
        person.setDni(dni);
        person.setMobile(mobile);
        return "saved successfully";

        listPerson.add(person);
        return "saved successfully";

    }
    @GetMapping("/view")
    public List<Person> getViewPerson(){

        return listPerson;
    }
}


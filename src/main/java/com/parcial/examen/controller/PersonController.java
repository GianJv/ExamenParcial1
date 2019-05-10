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
                                 @RequestBody String dni, @RequestBody String mobile, @RequestBody String a, @RequestBody String i){
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setLast_name(last_name);
        person.setDni(dni);
        person.setMobile(mobile);
        person.setMobile(a);
        
        listPerson.add(person);
        return "saved successfully";
    }
    @GetMapping("/view")
    public List<Person> getViewPerson(){

        return listPerson;
    }
    @PostMapping("/update")
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
    @PostMapping("/delete")
    public String postDeletePerson(@RequestBody String dni) {

        for (Person person1 :
                listPerson) {
            if (person1.getDni().equals(dni)) {
                listPerson.remove(person1);
            }

        }
        return "delete successfully";
    }
}

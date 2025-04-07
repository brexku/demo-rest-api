package com.restapi.demorestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.demorestapi.model.Person;
import com.restapi.demorestapi.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired

    PersonService personService;

    @GetMapping("getAll")
    public List<Person> getAllPersons() {
        System.out.println("YYYYYYYYYYYYYYYYYYYYYYYYYYYYYY___________________YYYYYYYYYYYYYYYYY");
        return personService.getAllPersons();

    }

    @GetMapping("{id}")
    public Person getPersonById(@PathVariable("personId") int personId) {
        return personService.getPersonById(personId);
    }

    @PostMapping("insert")
    public void insertPerson(Person person) {
        personService.insertPerson(person);
    }

    @PutMapping("{personId}")
    public void updatePerson(@PathVariable("personId") int personId) {
        personService.updatePerson(personId);
    }

    @DeleteMapping("{personId}")
    public void deletePerson(@PathVariable("personId") int personId) {
        personService.deletePerson(personId);
    }

}

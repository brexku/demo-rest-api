package com.restapi.demorestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restapi.demorestapi.mapper.PersonMapper;
import com.restapi.demorestapi.model.Person;

@Service
public class PersonService {

    @Autowired
    PersonMapper personMapper;

    public List<Person> getAllPersons() {
        return personMapper.getAllPersons();
    }

    public Person getPersonById(int personId) {
        return personMapper.getPersonById(personId);

    }

    public Person insertPerson(Person person) {
        return personMapper.insertPerson(person);
    }

    public void updatePerson(int personId) {
        personMapper.updatePerson(personId);
    }

    public void deletePerson(int personId) {
        personMapper.deletePerson(personId);
    }

}
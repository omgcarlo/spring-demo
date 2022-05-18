package com.kApps.demo.api;

import com.kApps.demo.model.Person;
import com.kApps.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    public void  addPerson(Person person){
        personService.addPerson(person);
    }
}

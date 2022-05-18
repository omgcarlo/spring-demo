package com.kApps.demo.dao;

import com.kApps.demo.model.Person;

import java.util.UUID;

// the interface for dependency injections
// database values
public interface PersonDao {
    // method for manual insertion of person with ID
    int insertPerson(UUID id, Person person);

    // method for automatic assignment of ID
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return  insertPerson(id,person);
    }
}

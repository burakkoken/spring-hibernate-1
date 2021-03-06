package com.codnect.repository;

import com.codnect.model.Person;

import java.util.List;

/**
 * Created by Burak Köken on 13.7.2017.
 */
public interface PersonRepository {

    List<Person> findAllPerson();

    List<Person> findPerson(String name);

    Person findPerson(int personId);

    void createPerson(Person person);

    void deletePerson(int personId);

    Person updatePerson(Person person);

}

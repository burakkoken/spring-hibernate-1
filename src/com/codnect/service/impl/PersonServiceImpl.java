package com.codnect.service.impl;

import com.codnect.model.Person;
import com.codnect.repository.PersonRepository;
import com.codnect.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Burak Köken on 13.7.2017.
 */
@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> findAllPerson() {
        return personRepository.findAllPerson();
    }

    @Override
    public List<Person> findPerson(String name) {
        return personRepository.findPerson(name);
    }

    @Override
    public Person findPerson(int personId) {
        return personRepository.findPerson(personId);
    }

    @Override
    public void createPerson(Person person) {
        personRepository.createPerson(person);
    }

    @Override
    public void deletePerson(int personId) {
        personRepository.deletePerson(personId);
    }

    @Override
    public Person updatePerson(Person person) {
        return updatePerson(person);
    }
}

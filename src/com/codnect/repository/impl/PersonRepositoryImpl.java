package com.codnect.repository.impl;

import com.codnect.model.Person;
import com.codnect.repository.PersonRepository;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Burak Köken on 13.7.2017.
 */
@Repository
public class PersonRepositoryImpl implements PersonRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Person> findAllPerson() {
        String query = "FROM Person";
        return (List<Person>) sessionFactory.getCurrentSession().createQuery(query).list();
    }

    @Override
    public List<Person> findPerson(String name) {
        String hqlQuery = "FROM Person AS p WHERE p.name LIKE %?%";
        Query query = sessionFactory.getCurrentSession().createQuery(hqlQuery);
        query.setParameter(0, name);
        return (List<Person>) query.list();
    }

    @Override
    public Person findPerson(int personId) {
        return sessionFactory.getCurrentSession().get(Person.class, personId);
    }

    @Override
    public void createPerson(Person person) {
        sessionFactory.getCurrentSession().save(person);
    }

    @Override
    public void deletePerson(int personId) {
        Person person = new Person();
        person.setId(personId);
        sessionFactory.getCurrentSession().delete(person);
    }

    @Override
    public Person updatePerson(Person person) {
        sessionFactory.getCurrentSession().update(person);
        return person;
    }
}

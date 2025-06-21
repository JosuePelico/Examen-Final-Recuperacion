package com.beesion.ms.test.repository;

import com.beesion.ms.model.Person;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class PersonRepository implements PanacheRepository<Person> {
    

    public List<Person> findByName(String name) {
        return list("name", name);
    }
    
    public List<Person> findActive() {
        return list("status", "active");
    }
}
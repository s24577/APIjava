package com.example.data.repositories;


import com.example.data.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person,Long> {

    @Query("select p from Person p where p.name=:name")
    Optional<Person> findPersonByName(String name);
}

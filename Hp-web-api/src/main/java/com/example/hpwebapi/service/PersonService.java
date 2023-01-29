package com.example.hpwebapi.service;

import com.example.data.repositories.ICatalogData;
import com.example.hpwebapi.contract.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements IPersonService{

    private final ICatalogData db;
    private final ICatalogDtoMappers mapper;
    @Autowired
    public PersonService(ICatalogData db, ICatalogDtoMappers mapper) {
        this.db = db;
        this.mapper = mapper;
    }

    @Override
    public PersonDto getPersonByName(String name) {
        var optionalPerson = db.getPerson().findPersonByName(name);
        return optionalPerson.map(person -> mapper.forPerson().map(person)).orElseThrow();
    }
}

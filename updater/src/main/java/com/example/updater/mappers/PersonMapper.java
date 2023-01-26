package com.example.updater.mappers;

import com.example.client.contract.PersonDto;
import com.example.data.model.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper implements IMapEntities<PersonDto,Person> {
    @Override
    public Person map(PersonDto personDto) {
        return map(personDto, new Person());
    }

    @Override
    public Person map(PersonDto personDto, Person person) {
        person.setBorn(personDto.getBorn());
        person.setDied(personDto.getDied());
        person.setName(personDto.getName());
        person.setNationality(personDto.getNationality());
        person.setImageUrl(personDto.getImageUrl());

        return person;
    }
}

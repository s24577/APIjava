package com.example.hpwebapi.service;


import com.example.data.model.Person;
import com.example.hpwebapi.contract.PersonDto;
import org.springframework.stereotype.Component;


@Component
public class PersonDtoMapper implements IMapDtos<Person, PersonDto> {

    @Override
    public PersonDto map(Person person) {
        return map(person, new PersonDto());
    }


    @Override
    public PersonDto map(Person person, PersonDto personDto) {
        personDto.setName(person.getName());
        personDto.setImageUrl(person.getImageUrl());
        personDto.setBorn(person.getBorn());
        personDto.setDied(person.getDied());
        personDto.setNationality(person.getNationality());

        return personDto;
    }
}

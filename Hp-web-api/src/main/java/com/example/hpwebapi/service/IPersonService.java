package com.example.hpwebapi.service;

import com.example.hpwebapi.contract.PersonDto;

public interface IPersonService {
    PersonDto getPersonByName(String name);
}

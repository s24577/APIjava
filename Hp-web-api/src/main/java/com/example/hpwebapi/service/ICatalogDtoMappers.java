package com.example.hpwebapi.service;

import com.example.data.model.Artist;
import com.example.data.model.Person;
import com.example.hpwebapi.contract.ArtistDto;
import com.example.hpwebapi.contract.PersonDto;

public interface ICatalogDtoMappers {
    IMapDtos<Artist, ArtistDto> forArtists();
    IMapDtos<Person, PersonDto> forPerson();
}

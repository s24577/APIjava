package com.example.hpwebapi.service;

import com.example.data.model.*;
import com.example.hpwebapi.contract.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DtoMapper implements ICatalogDtoMappers {
    private final IMapDtos<Artist, ArtistDto> forArtist;

    private final IMapDtos<Person, PersonDto> forPerson;
    @Autowired
    public DtoMapper(IMapDtos<Artist, ArtistDto> forArtist, IMapDtos<Person, PersonDto> forPerson) {
        this.forArtist = forArtist;
        this.forPerson = forPerson;
    }


    @Override
    public IMapDtos<Artist, ArtistDto> forArtists() {
        return forArtist;
    }

    @Override
    public IMapDtos<Person, PersonDto> forPerson() {
        return forPerson;
    }
}






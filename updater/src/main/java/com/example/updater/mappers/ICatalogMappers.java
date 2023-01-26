package com.example.updater.mappers;

import com.example.client.contract.*;
import com.example.data.model.*;
import com.example.data.model.Person;

public interface ICatalogMappers {
    IMapEntities<ArtistDto, Artist> forArtist();
    IMapEntities<PersonDto, Person> forPerson();
    IMapEntities<BookDto, Book> forBook();
    IMapEntities<SpeciesDto, Species> forSpecies();
    IMapEntities<HeadDto, Head> forHead();
    IMapEntities<WandDto, Wand> forWand();
    IMapEntities<HouseDto, House> forHouse();
    IMapEntities<DistinctionDto, Distinction> forDistinction();

}

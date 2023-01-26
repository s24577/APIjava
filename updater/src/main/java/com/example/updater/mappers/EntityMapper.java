package com.example.updater.mappers;

import com.example.client.contract.*;
import com.example.data.model.*;
import com.example.data.model.Person;
import org.springframework.stereotype.Component;


@Component
public class EntityMapper implements ICatalogMappers {

        private final IMapEntities<ArtistDto, Artist> forArtist;
        private final IMapEntities<BookDto, Book > forBook;
        private final IMapEntities<PersonDto, Person> forPerson;
        private final IMapEntities<SpeciesDto, Species> forSpecies;
        private final IMapEntities<DistinctionDto, Distinction> forDistincion;
        private final IMapEntities<HeadDto, Head> forHead;
        private final IMapEntities<HouseDto, House > forHouse;

        private final IMapEntities<WandDto, Wand> forWand;


    public EntityMapper(IMapEntities<ArtistDto, Artist> forArtist, IMapEntities<BookDto, Book> forBook, IMapEntities<PersonDto, Person> forPerson, IMapEntities<SpeciesDto, Species> forSpecies, IMapEntities<DistinctionDto, Distinction> forDistincion, IMapEntities<HeadDto, Head> forHead, IMapEntities<HouseDto, House> forHouse, IMapEntities<WandDto, Wand> forWand) {
        this.forArtist = forArtist;
        this.forBook = forBook;
        this.forPerson = forPerson;
        this.forSpecies = forSpecies;
        this.forDistincion = forDistincion;
        this.forHead = forHead;
        this.forHouse = forHouse;
        this.forWand = forWand;

    }


    @Override
    public IMapEntities<ArtistDto, Artist> forArtist() {
        return forArtist;
    }

    @Override
    public IMapEntities<PersonDto, Person> forPerson() {
        return forPerson;
    }


    @Override
    public IMapEntities<BookDto, Book> forBook() {
        return forBook;
    }

    @Override
    public IMapEntities<SpeciesDto, Species> forSpecies() {
        return forSpecies;
    }

    @Override
    public IMapEntities<HeadDto, Head> forHead() {
        return forHead;
    }

    @Override
    public IMapEntities<WandDto, Wand> forWand() {
        return forWand;
    }

    @Override
    public IMapEntities<HouseDto, House> forHouse() {
        return forHouse;
    }


    @Override
    public IMapEntities<DistinctionDto, Distinction> forDistinction() {
        return forDistincion;
    }
}


package com.example.data.repositories;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Getter
public class DataCatalog implements ICatalogData{
    private final ArtistRepository artist;
    private final BookRepository book;
    private final DistinctionRepository distinction;
    private final HeadRepository head;
    private final HouseRepository house;
    private final PersonRepository person;
    private final SpeciesRepository species;
    private final WandRepository wand;


}

package com.example.data.repositories;



public interface ICatalogData {
    ArtistRepository getArtist();
    BookRepository getBook();
    DistinctionRepository getDistinction();
    HeadRepository getHead();
    HouseRepository getHouse();
    PersonRepository getPerson();
    SpeciesRepository getSpecies();
    WandRepository getWand();


}

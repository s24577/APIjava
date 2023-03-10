package com.example.client;

import com.example.client.contract.*;

public interface IHarryPotterClient {

    List<ShorterBookDto> getResults();

    ArtistDto getArtist();
    BookDto getBook();
    PersonDto getCharacter();
    HouseDto getHouse();
    SpeciesDto getSpecies();
    WandDto getWand();

    HeadDto getHead();

    DistinctionDto getDistinction();


}

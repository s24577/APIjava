package com.example.updater.updater;

import com.example.client.IHarryPotterClient;
import com.example.client.contract.*;
import com.example.data.model.Artist;
import com.example.data.repositories.ICatalogData;
import com.example.updater.mappers.ICatalogMappers;
import jakarta.persistence.SecondaryTable;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DataUpdater implements IUpdateData{
    private final ICatalogData data;
    private final IHarryPotterClient client;
    private final ICatalogMappers entityMapper;

    public DataUpdater(ICatalogData data, IHarryPotterClient client, ICatalogMappers entityMapper) {
        this.data = data;
        this.client = client;
        this.entityMapper = entityMapper;
    }


    @Override
    public void updateEverything() {

        var results = client.getResults();
            for(ShorterBookDto bookDto : results){
//                var artistsDto = bookDto.getBookArtistsDto();
//                Set<Artist> artists = new HashSet<>();
//                for (ArtistSummaryDto artistDto : artistsDto){
//                    artists.add(entityMapper.forArtist().map(new ArtistDto()));
//                }
                var entity= entityMapper.forShorterBook().map(bookDto);
//                entity.getBookArtists().addAll(artists);
                data.getBook().save(entity);
            }



//        var result = client.getBook();
//        var entity = entityMapper.forBook().map(result);
//        data.getBook().save(entity);
//
//        var personsDto = client.getCharacter();
//        var persons = entityMapper.forPerson().map(personsDto);
//        data.getPerson().save(persons);
//
//        var artistsDto = client.getArtist();
//        var artists = entityMapper.forArtist().map(artistsDto);
//        data.getArtist().save(artists);
//
//        var distinctionsDto = client.getDistinction();
//        var distinctions = entityMapper.forDistinction().map(distinctionsDto);
//        data.getDistinction().save(distinctions);
//
//        var headsDto = client.getHead();
//        var heads =entityMapper.forHead().map(headsDto);
//        data.getHead().save(heads);
//
//        var housesDto = client.getHouse();
//        var houses = entityMapper.forHouse().map(housesDto);
//        data.getHouse().save(houses);
//
//        var speciesDto = client.getSpecies();
//        var species = entityMapper.forSpecies().map(speciesDto);
//        data.getSpecies().save(species);
//
//        var wandsDto = client.getWand();
//        var wands = entityMapper.forWand().map(wandsDto);
//        data.getWand().save(wands);


    }

}

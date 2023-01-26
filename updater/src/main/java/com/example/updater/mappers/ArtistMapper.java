package com.example.updater.mappers;

import com.example.client.contract.ArtistDto;
import com.example.data.model.Artist;
import org.springframework.stereotype.Component;

@Component
public class ArtistMapper implements IMapEntities<ArtistDto, Artist> {
    @Override
    public Artist map(ArtistDto artistDto) {
        return map(artistDto, new Artist());
    }

    @Override
    public Artist map(ArtistDto artistDto, Artist artist) {
        artist.setRole(artistDto.getRole());
        artist.setName(artistDto.getName());
        return artist;
    }
}

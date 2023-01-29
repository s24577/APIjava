package com.example.hpwebapi.service;


import com.example.data.model.Artist;
import com.example.hpwebapi.contract.ArtistDto;
import org.springframework.stereotype.Component;



@Component
public class ArtistDtoMapper implements IMapDtos<Artist, ArtistDto> {
    @Override
    public ArtistDto map(Artist artist) {
        return map(artist, new ArtistDto());
    }

    @Override
    public ArtistDto map(Artist artist, ArtistDto artistDto) {
        artistDto.setName(artist.getName());
        artistDto.setRole(artist.getRole());
        artistDto.setId(artistDto.getId());
        return artistDto;
    }
}

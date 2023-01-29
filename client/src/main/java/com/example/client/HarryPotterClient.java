package com.example.client;

import com.example.client.contract.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class HarryPotterClient implements IHarryPotterClient {
    RestTemplate restClient;
    String baseUrl;


    String apiVersion;
    private final IHarryPotterClientSettings _settings;


    public HarryPotterClient(IHarryPotterClientSettings settings) {
        restClient = new RestTemplate();
        this.baseUrl = settings.getBaseUrl();
        this.apiVersion = settings.apiVersion();
        _settings = settings;

    }

    @Override
    public List<ShorterBookDto> getResults(){
       // var url = _settings.getUrlBuilder().path("api/").path(apiVersion).pathSegment("books").build().toUriString();
        var url = "http://legacy--api.herokuapp.com/api/v1/books";

        ResponseEntity<ShorterBookDto[]> responseEntity = restClient.getForEntity(url, ShorterBookDto[].class);
        ShorterBookDto[] resultDtos = responseEntity.getBody();
        assert resultDtos != null;
        return Arrays.stream(resultDtos).collect(Collectors.toList());
    }

    @Override
    public ArtistDto getArtist() {
        var url = _settings.getUrlBuilder().path(apiVersion).pathSegment("artists").build().toUriString();
        return restClient.getForEntity(url, ArtistDto.class).getBody();
    }

    //  public String buildUrl(){
//        return _settings.getUrlBuilder()
//                .path(apiKey).path(apiVersion)
//                .build()
//                .toUriString();
 //   }
//    https://legacy--api.herokuapp.com/api/v1/books
    @Override
    public BookDto getBook() {
        var url = _settings.getUrlBuilder().path(apiVersion).pathSegment("books").build().toUriString();
        return restClient.getForObject(url, BookDto.class);
    }

    @Override
    public PersonDto getCharacter() {
        String url = _settings.getUrlBuilder().path(apiVersion).pathSegment("characters").build().toUriString();
        return restClient.getForEntity(url, PersonDto.class).getBody();
    }

    @Override
    public HouseDto getHouse() {
        String url = _settings.getUrlBuilder().path(apiVersion).pathSegment("houses").build().toUriString();
        return restClient.getForEntity(url, HouseDto.class).getBody();
    }

    @Override
    public SpeciesDto getSpecies() {
        String url = _settings.getUrlBuilder().path(apiVersion).pathSegment("species").build().toUriString();
        return restClient.getForEntity(url, SpeciesDto.class).getBody();
    }

    @Override
    public WandDto getWand() {
        String url = _settings.getUrlBuilder().path(apiVersion).pathSegment("wands").build().toUriString();
        return restClient.getForEntity(url, WandDto.class).getBody();
    }

    @Override
    public HeadDto getHead() {
        var url = _settings.getUrlBuilder().path(apiVersion).pathSegment("heads").build().toUriString();
        return restClient.getForEntity(url, HeadDto.class).getBody();
    }

    @Override
    public DistinctionDto getDistinction() {
        var url = _settings.getUrlBuilder().path(apiVersion).pathSegment("distinctions").build().toUriString();
        return restClient.getForEntity(url, DistinctionDto.class).getBody();
    }
}

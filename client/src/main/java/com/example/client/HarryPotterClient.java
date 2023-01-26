package com.example.client;

import com.example.client.contract.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HarryPotterClient implements IHarryPotterClient {
    RestTemplate restClient;
    String baseUrl;

    String apiKey;
    String apiVersion;
    private final IHarryPotterClientSettings _settings;


    public HarryPotterClient(IHarryPotterClientSettings settings) {
        restClient = new RestTemplate();
        this.baseUrl = settings.getBaseUrl();
        this.apiVersion = settings.apiVersion();
        _settings = settings;
    }

    @Override
    public ArtistDto getArtist() {
        var url = _settings.getUrlBuilder().path(apiKey).path(apiVersion).pathSegment("artists").build().toUriString();
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
        var url = _settings.getUrlBuilder().path(apiKey).path(apiVersion).pathSegment("books").build().toUriString();
        return restClient.getForObject(url, BookDto.class);
    }

    @Override
    public PersonDto getCharacter() {
        String url = _settings.getUrlBuilder().path(apiKey).path(apiVersion).pathSegment("characters").build().toUriString();
        return restClient.getForEntity(url, PersonDto.class).getBody();
    }

    @Override
    public HouseDto getHouse() {
        String url = _settings.getUrlBuilder().path(apiKey).path(apiVersion).pathSegment("houses").build().toUriString();
        return restClient.getForEntity(url, HouseDto.class).getBody();
    }

    @Override
    public SpeciesDto getSpecies() {
        String url = _settings.getUrlBuilder().path(apiKey).path(apiVersion).pathSegment("species").build().toUriString();
        return restClient.getForEntity(url, SpeciesDto.class).getBody();
    }

    @Override
    public WandDto getWand() {
        String url = _settings.getUrlBuilder().path(apiKey).path(apiVersion).pathSegment("wands").build().toUriString();
        return restClient.getForEntity(url, WandDto.class).getBody();
    }

    @Override
    public HeadDto getHead() {
        var url = _settings.getUrlBuilder().path(apiKey).path(apiVersion).pathSegment("heads").build().toUriString();
        return restClient.getForEntity(url, HeadDto.class).getBody();
    }

    @Override
    public DistinctionDto getDistinction() {
        var url = _settings.getUrlBuilder().path(apiKey).path(apiVersion).pathSegment("distinctions").build().toUriString();
        return restClient.getForEntity(url, DistinctionDto.class).getBody();
    }
}

package com.example.client;

import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

public interface IHarryPotterClientSettings {

    String getBaseUrl();

    String apiVersion();

    default UriComponentsBuilder getUrlBuilder(){
        return UriComponentsBuilder
                .newInstance()
                .scheme("http")
                .host(getBaseUrl());
    }
}

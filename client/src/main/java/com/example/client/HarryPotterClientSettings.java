package com.example.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class HarryPotterClientSettings implements IHarryPotterClientSettings {

    @Value("legacy--api.herokuapp.com")
    private String baseUrl;


    @Value("v1")
    private String apiVersion;

    @Override
    public String getBaseUrl() {
        return baseUrl;
    }

    @Override
    public String apiVersion() {
        return apiVersion;
    }



}

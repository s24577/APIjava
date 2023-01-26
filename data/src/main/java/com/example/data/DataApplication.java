package com.example.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataApplication {
//    private final ICatalogData db;
//
//    public DataApplication(ICatalogData dataCatalog) {
//        this.db = dataCatalog;
//    }

    public static void main(String[] args) {
        SpringApplication.run(DataApplication.class, args);
    }

}

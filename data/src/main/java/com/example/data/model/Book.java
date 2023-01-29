package com.example.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String imageUrl;
    @ManyToMany(mappedBy = "books")
    private Set<Artist> bookArtists = new HashSet<>();

    private int pages;
    private Date releaseDate;


}

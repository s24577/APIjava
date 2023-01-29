package com.example.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String role;
    @ManyToMany
    private Set<Book> books= new HashSet<>();
}

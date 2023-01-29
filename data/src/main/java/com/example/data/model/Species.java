package com.example.data.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Species {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String mortality;

    @ManyToMany(mappedBy = "species")
    private List<Distinction> distinctions = new ArrayList<>();

}

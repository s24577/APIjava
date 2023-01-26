package com.example.data.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imageUrl;
    private String born;
    private String died;
    private String nationality;
    @ManyToMany
    private List<Wand> wands= new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "house_id", referencedColumnName = "id")
    private House house;




}

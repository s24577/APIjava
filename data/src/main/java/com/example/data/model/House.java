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
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String animal;
    @OneToMany(mappedBy = "house")
    private List<Head> heads = new ArrayList<>();
    private int members;
}

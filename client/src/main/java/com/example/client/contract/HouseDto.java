package com.example.client.contract;

import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class HouseDto {
    private Long id;
    private String name;
    private String animal;
    private List<HeadDto> headsDto = new ArrayList<>();
    private int members;
}

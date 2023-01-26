package com.example.client.contract;

import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class SpeciesDto {
    private Long id;
    private String name;
    private String mortality;
    private List<DistinctionDto> distinctionsDto = new ArrayList<>();
    private List<SpeciesDto> relatedSpeciesDto = new ArrayList<>();
}

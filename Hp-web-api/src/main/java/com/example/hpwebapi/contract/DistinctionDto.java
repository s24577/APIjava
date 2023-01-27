package com.example.hpwebapi.contract;

import com.example.client.contract.SpeciesDto;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class DistinctionDto {
    private Long id;
    private String content;
    private List<SpeciesDto> speciesDto = new ArrayList<>();
}


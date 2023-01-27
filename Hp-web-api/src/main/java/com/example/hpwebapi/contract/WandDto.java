package com.example.hpwebapi.contract;

import com.example.client.contract.PersonDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class WandDto {
    private Long id;
    private String name;
    private String wood;
    @JsonProperty("image_url")
    private String imageUrl;
    private List<PersonDto> personDto = new ArrayList<>();
}

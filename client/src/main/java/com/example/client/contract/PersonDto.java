package com.example.client.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class PersonDto {
    private Long id;
    private String name;
    @JsonProperty("image_url")
    private String imageUrl;
    private String born;
    private String died;
    private String nationality;
    private List<WandDto> wandDto = new ArrayList<>();
}

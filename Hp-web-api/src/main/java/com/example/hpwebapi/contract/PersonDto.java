package com.example.hpwebapi.contract;

import com.example.client.contract.WandDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

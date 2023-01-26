package com.example.client.contract;

import com.example.data.model.House;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HeadDto {
    private Long id;
    private String name;
    private House house;
}

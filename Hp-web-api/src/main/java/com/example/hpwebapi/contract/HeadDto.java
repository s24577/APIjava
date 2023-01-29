package com.example.hpwebapi.contract;

import com.example.data.model.House;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HeadDto {
    private Long id;
    private String name;
    private House house;
}

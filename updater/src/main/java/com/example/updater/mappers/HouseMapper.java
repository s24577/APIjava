package com.example.updater.mappers;

import com.example.client.contract.HouseDto;
import com.example.data.model.House;
import org.springframework.stereotype.Component;

@Component
public class HouseMapper implements IMapEntities<HouseDto, House> {
    @Override
    public House map(HouseDto houseDto) {
        return map(houseDto, new House());
    }

    @Override
    public House map(HouseDto houseDto, House house) {
        house.setName(houseDto.getName());
        house.setAnimal(houseDto.getAnimal());
        house.setMembers(houseDto.getMembers());
        return house;
    }
}

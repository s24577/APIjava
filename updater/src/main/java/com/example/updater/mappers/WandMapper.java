package com.example.updater.mappers;

import com.example.client.contract.WandDto;
import com.example.data.model.Wand;
import org.springframework.stereotype.Component;

@Component
public class WandMapper implements IMapEntities<WandDto, Wand> {
    @Override
    public Wand map(WandDto wandDto) {
        return map(wandDto, new Wand());
    }

    @Override
    public Wand map(WandDto wandDto, Wand wand) {
        wand.setName(wandDto.getName());
        wand.setImageUrl(wandDto.getImageUrl());
        wand.setWood(wandDto.getWood());
        return wand;
    }

}

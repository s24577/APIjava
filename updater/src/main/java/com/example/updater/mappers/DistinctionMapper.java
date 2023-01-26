package com.example.updater.mappers;

import com.example.client.contract.DistinctionDto;
import com.example.data.model.Distinction;
import org.springframework.stereotype.Component;

@Component
public class DistinctionMapper implements IMapEntities<DistinctionDto, Distinction> {
    @Override
    public Distinction map(DistinctionDto distinctionDto) {
        return map(distinctionDto, new Distinction());
    }

    @Override
    public Distinction map(DistinctionDto distinctionDto, Distinction distinction) {
        distinction.setContent(distinctionDto.getContent());
        return distinction;
    }
}

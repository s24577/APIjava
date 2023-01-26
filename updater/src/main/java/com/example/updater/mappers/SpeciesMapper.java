package com.example.updater.mappers;

import com.example.client.contract.SpeciesDto;
import com.example.data.model.Species;
import org.springframework.stereotype.Component;


@Component
public class SpeciesMapper implements IMapEntities<SpeciesDto, Species> {
    @Override
    public Species map(SpeciesDto speciesDto) {
       return map(speciesDto, new Species());

    }

    @Override
    public Species map(SpeciesDto speciesDto, Species species) {
        species.setName(speciesDto.getName());
        species.setMortality(speciesDto.getMortality());
        return species;
    }


}

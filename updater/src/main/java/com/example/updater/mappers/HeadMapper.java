package com.example.updater.mappers;

import com.example.client.contract.HeadDto;
import com.example.data.model.Head;
import org.springframework.stereotype.Component;

@Component
public class HeadMapper implements IMapEntities<HeadDto, Head> {
    @Override
    public Head map(HeadDto headDto) {
        return map(headDto, new Head());
    }

    @Override
    public Head map(HeadDto headDto, Head head) {
        head.setName(headDto.getName());
        return head;
    }
}

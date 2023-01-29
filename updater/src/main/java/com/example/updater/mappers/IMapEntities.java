package com.example.updater.mappers;

import com.example.client.contract.ShorterBookDto;
import com.example.data.model.Book;

public interface IMapEntities<TDto, TEntity> {
    TEntity map(TDto dto);
    TEntity map(TDto dto, TEntity entity);
}

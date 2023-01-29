package com.example.hpwebapi.service;

public interface IMapDtos<TEntity, TDto> {
    TDto map(TEntity entity);
    TDto map(TEntity entity, TDto dto);

}

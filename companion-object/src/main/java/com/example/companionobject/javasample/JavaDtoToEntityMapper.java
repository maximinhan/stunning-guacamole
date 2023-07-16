package com.example.companionobject.javasample;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
interface JavaDtoToEntityMapper {
    JavaDtoToEntityMapper INSTANCE = Mappers.getMapper(JavaDtoToEntityMapper.class);

    JavaEntityClass toEntity(JavaDtoClass dtoClass);
}

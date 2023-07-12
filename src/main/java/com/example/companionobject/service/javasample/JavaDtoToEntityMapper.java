package com.example.companionobject.service.javasample;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
interface JavaDtoToEntityMapper {
    JavaDtoToEntityMapper INSTANCE = Mappers.getMapper(JavaDtoToEntityMapper.class);

    JavaEntityClass toMessageBodyDto(JavaDtoClass dtoClass);
}

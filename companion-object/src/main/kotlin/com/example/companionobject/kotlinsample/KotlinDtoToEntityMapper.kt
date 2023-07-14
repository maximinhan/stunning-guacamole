package com.example.companionobject.kotlinsample

import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

@Mapper
interface KotlinDtoToEntityMapper {

    companion object {
        fun getInstance(): KotlinDtoToEntityMapper = Mappers.getMapper(
            KotlinDtoToEntityMapper::class.java
        )
    }

    fun toMessageBodyDto(dtoClass: KotlinDtoClass): KotlinEntityClass?
}

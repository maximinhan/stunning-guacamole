package com.example.companionobject.kotlinsample.complex

import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper
interface CarToCarDto {

    @Mapping(source = "someDefault.id", target = "id")
    @Mapping(source = "someDefault.name", target = "name")
    @Mapping(source = "carFactory.someDefault.id", target = "carFactory.id")
    @Mapping(source = "carFactory.someDefault.name", target = "carFactory.name")
    fun toDto(car: Car): CarDto
}

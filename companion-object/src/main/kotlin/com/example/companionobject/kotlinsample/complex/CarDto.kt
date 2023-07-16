package com.example.companionobject.kotlinsample.complex

import java.time.LocalDateTime

data class CarDto (
    val id: Long,
    val name: String,
    val modelName: String,
    val createdAt: LocalDateTime,
    val carFactory: CarFactoryDto
)

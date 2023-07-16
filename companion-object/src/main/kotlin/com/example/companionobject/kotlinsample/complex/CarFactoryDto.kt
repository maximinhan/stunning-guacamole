package com.example.companionobject.kotlinsample.complex

import java.time.LocalDateTime

data class CarFactoryDto (
    val id: Long,
    val name: String,
    val region: String,
    val createdAt: LocalDateTime
)


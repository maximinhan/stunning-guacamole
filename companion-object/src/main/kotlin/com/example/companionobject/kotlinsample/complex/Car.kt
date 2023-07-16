package com.example.companionobject.kotlinsample.complex

import java.time.LocalDateTime

data class Car(
    val someDefault: SomeDefault,
    val modelName: String,
    val createdAt: LocalDateTime,
    val carFactory: CarFactory
)

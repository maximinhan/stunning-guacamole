package com.example.companionobject.kotlinsample.complex

import java.time.LocalDateTime

data class CarFactory(
    val someDefault: SomeDefault,
    val region: String,
    val createdAt: LocalDateTime,
)

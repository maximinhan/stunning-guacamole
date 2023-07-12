package com.example.companionobject.service.kotlinsample

import java.time.LocalDateTime

data class KotlinDtoClass(
    val title: String,
    val content: String,
    val sender: String,
    val receiver: List<String>,
    val requestTime: LocalDateTime,
    val type: String,
)

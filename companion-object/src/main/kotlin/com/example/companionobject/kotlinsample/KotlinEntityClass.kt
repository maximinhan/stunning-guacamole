package com.example.companionobject.kotlinsample

import java.time.LocalDateTime

data class KotlinEntityClass(
    val title: String,
    val content: String,
    val sender: String,
    val receiver: List<String>,
    val requestTime: LocalDateTime,
    var type: PerformanceType,
    var memo: String,
)

enum class PerformanceType {
    CONCERT,
    EXHIBITION
}

package com.example.metrictest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MetricTestApplication

fun main(args: Array<String>) {
    runApplication<MetricTestApplication>(*args)
}

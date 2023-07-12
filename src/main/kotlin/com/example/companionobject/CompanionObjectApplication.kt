package com.example.companionobject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.example.companionobject"])
class CompanionObjectApplication

fun main(args: Array<String>) {
	runApplication<CompanionObjectApplication>(*args)
}

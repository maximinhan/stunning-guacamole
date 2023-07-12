package com.example.companionobject.controller

import com.example.companionobject.service.javasample.JavaSampleService
import com.example.companionobject.service.kotlinsample.KotlinSampleService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/companion/sample")
class TestController(
    private val kotlinSampleService: KotlinSampleService,
    private val javaSampleService: JavaSampleService
) {
    @GetMapping("/java")
    fun javaSample(): ResponseEntity<String> {
        javaSampleService.doSomething()
        return ResponseEntity.ok("자바 샘플")
    }

    @GetMapping("/kotlin")
    fun kotlinSample(): ResponseEntity<String> {
        kotlinSampleService.doSomething()
        return ResponseEntity.ok("코틀린 샘플")
    }
}

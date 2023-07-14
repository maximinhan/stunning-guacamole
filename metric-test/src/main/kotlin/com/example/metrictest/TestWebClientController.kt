package com.example.metrictest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.bodyToMono
import reactor.core.publisher.Mono

@RestController
class TestWebClientController(
    private val testWebClient: WebClient
) {

    @GetMapping("/test/webClient")
    fun testWebClient(): Mono<String> {
        try {
            return testWebClient
                .get()
                .uri("/companion/sample/kotlin")
                .retrieve()
                .bodyToMono<String>()
                .onErrorResume {
                    Mono.just("오류남")
                }

        } catch (e: Exception) {
            return Mono.just("오류남")
        }
    }
}

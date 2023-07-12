package com.example.companionobject.service.kotlinsample

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class KotlinSampleService {
    private val logger = LoggerFactory.getLogger(this.javaClass)

    fun doSomething() {
        logger.info("무언가를 합니다.")

        val dtoClass = KotlinDtoClass(
            title = "골든 아워",
            content = "오렌지 태양 아래",
            sender = "IU",
            receiver = listOf("유애나"),
            requestTime = LocalDateTime.of(2022, 9, 17, 19, 0),
            type = ""
        )

        for (i in 0..100000) {
            val entityClass = KotlinDtoToEntityMapper.getInstance().toMessageBodyDto(dtoClass)
        }

        logger.info("힙덤프 시점")
        Thread.sleep(5000L)
    }
}

package com.example.companionobject.javasample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Service
public class JavaSampleService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    public void doSomething() throws InterruptedException {
        logger.info("무언가를 합니다.");

        List<String> receivers = new ArrayList<>();
        receivers.add("유애나");

        JavaDtoClass dtoClass = new JavaDtoClass();
        dtoClass.setTitle("골든 아워");
        dtoClass.setContent("오렌지 태양 아래");
        dtoClass.setSender("IU");
        dtoClass.setType("Concert");
        dtoClass.setReceiver(receivers);
        dtoClass.setRequestTime(LocalDateTime.of(2022, 9, 17,19, 0));

        for (int i = 0; i < 100000; i++) {
            JavaEntityClass entityClass = JavaDtoToEntityMapper.INSTANCE.toMessageBodyDto(dtoClass);
        }

        logger.info("힙덤프 시점");
        Thread.sleep(5000L);
    }
}

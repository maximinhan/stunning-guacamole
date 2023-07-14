package com.example.metrictest

import io.micrometer.core.instrument.MeterRegistry
import io.netty.channel.ChannelOption
import io.netty.handler.timeout.ReadTimeoutHandler
import io.netty.handler.timeout.WriteTimeoutHandler
import org.springframework.boot.actuate.metrics.AutoTimer
import org.springframework.boot.actuate.metrics.web.reactive.client.DefaultWebClientExchangeTagsProvider
import org.springframework.boot.actuate.metrics.web.reactive.client.MetricsWebClientFilterFunction
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.client.reactive.ReactorClientHttpConnector
import org.springframework.web.reactive.function.client.WebClient
import reactor.netty.http.client.HttpClient
import reactor.netty.resources.ConnectionProvider
import java.time.Duration
import java.util.concurrent.TimeUnit


@Configuration
class TestWebClientConfiguration {

    @Bean("testWebClient")
    fun testWebClient(meterRegistry: MeterRegistry): WebClient {
        val connectionProvider = ConnectionProvider.builder("test-webclient-connection-pool")
            .maxConnections(100)
            .maxIdleTime(Duration.ofSeconds(5))
            .pendingAcquireTimeout(Duration.ofSeconds(10))
            .pendingAcquireMaxCount(-1)
            .evictInBackground(Duration.ofSeconds(30))
            .metrics(true)
            .build()

        val httpClient = HttpClient.create(connectionProvider)
            .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 5000)
            .responseTimeout(Duration.ofMillis(5000))
            .doOnConnected { conn ->
                conn.addHandlerLast(ReadTimeoutHandler(5000, TimeUnit.MILLISECONDS))
                    .addHandlerLast(WriteTimeoutHandler(5000, TimeUnit.MILLISECONDS))
            }

        val metricsFilter = MetricsWebClientFilterFunction(
            meterRegistry,
            DefaultWebClientExchangeTagsProvider(),
            "test-outbound",
            AutoTimer.ENABLED
        )


        return WebClient.builder()
            .clientConnector(ReactorClientHttpConnector(httpClient))
            .baseUrl("http://localhost:18080")
            .filter(metricsFilter)
            .build()
    }
}

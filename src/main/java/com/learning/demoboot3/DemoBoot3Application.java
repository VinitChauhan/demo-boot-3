package com.learning.demoboot3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication
public class DemoBoot3Application {
    public static void main(String[] args) {
        SpringApplication.run(DemoBoot3Application.class, args);
    }

    @Bean
    public HttpServiceProxyFactory httpFactory() {
        WebClient client = WebClient
                .builder()
                .baseUrl("http://localhost:8081")
                .build();
        return HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(client))
                .build();
    }
}

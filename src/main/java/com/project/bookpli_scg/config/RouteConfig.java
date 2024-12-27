package com.project.bookpli_scg.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {
    @Bean
    public RouteLocator ms1Route(RouteLocatorBuilder builder) {

        return builder.routes()
                .route("bookservice", r -> r.path("/bookservice/**")
                        .uri("http://localhost:9001"))
                .route("musicservice", r -> r.path("/musicservice/**")
                        .uri("http://localhost:9002"))
                .route("authservice", r -> r.path("/authservice/**")
                        .uri("http://localhost:9003"))
                .build();
    }
}

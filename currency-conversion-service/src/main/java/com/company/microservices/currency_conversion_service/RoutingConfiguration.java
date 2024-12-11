package com.company.microservices.currency_conversion_service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springdoc.webflux.core.fn.SpringdocRouteBuilder.route;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class RoutingConfiguration {

    @Bean
    public RouterFunction<ServerResponse> monoRouterFunction(CurrencyHandler currencyHandler) {
        return route()
                .GET("/api/user/index", accept(APPLICATION_JSON), currencyHandler::getAll,
                        ops -> ops.beanClass(CurrencyRepository.class).beanMethod("getAllCurrency"))
                .build();
    }

}
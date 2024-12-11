package com.company.microservices.currency_conversion_service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class CurrencyHandler {

    private final CurrencyRepository customerRepository;

    public CurrencyHandler(CurrencyRepository repository) {

        this.customerRepository = repository;
    
    }

	public Mono<ServerResponse> getAll(ServerRequest request) {

        Flux<Currency> customers = customerRepository.getAllCurrency();

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(customers, Currency.class);
    
    }

}
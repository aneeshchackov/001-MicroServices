package com.company.microservices.currency_conversion_service;

import org.springframework.stereotype.Repository;

import io.swagger.v3.oas.annotations.Operation;
import reactor.core.publisher.Flux;

@Repository
public interface CurrencyRepository {

    @Operation(description = "get all the currency by name")
    public Flux<Currency> getAllCurrency();

}
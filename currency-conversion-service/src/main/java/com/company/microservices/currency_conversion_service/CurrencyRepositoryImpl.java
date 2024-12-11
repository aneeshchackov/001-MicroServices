package com.company.microservices.currency_conversion_service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
import reactor.core.publisher.Flux;

@Repository
public class CurrencyRepositoryImpl implements CurrencyRepository {

	private Map<Long, Currency> users = new HashMap<Long, Currency>();

	@PostConstruct
	public void init() throws Exception {
		users.put(Long.valueOf(1), new Currency(1L, "Jack", "Smith"));
		users.put(Long.valueOf(2), new Currency(2L, "Peter", "Johnson"));
	}

	@Override
	public Flux<Currency> getAllCurrency() {
		return Flux.fromIterable(this.users.values());
	}

}
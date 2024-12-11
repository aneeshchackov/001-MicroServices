package com.company.microservices.currency_conversion_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class CurrencyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServiceApplication.class, args);
	}

	@Bean
	public OpenAPI currencyOpenAPI(@Value("${springdoc.api-docs.version}") String appVersion) {

		return new OpenAPI()
				.components(new Components())
				.info(new Info().title("Currency Conversion Service")
						.description("Currency Conversion Service External API Documentation")
						.version(appVersion)
						.license(new License().name("Apache 2.0").url(
								"http://springdoc.org")))
				.externalDocs(new ExternalDocumentation().description("Currency Conversion Service Wiki Documentation")
						.url("http://springdoc.org"));
	}

}
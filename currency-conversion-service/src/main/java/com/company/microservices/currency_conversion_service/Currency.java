package com.company.microservices.currency_conversion_service;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema
public class Currency {

    private final Long id;
    private final String from;
    private final String to;

}
package com.kfc.api.endpoint.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Ingredient(
    int id,
    String name,
    @JsonProperty("unit_price") double unitPrice,
    double quantity,
    @JsonProperty("measurement_unit") String measurementUnit) {}

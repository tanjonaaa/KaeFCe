package com.kfc.api.endpoint.rest.model;


public record Ingredient(
    int id, String name, double unitPrice, double quantity, String measurementUnit) {}

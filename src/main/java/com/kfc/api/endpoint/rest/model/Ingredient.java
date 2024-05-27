package com.kfc.api.endpoint.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public record Ingredient(int id, String name, double unitPrice, double quantity, String measurementUnit){
    }

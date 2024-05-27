package com.kfc.api.endpoint.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;

public record Menu(
    int id,
    String name,
    Set<Ingredient> ingredients,
    @JsonProperty("selling_price") double sellingPrice) {
  public double getCostPrice() {
    return ingredients.stream()
        .mapToDouble(ingredient -> ingredient.unitPrice() * ingredient.quantity())
        .sum();
  }
}

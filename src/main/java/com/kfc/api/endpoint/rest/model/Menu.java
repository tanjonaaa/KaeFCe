package com.kfc.api.endpoint.rest.model;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;

public record Menu(int id, String name, Set<Ingredient> ingredients, double sellingPrice) {
  public double getCostPrice() {
    return ingredients.stream()
        .mapToDouble(ingredient -> ingredient.unitPrice() * ingredient.quantity())
        .sum();
  }
}

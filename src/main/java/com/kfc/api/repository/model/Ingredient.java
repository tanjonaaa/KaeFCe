package com.kfc.api.repository.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Ingredient {
    private int id;
    private String name;
    private double unitPrice;
    private MeasurementUnit measurementUnit;
}

package com.kfc.api.repository.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MeasurementUnit {
    private int id;
    private String name;
}

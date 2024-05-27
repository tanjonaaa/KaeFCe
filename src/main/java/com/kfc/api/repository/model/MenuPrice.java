package com.kfc.api.repository.model;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Builder
@Data
public class MenuPrice {
    private int id;
    private int idMenu;
    private double value;
    private Instant priceDatetime;
}

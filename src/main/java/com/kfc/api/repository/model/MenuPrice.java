package com.kfc.api.repository.model;

import java.time.Instant;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MenuPrice {
    private int id;
    private int idMenu;
    private double value;
    private Instant priceDatetime;
}

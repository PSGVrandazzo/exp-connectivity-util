package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ExtraBedTypeModel {

    Crib("Crib"),
    DayBed("Day Bed"),
    RollawayBed("Rollaway Bed"),
    SofaBedExtra("Sofa Bed");

    @Getter(onMethod = @__(@JsonValue))
    private String dtoValue;
}

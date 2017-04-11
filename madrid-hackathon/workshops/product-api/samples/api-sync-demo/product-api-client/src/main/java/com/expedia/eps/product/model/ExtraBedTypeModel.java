package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@ApiModel
@AllArgsConstructor
public enum ExtraBedTypeModel implements EnumModel {

    Crib("Crib"),
    DayBed("Day Bed"),
    RollawayBed("Rollaway Bed"),
    SofaBedExtra("Sofa Bed");

    @Getter(onMethod = @__(@JsonValue))
    private String dtoValue;
}

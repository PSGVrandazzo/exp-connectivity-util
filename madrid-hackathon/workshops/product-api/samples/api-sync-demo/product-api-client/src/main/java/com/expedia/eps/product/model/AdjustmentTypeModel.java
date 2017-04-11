package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum AdjustmentTypeModel implements EnumModel {

    PERCENTAGE("Percentage"),
    AMOUNT("Amount");

    @Getter(onMethod = @__(@JsonValue))
    private final String value;
}

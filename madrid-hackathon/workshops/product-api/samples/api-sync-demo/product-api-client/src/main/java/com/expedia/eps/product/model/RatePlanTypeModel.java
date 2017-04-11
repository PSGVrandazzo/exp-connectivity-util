package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum RatePlanTypeModel {

    CORPORATE("Corporate"),
    PACKAGE("Package"),
    STANDALONE("Standalone");

    @Getter(onMethod = @__(@JsonValue))
    private String dtoValue;
}

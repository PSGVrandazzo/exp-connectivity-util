package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum PropertyStatusModel {

    ACTIVE("Active"),
    INACTIVE("Inactive"),
    ONBOARDING("Onboarding"),
    UNDER_CONVERSION("UnderConversion");

    @Getter(onMethod = @__(@JsonValue))
    private String value;
}

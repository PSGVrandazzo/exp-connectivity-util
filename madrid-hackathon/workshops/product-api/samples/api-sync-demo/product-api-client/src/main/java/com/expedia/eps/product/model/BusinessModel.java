package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum BusinessModel {

    AGENCY_ONLY("HotelCollect"),
    MERCHANT_ONLY("ExpediaCollect");

    @Getter(onMethod = @__(@JsonValue))
    private String value;
}

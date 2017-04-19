package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum SmokingPreferenceModel {

    SMOKING("Smoking"),
    NON_SMOKING("Non-Smoking");

    @Getter(onMethod = @__(@JsonValue))
    private final String value;
}

package com.expedia.eps.image.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ImageStatus {
    ACTIVE("Active"),
    INACTIVE("Inactive");

    @Getter(onMethod = @__(@JsonValue))
    private final String value;
}

package com.expedia.eps.image.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ImageState {
    NOT_FOUND("NotFound"),
    RECEIVED("Received"),
    DERIVATIVES_CREATED("DerivativesCreated"),
    REJECTED("Rejected"),
    DUPLICATE("Duplicate"),
    PUBLISHED("Published");

    @Getter(onMethod = @__(@JsonValue))
    private final String value;

}

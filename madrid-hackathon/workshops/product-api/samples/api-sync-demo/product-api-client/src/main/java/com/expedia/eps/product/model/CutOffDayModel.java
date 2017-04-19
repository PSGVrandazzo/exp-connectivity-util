package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum CutOffDayModel {

    SAME_DAY("sameDay"),
    NEXT_DAY("nextDay");

    @Getter(onMethod = @__(@JsonValue))
    private String value;
}

package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum SurchargeTypeModel {

    FREE("Free"),
    PER_DAY("Per Day"),
    PER_NIGHT("Per Night"),
    PER_WEEK("Per Week"),
    PER_STAY("Per Stay");

    @Getter(onMethod = @__(@JsonValue))
    private String value;

}

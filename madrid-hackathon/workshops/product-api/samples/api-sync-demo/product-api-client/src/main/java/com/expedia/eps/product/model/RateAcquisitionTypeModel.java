package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum RateAcquisitionTypeModel {

    NET("NetRate"),
    SELL_LAR("SellLAR");

    @Getter(onMethod = @__(@JsonValue))
    private String value;
}

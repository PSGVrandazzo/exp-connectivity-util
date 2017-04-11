package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@ApiModel
@AllArgsConstructor
public enum PropertyStatusModel implements EnumModel {

    ACTIVE("Active"),
    INACTIVE("Inactive"),
    ONBOARDING("Onboarding"),
    UNDER_CONVERSION("UnderConversion");

    @Getter(onMethod = @__(@JsonValue))
    private String dtoValue;
}

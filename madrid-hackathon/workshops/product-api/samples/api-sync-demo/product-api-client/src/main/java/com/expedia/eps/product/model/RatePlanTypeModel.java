package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@ApiModel
@AllArgsConstructor
public enum RatePlanTypeModel implements EnumModel {

    CORPORATE("Corporate"),
    PACKAGE("Package"),
    STANDALONE("Standalone");

    @Getter(onMethod = @__(@JsonValue))
    private String dtoValue;
}

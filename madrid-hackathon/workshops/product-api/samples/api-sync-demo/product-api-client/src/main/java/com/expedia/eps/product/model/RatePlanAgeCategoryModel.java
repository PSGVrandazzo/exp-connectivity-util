package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum RatePlanAgeCategoryModel {

    ADULT("Adult"),
    CHILD_AGE_A("ChildAgeA"),
    CHILD_AGE_B("ChildAgeB"),
    CHILD_AGE_C("ChildAgeC"),
    CHILD_AGE_D("ChildAgeD"),
    INFANT("Infant");

    @Getter(onMethod = @__(@JsonValue))
    private final String dtoValue;

}


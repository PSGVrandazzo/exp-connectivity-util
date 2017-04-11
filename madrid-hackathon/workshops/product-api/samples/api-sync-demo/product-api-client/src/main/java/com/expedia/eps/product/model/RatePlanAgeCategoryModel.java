package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@ApiModel
@AllArgsConstructor
public enum RatePlanAgeCategoryModel implements EnumModel {

    ADULT("Adult", 1),
    CHILD_AGE_A("ChildAgeA", 2),
    CHILD_AGE_B("ChildAgeB", 3),
    CHILD_AGE_C("ChildAgeC", 4),
    CHILD_AGE_D("ChildAgeD", 5),
    INFANT("Infant", 6);

    @Getter(onMethod = @__(@JsonValue))
    private final String dtoValue;

    @Getter
    private final int order;
}


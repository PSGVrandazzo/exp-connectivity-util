package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@ApiModel
@AllArgsConstructor
public enum SurchargeTypeModel implements EnumModel {

    FREE("Free", "Free"),
    PER_DAY("Per Day", "per day"),
    PER_NIGHT("Per Night", "per night"),
    PER_WEEK("Per Week", "per week"),
    PER_STAY("Per Stay", "per stay");

    @Getter(onMethod = @__(@JsonValue))
    private String dtoValue;
    private String rtsValue;

    public static SurchargeTypeModel fromRtsValue(String rtsValue) {
        for (SurchargeTypeModel surchargeTypeDTO : values()) {
            if (surchargeTypeDTO.rtsValue.equals(rtsValue)) {
                return surchargeTypeDTO;
            }
        }
        return null;
    }
}

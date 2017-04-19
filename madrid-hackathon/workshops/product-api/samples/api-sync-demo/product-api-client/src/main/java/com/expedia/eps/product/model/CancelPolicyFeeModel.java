package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum CancelPolicyFeeModel {

    NONE("None"),
    FIRST_NIGHT_ROOM_AND_TAX("1stNightRoomAndTax"),
    TWO_NIGHTS_ROOM_AND_TAX("2NightsRoomAndTax"),
    TEN_PERCENT_COST_OF_STAY("10PercentCostOfStay"),
    TWENTY_PERCENT_COST_OF_STAY("20PercentCostOfStay"),
    THIRTY_PERCENT_COST_OF_STAY("30PercentCostOfStay"),
    FORTY_PERCENT_COST_OF_STAY("40PercentCostOfStay"),
    FIFTY_PERCENT_COST_OF_STAY("50PercentCostOfStay"),
    SIXTY_PERCENT_COST_OF_STAY("60PercentCostOfStay"),
    SEVENTY_PERCENT_COST_OF_STAY("70PercentCostOfStay"),
    EIGHTY_PERCENT_COST_OF_STAY("80PercentCostOfStay"),
    NINETY_PERCENT_COST_OF_STAY("90PercentCostOfStay"),
    FULL_COST_OF_STAY("FullCostOfStay");

    @Getter(onMethod = @__(@JsonValue))
    private final String dtoValue;
}

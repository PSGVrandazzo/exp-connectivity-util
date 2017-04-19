package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum PricingModel {

    PER_DAY_PRICING("PerDayPricing"),
    OCCUPANCY_BASED_PRICING("OccupancyBasedPricing"),
    PER_PERSON_PRICING("PerPersonPricing"),
    PER_DAY_PRICING_BY_DAY_OF_ARRIVAL("PerDayPricingByDayOfArrival"),
    OCCUPANCY_BASED_PRICING_BY_DAY_OF_ARRIVAL("OccupancyBasedPricingByDayOfArrival"),
    PER_PERSON_PRICING_BY_DAY_OF_ARRIVAL("PerPersonPricingByDayOfArrival"),
    PER_DAY_PRICING_BY_LENGTH_OF_STAY("PerDayPricingByLengthOfStay"),
    OCCUPANCY_BASED_PRICING_BY_LENGTH_OF_STAY("OccupancyBasedPricingByLengthOfStay");

    @Getter(onMethod = @__(@JsonValue))
    private String value;
}

package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum RoomViewModel {

    BAY_VIEW("Bay View"),
    BEACH_VIEW("Beach View"),
    CANAL_VIEW("Canal View"),
    CITY_VIEW("City View"),
    COURTYARD_VIEW("Courtyard View"),
    DESERT_VIEW("Desert View"),
    GARDEN_VIEW("Garden View"),
    GOLF_VIEW("Golf View"),
    HARBOR_VIEW("Harbor View"),
    HILL_VIEW("Hill View"),
    LAGOON_VIEW("Lagoon View"),
    LAKE_VIEW("Lake View"),
    PARTIAL_LAKE_VIEW("Partial Lake View"),
    MARINA_VIEW("Marina View"),
    MOUNTAIN_VIEW("Mountain View"),
    OCEAN_VIEW("Ocean View"),
    PARTIAL_OCEAN_VIEW("Partial Ocean View"),
    PARK_VIEW("Park View"),
    POOL_VIEW("Pool View"),
    RESORT_VIEW("Resort View"),
    RIVER_VIEW("River View"),
    SEA_VIEW("Sea View"),
    PARTIAL_SEA_VIEW("Partial Sea View"),
    VALLEY_VIEW("Valley View"),
    VINEYARD_VIEW("Vineyard View"),
    WATER_VIEW("Water View");

    @Getter(onMethod = @__(@JsonValue))
    private final String value;

}

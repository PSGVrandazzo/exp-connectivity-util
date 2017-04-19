package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum RateVerificationThresholdsSourceModel {

    RECENT_BOOKINGS("RecentBookings"),
    MANUAL_OVERRIDE("ManualOverride");

    @Getter(onMethod = @__(@JsonValue))
    private String value;
}

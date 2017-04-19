package com.expedia.eps.property.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum StatusCodes {

    PROPERTYSAVED("PropertySaved"),
    EXPEDIAIDASSIGNED("ExpediaIdAssigned"),
    ONBOARDINGSUCCEEDED("OnboardingSucceeded"),
    EXPEDIAIDASSIGNMENTPENDING("ExpediaIdAssignmentPending"),
    ONBOARDINGFAILED("OnboardingFailed"),
    FINANCESETUPPENDING("FinanceSetupPending"),
    FINANCESETUPSUCCEEDED("FinanceSetupSucceeded"),
    PROPERTYDISABLED("PropertyDisabled");

    @Getter(onMethod = @__(@JsonValue))
    private String value;

}

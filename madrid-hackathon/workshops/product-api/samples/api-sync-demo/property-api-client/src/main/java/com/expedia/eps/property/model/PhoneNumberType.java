package com.expedia.eps.property.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum PhoneNumberType {
    PHONE("Phone"),
    FAX("Fax"),
    MOBILE("Mobile");

    @Getter(onMethod = @__(@JsonValue))
    private String value;

}

package com.expedia.eps.property.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter(onMethod = @__(@JsonValue))
public enum PhoneNumberType {
    PHONE("Phone"),
    FAX("Fax"),
    MOBILE("Mobile");

    private String value;

}

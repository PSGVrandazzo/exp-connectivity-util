package com.expedia.eps.property.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhoneNumber {

    private PhoneNumberType phoneNumberType;
    private String countryAccessCode;
    private String areaCode;
    private String number;
}


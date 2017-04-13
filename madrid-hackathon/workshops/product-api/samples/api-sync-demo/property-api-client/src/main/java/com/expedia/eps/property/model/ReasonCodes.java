package com.expedia.eps.property.model;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter(onMethod = @__(@JsonValue))
public enum ReasonCodes {

    NONE("None"),
    PROPERTYDISABLED("PropertyDisabled"),
    MISSINGEXPEDIAID("MissingExpediaId"),
    MISSINGCONTACTINFO("MissingContactInfo"),
    BOOKABLEPROVIDERSEXIST("BookableProvidersExist"),
    INVALIDPROPERTYNAME("InvalidPropertyName"),
    INVALIDCOORDINATES("InvalidCoordinates"),
    NOVALIDADDRESSES("NoValidAddresses"),
    NOVALIDPHONENUMBERS("NoValidPhoneNumbers"),
    INVALIDCOUNTRYCODE("InvalidCountryCode"),
    INTERNALERROR("InternalError"),
    UNSUPPORTEDLOCATION("UnsupportedLocation"),
    PROPERTYSUSPENDED("PropertySuspended"),
    EPCONBOARDINGINPROGRESS("EpcOnboardingInProgress"),
    OFACCHECKFAILED("OfacCheckFailed"),
    MISSINGBILLINGCURRENCYCODE("MissingBillingCurrencyCode");

    private String value;
}

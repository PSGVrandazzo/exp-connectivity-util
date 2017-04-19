package com.expedia.eps.property.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyContacts {

    private Contact property;
    private Contact reservationManager;
    private Contact alternateReservationManager;
    private Contact generalManager;
    private Contact propertyExtranetUser;

}


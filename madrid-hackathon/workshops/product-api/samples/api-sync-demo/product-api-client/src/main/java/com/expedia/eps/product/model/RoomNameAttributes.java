package com.expedia.eps.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomNameAttributes {

    private String typeOfRoom;
    private String roomClass;
    private Boolean includeBedType;
    private String bedroomDetails;
    private Boolean includeSmokingPref;
    private Boolean accessibility;
    private String view;
    private String featuredAmenity;
    private String area;
    private String customLabel;
}

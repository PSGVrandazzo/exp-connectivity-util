package com.expedia.eps.property.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Amenity {

    private String code;
    private String detailCode;
    private Double value;

}


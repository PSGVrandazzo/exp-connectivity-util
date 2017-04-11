package com.expedia.eps.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomSize {

    private Integer squareFeet;
    private Integer squareMeters;
}

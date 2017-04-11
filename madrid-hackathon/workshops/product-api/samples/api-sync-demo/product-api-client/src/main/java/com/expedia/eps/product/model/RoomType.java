package com.expedia.eps.product.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomType {

    private Integer resourceId;
    private String partnerCode;
    private RoomTypeName name;
    private ActiveStatus status;
    private List<RoomTypeAgeCategory> ageCategories;
    private Occupancy maxOccupancy;
    private List<BeddingOption> standardBedding;
    private List<ExtraBed> extraBedding;
    private List<SmokingPreferenceModel> smokingPreferences;
    private RoomSize roomSize;
    private List<RoomViewModel> views;
    private Boolean wheelchairAccessibility;
}

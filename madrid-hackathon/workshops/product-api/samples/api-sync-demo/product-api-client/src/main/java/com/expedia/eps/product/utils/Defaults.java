package com.expedia.eps.product.utils;

import com.expedia.eps.product.model.Bed;
import com.expedia.eps.product.model.BeddingOption;
import com.expedia.eps.product.model.Occupancy;
import com.expedia.eps.product.model.RoomNameAttributes;
import com.expedia.eps.product.model.RoomType;
import com.expedia.eps.product.model.RoomTypeAgeCategory;
import com.expedia.eps.product.model.RoomTypeName;
import com.expedia.eps.product.model.SmokingPreferenceModel;

import java.util.ArrayList;
import java.util.List;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Defaults {

    public RoomType defaultRoomType(String partnerCode) {
        final RoomNameAttributes nameAttributes = RoomNameAttributes.builder()
            .build();
        final RoomTypeName roomName = RoomTypeName.builder()
            .attributes(nameAttributes)
            .build();
        final List<RoomTypeAgeCategory> ageCategories = new ArrayList<>();
        final Occupancy occupancy = Occupancy.builder()
            .build();

        final List<Bed> beds = new ArrayList<>();
        final List<BeddingOption> standardBeddingOptions = new ArrayList<>();
        final List<SmokingPreferenceModel> smokingPreferences = new ArrayList<>();
        return RoomType.builder()
            .partnerCode(partnerCode)
            .name(roomName)
            .ageCategories(ageCategories)
            .maxOccupancy(occupancy)
            .standardBedding(standardBeddingOptions)
            .smokingPreferences(smokingPreferences)
            .build();
    }

}

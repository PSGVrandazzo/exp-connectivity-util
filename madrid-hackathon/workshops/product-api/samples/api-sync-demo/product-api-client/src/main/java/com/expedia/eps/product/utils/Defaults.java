package com.expedia.eps.product.utils;

import static com.expedia.eps.product.model.BedTypeModel.KingBed;
import static com.expedia.eps.product.model.BedTypeModel.QueenBed;
import static com.expedia.eps.product.model.RoomTypeAgeCategory.CategoryModel.ADULT;
import static com.expedia.eps.product.model.RoomTypeAgeCategory.CategoryModel.CHILD_AGE_A;
import static com.expedia.eps.product.model.RoomTypeAgeCategory.CategoryModel.INFANT;
import static com.expedia.eps.product.model.SmokingPreferenceModel.NON_SMOKING;
import static com.expedia.eps.product.model.SmokingPreferenceModel.SMOKING;

import com.expedia.eps.product.model.Bed;
import com.expedia.eps.product.model.BeddingOption;
import com.expedia.eps.product.model.Occupancy;
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
        final RoomTypeName roomName = RoomTypeName.builder()
            .value("Standard Room")
            .build();
        final List<RoomTypeAgeCategory> ageCategories = new ArrayList<>();
        ageCategories.add(
            RoomTypeAgeCategory.builder()
                .category(ADULT)
                .minAge(18)
                .build());
        ageCategories.add(
            RoomTypeAgeCategory.builder()
                .category(CHILD_AGE_A)
                .minAge(12)
                .build());
        ageCategories.add(
            RoomTypeAgeCategory.builder()
                .category(INFANT)
                .minAge(1)
                .build());

        final Occupancy occupancy = Occupancy.builder()
            .adults(3)
            .children(2)
            .total(4)
            .build();

        final List<Bed> beds = new ArrayList<>();
        beds.add(
            Bed.builder()
                .type(KingBed)
                .quantity(1)
                .build());
        beds.add(
            Bed.builder()
                .type(QueenBed)
                .quantity(2)
                .build());

        final List<BeddingOption> standardBeddingOptions = new ArrayList<>();
        standardBeddingOptions.add(
            BeddingOption.builder()
                .options(beds)
                .build());
        final List<SmokingPreferenceModel> smokingPreferences = new ArrayList<>();
        smokingPreferences.add(SMOKING);
        smokingPreferences.add(NON_SMOKING);
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

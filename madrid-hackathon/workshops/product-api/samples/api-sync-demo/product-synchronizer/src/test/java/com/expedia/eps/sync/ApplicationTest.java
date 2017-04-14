package com.expedia.eps.sync;

import static com.expedia.eps.product.model.RoomTypeAgeCategory.CategoryModel.ADULT;
import static com.expedia.eps.product.model.RoomTypeAgeCategory.CategoryModel.CHILD_AGE_A;
import static com.expedia.eps.product.model.RoomTypeAgeCategory.CategoryModel.INFANT;
import static com.expedia.eps.product.model.SmokingPreferenceModel.NON_SMOKING;

import com.expedia.eps.ExpediaRequest;
import com.expedia.eps.product.model.Bed;
import com.expedia.eps.product.model.BedTypeModel;
import com.expedia.eps.product.model.BeddingOption;
import com.expedia.eps.product.model.Occupancy;
import com.expedia.eps.product.model.RoomNameAttributes;
import com.expedia.eps.product.model.RoomType;
import com.expedia.eps.product.model.RoomTypeAgeCategory;
import com.expedia.eps.product.model.RoomTypeName;
import com.expedia.eps.product.model.SmokingPreferenceModel;
import com.expedia.eps.sync.producers.RoomTypeProducer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ApplicationTest {

    @Autowired
    private RoomTypeProducer producer;

//    "partnerCode": "MyStringCode",
//        "name": {
//        "attributes": {
//            "typeOfRoom": "Penthouse",
//                "roomClass": "Executive",
//                "includeBedType": true,
//                "view": "City View",
//                "featuredAmenity": "Jetted Tub",
//                "customLabel": "Rooftop Terrace"
//        }
//    },
//        "ageCategories": [
//    {
//        "category": "Adult",
//        "minAge": 18
//    },
//    {
//        "category": "ChildAgeA",
//        "minAge": 6
//    },
//    {
//        "category": "Infant",
//        "minAge": 0
//    }
//        ],
//            "maxOccupancy": {
//        "adults": 2,
//            "children": 1,
//            "total": 3
//    },
//        "standardBedding": [
//    {
//        "option": [
//        {
//            "quantity": 1,
//            "type": "King Bed"
//        }
//                ]
//    }
//        ],
//            "extraBedding": [
//    {
//        "quantity": 1,
//        "type": "Rollaway Bed",
//        "size": "Full",
//        "surcharge": {
//        "type": "Per Day",
//            "amount": 20
//    }
//    }
//        ],
//            "smokingPreferences": [
//            "Non-Smoking"
//            ],
//            "roomSize": {
//        "squareFeet": 300,
//            "squareMeters": 14
//    },
//        "views": [
//        "Ocean View",
//        "Beach View"
//        ]

    @Test
    public void testReceive() throws Exception {

        final RoomNameAttributes nameAttributes = RoomNameAttributes.builder()
            .typeOfRoom("Penthouse")
            .roomClass("Executive")
            .includeBedType(true)
            .view("City View")
            .customLabel("Featured Rooftop")
            .build();

        final RoomTypeName roomName = RoomTypeName.builder()
            .attributes(nameAttributes)
            .build();

        final List<RoomTypeAgeCategory> ageCategories = new ArrayList<>();
        ageCategories.add(
            RoomTypeAgeCategory.builder()
            .category(ADULT)
            .minAge(18)
            .build()
        );
        ageCategories.add(
            RoomTypeAgeCategory.builder()
                .category(CHILD_AGE_A)
                .minAge(6)
                .build()
        );
        ageCategories.add(
            RoomTypeAgeCategory.builder()
                .category(INFANT)
                .minAge(0)
                .build()
        );

        final Occupancy occupancy = Occupancy.builder()
            .adults(2)
            .children(1)
            .build();

        final List<Bed> beds = new ArrayList<>();
        beds.add(
            Bed.builder()
            .type(BedTypeModel.QueenBed)
            .quantity(2)
            .build()
        );

        final List<BeddingOption> standardBeddingOptions = new ArrayList<>();
        standardBeddingOptions.add(
            BeddingOption.builder()
            .options(beds)
            .build()
        );

        final List<SmokingPreferenceModel> smokingPreferences = new ArrayList<>();
        smokingPreferences.add(NON_SMOKING);

        final RoomType room = RoomType.builder()
            .partnerCode("Test Room")
            .name(roomName)
            .ageCategories(ageCategories)
            .maxOccupancy(occupancy)
            .standardBedding(standardBeddingOptions)
            .smokingPreferences(smokingPreferences)
            .build();

        final ExpediaRequest<RoomType> request = ExpediaRequest.<RoomType>builder()
            .payload(room)
            .propertyId(12933870)
            .build();

        try {
            producer.send(request);
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }
}

package com.expedia.eps.product;

import com.expedia.eps.ExpediaResponse;
import com.expedia.eps.product.model.Property;
import com.expedia.eps.product.model.RatePlan;
import com.expedia.eps.product.model.RoomType;

import java.util.List;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import rx.Observable;

public interface ProductApi {

    @Headers({
        "Accept: application/vnd.expedia.eps.product-v2+json"
    })
    @RequestLine("GET /properties")
    Observable<ExpediaResponse<List<Property>>> getProperties();

    @Headers({
        "Accept: application/vnd.expedia.eps.product-v2+json"
    })
    @RequestLine("GET /properties/{propertyId}/roomTypes")
    Observable<ExpediaResponse<List<RoomType>>> getRoomTypes(@Param("propertyId") Integer propertyId);

    @Headers({
        "Accept: application/vnd.expedia.eps.product-v2+json"
    })
    @RequestLine("GET /properties/{propertyId}/roomTypes/{roomTypeId}")
    Observable<ExpediaResponse<RoomType>> getRoomTypeById(@Param("propertyId") Integer propertyId,
                                                          @Param("roomTypeId") Integer roomTypeId);

    @Headers({
        "Accept: application/vnd.expedia.eps.product-v2+json",
        "Content-Type: application/vnd.expedia.eps.product-v2+json"
    })
    @RequestLine("POST /properties/{propertyId}/roomTypes")
    Observable<ExpediaResponse<RoomType>> createRoomType(@Param("propertyId") Integer propertyId, RoomType roomType);

    @Headers({
        "Accept: application/vnd.expedia.eps.product-v2+json"
    })
    @RequestLine("GET /properties/{propertyId}/roomTypes/{roomTypeId}/ratePlans")
    Observable<ExpediaResponse<List<RatePlan>>> getRatePlans(@Param("propertyId") Integer propertyId,
                                                             @Param("roomTypeId") Integer roomTypeId);

    @Headers({
        "Accept: application/vnd.expedia.eps.product-v2+json"
    })
    @RequestLine("GET /properties/{propertyId}/roomTypes/{roomTypeId}/ratePlans/{ratePlanId}")
    Observable<ExpediaResponse<RatePlan>> getRatePlanById(@Param("propertyId") Integer propertyId,
                                                          @Param("roomTypeId") Integer roomTypeId,
                                                          @Param("ratePlanId") Integer ratePlanId);

    @Headers({
        "Accept: application/vnd.expedia.eps.product-v2+json",
        "Content-Type: application/vnd.expedia.eps.product-v2+json"
    })
    @RequestLine("POST /properties/{propertyId}/roomTypes/{roomTypeId}/ratePlans")
    Observable<ExpediaResponse<RatePlan>> createRatePlan(@Param("propertyId") Integer propertyId,
                                                         @Param("roomTypeId") Integer roomTypeId,
                                                         RatePlan ratePlan);
}

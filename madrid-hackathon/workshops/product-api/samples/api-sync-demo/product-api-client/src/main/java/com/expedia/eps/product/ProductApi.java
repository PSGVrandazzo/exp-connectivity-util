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
        "Request-ID: {guid}",
        "Accept: application/vnd.expedia.eps.product-v2+json"
    })
    @RequestLine("GET /properties")
    Observable<ExpediaResponse<List<Property>>> getProperties(@Param("guid") String requestId);

    @Headers({
        "Request-ID: {guid}",
        "Accept: application/vnd.expedia.eps.product-v2+json"
    })
    @RequestLine("GET /properties/{propertyId}/roomTypes")
    Observable<ExpediaResponse<List<RoomType>>> getRoomTypes(@Param("guid") String requestId,
                                                             @Param("propertyId") Integer propertyId);

    @Headers({
        "Request-ID: {guid}",
        "Accept: application/vnd.expedia.eps.product-v2+json"
    })
    @RequestLine("GET /properties/{propertyId}/roomTypes/{roomTypeId}")
    Observable<ExpediaResponse<RoomType>> getRoomTypeById(@Param("guid") String requestId,
                                                          @Param("propertyId") Integer propertyId,
                                                          @Param("roomTypeId") Integer roomTypeId);

    @Headers({
        "Request-ID: {guid}",
        "Accept: application/vnd.expedia.eps.product-v2+json",
        "Content-Type: application/vnd.expedia.eps.product-v2+json"
    })
    @RequestLine("POST /properties/{propertyId}/roomTypes")
    Observable<ExpediaResponse<RoomType>> createRoomType(@Param("guid") String requestId,
                                                         @Param("propertyId") Integer propertyId,
                                                         RoomType roomType);

    @Headers({
        "Request-ID: {guid}",
        "Accept: application/vnd.expedia.eps.product-v2+json",
        "Content-Type: application/vnd.expedia.eps.product-v2+json"
    })
    @RequestLine("PUT /properties/{propertyId}/roomTypes/{roomTypeId}")
    Observable<ExpediaResponse<RoomType>> updateRoomType(@Param("guid") String requestId,
                                                         @Param("propertyId") Integer propertyId,
                                                         @Param("roomTypeId") Integer roomTypeId,
                                                         RoomType roomType);

    @Headers({
        "Request-ID: {guid}",
        "Accept: application/vnd.expedia.eps.product-v2+json",
        "Content-Type: application/vnd.expedia.eps.product-v2+json"
    })
    @RequestLine("PATCH /properties/{propertyId}/roomTypes/{roomTypeId}")
    Observable<ExpediaResponse<RoomType>> patchRoomType(@Param("guid") String requestId,
                                                        @Param("propertyId") Integer propertyId,
                                                        @Param("roomTypeId") Integer roomTypeId,
                                                        String patch);

    @Headers({
        "Request-ID: {guid}",
        "Accept: application/vnd.expedia.eps.product-v2+json"
    })
    @RequestLine("GET /properties/{propertyId}/roomTypes/{roomTypeId}/ratePlans")
    Observable<ExpediaResponse<List<RatePlan>>> getRatePlans(@Param("guid") String requestId,
                                                             @Param("propertyId") Integer propertyId,
                                                             @Param("roomTypeId") Integer roomTypeId);

    @Headers({
        "Request-ID: {guid}",
        "Accept: application/vnd.expedia.eps.product-v2+json"
    })
    @RequestLine("GET /properties/{propertyId}/roomTypes/{roomTypeId}/ratePlans/{ratePlanId}")
    Observable<ExpediaResponse<RatePlan>> getRatePlanById(@Param("guid") String requestId,
                                                          @Param("propertyId") Integer propertyId,
                                                          @Param("roomTypeId") Integer roomTypeId,
                                                          @Param("ratePlanId") Integer ratePlanId);

    @Headers({
        "Request-ID: {guid}",
        "Accept: application/vnd.expedia.eps.product-v2+json",
        "Content-Type: application/vnd.expedia.eps.product-v2+json"
    })
    @RequestLine("POST /properties/{propertyId}/roomTypes/{roomTypeId}/ratePlans")
    Observable<ExpediaResponse<RatePlan>> createRatePlan(@Param("guid") String requestId,
                                                         @Param("propertyId") Integer propertyId,
                                                         @Param("roomTypeId") Integer roomTypeId,
                                                         RatePlan ratePlan);

    @Headers({
        "Request-ID: {guid}",
        "Accept: application/vnd.expedia.eps.product-v2+json",
        "Content-Type: application/vnd.expedia.eps.product-v2+json"
    })
    @RequestLine("PATCH /properties/{propertyId}/roomTypes/{roomTypeId}/ratePlans/{ratePlanId}")
    Observable<ExpediaResponse<RatePlan>> patchRatePlan(@Param("guid") String requestId,
                                                        @Param("propertyId") Integer propertyId,
                                                        @Param("roomTypeId") Integer roomTypeId,
                                                        @Param("ratePlanId") Integer ratePlanId,
                                                        String patch);

    @Headers({
        "Request-ID: {guid}",
        "Accept: application/vnd.expedia.eps.product-v2+json"
    })
    @RequestLine("PUT /properties/{propertyId}/roomTypes/{roomTypeId}/ratePlans/{ratePlanId}")
    Observable<ExpediaResponse<RatePlan>> updateRatePlan(@Param("guid") String requestId,
                                                         @Param("propertyId") Integer propertyId,
                                                         @Param("roomTypeId") Integer roomTypeId,
                                                         @Param("ratePlanId") Integer ratePlanId,
                                                         RatePlan ratePlan);

    @Headers({
        "Request-ID: {guid}",
        "Accept: application/vnd.expedia.eps.product-v2+json"
    })
    @RequestLine("DELETE /properties/{propertyId}/roomTypes/{roomTypeId}/ratePlans/{ratePlanId}")
    Observable<Void> deleteRatePlan(@Param("guid") String requestId,
                                    @Param("propertyId") Integer propertyId,
                                    @Param("roomTypeId") Integer roomTypeId,
                                    @Param("ratePlanId") Integer ratePlanId);

}

package com.expedia.eps.product;

import static java.util.Optional.ofNullable;

import com.expedia.eps.product.model.Property;
import com.expedia.eps.product.model.RatePlan;
import com.expedia.eps.product.model.RoomType;

import java.util.List;

import feign.Param;
import feign.RequestInterceptor;
import feign.RequestLine;
import feign.RequestTemplate;
import lombok.AllArgsConstructor;
import rx.Observable;

public interface ProductApi {

    String PRODUCT_API_V2 = "application/vnd.expedia.eps.product-v2+json";

    @RequestLine("GET /properties")
    Observable<ExpediaResponse<List<Property>>> getProperties();

    @RequestLine("GET /properties/{propertyId}/roomTypes")
    Observable<ExpediaResponse<List<RoomType>>> getRoomTypes(@Param("propertyId") Integer propertyId);

    @RequestLine("GET /properties/{propertyId}/roomTypes/{roomTypeId}")
    Observable<ExpediaResponse<RoomType>> getRoomTypeById(@Param("propertyId") Integer propertyId,
                                                          @Param("roomTypeId") Integer roomTypeId);

    @RequestLine("POST /properties/{propertyId}/roomTypes")
    Observable<ExpediaResponse<RoomType>> createRoomType(@Param("propertyId") Integer propertyId, RoomType roomType);

    @RequestLine("GET /properties/{propertyId}/roomTypes/{roomTypeId}/ratePlans")
    Observable<ExpediaResponse<List<RatePlan>>> getRatePlans(@Param("propertyId") Integer propertyId,
                                                             @Param("roomTypeId") Integer roomTypeId);

    @RequestLine("GET /properties/{propertyId}/roomTypes/{roomTypeId}/ratePlans/{ratePlanId}")
    Observable<ExpediaResponse<RatePlan>> getRatePlanById(@Param("propertyId") Integer propertyId,
                                                          @Param("roomTypeId") Integer roomTypeId,
                                                          @Param("ratePlanId") Integer ratePlanId);

    @RequestLine("POST /properties/{propertyId}/roomTypes/{roomTypeId}/ratePlans")
    Observable<ExpediaResponse<RatePlan>> createRatePlan(@Param("propertyId") Integer propertyId,
                                                         @Param("roomTypeId") Integer roomTypeId,
                                                         RatePlan ratePlan);

    @AllArgsConstructor
    class ExpediaAuthenticationInterceptor implements RequestInterceptor {

        private ExpediaCredentials credentials;

        public void apply(RequestTemplate template) {
            template.header("Accept", PRODUCT_API_V2);
            switch (template.method()) {
                case "PUT":
                case "POST":
                case "PATCH":
                    template.header("Content-Type", PRODUCT_API_V2);
                    break;
            }
            ofNullable(credentials)
                .ifPresent(auth -> template.header("Authorization", auth.asBasicAuthorizationHeader()));
        }
    }
}

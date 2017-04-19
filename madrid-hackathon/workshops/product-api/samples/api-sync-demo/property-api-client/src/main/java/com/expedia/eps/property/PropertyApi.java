package com.expedia.eps.property;

import com.expedia.eps.ExpediaResponse;
import com.expedia.eps.property.model.Property;
import com.expedia.eps.property.model.PropertyResponse;
import com.expedia.eps.property.model.PropertyStatus;

import java.util.List;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.http.ResponseEntity;
import rx.Observable;

public interface PropertyApi {

    //    @Headers({
//        "Request-ID: {guid}",
//        "TUID: 69107528",
//        "Accept: application/json"
//    })
//    @RequestLine("GET /v1/properties/{provider}/{providerPropertyId}")
//    Observable<ExpediaResponse<Property>> getProperty(@Param("guid") String requestId,
//                                                            @Param("provider") String provider,
//                                                            @Param("providerPropertyId") String providerPropertyId);
//
    @Headers({
        "Request-ID: {guid}",
        "Accept: application/json",
        "Content-Type: application/json"
    })
    @RequestLine("POST /v1/properties/{provider}")
    Observable<ExpediaResponse<PropertyResponse>> createOrUpdateProperties(@Param("guid") String requestId,
                                                                           @Param("provider") String provider,
                                                                           List<Property> properties);
//
//    @Headers({
//        "Request-ID: {guid}",
//        "TUID: 69107528",
//        "Accept: application/json",
//        "Content-Type: application/json"
//    })
//    @RequestLine("DELETE /v1/properties/{provider}/{providerPropertyId")
//    Observable<ExpediaResponse> deleteProperty(@Param("guid") String requestId,
//                                               @Param("provider") String provider,
//                                               @Param("providerPropertyId") String providerPropertyId);

    @Headers({
        "Request-ID: {guid}",
        "Accept: application/json"
    })
    @RequestLine("GET /v1/properties/{provider}/{providerPropertyId}/status")
    Observable<ExpediaResponse<PropertyStatus>> getPropertyStatus(@Param("guid") String requestId,
                                                                  @Param("provider") String provider,
                                                                  @Param("providerPropertyId") String providerPropertyId);
}

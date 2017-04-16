package com.expedia.eps.image;

import com.expedia.eps.ExpediaResponse;
import com.expedia.eps.image.model.Image;

import java.util.List;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import rx.Observable;

public interface ImageApi {

    @Headers({
        "Request-ID: {guid}",
        "Accept: application/json"
    })
    @RequestLine("GET /properties/{propertyId}/images")
    Observable<ExpediaResponse<List<Image>>> getImages(@Param("guid") String requestId,
                                                       @Param("propertyId") Integer propertyId);

    @Headers({
        "Request-ID: {guid}",
        "Accept: application/json",
        "Content-Type: application/json"
    })
    @RequestLine("POST /properties/{propertyId}/images")
    Observable<ExpediaResponse<Image>> createImage(@Param("guid") String requestId,
                                                   @Param("propertyId") Integer propertyId,
                                                   Image image);

    @Headers({
        "Request-ID: {guid}",
        "Accept: application/json",
        "Content-Type: application/json"
    })
    @RequestLine("PATCH /properties/{propertyId}/images/{resourceId}")
    Observable<ExpediaResponse<Image>> patchImage(@Param("guid") String requestId,
                                                  @Param("propertyId") Integer propertyId,
                                                  @Param("resourceId") String resourceId,
                                                  String patch);

    @Headers({
        "Request-ID: {guid}",
        "Accept: application/json",
        "Content-Type: application/json"
    })
    @RequestLine("DELETE /properties/{propertyId}/images/{resourceId}")
    Observable<Void> deleteImage(@Param("guid") String requestId,
                                 @Param("propertyId") Integer propertyId,
                                 @Param("resourceId") String resourceId);
}

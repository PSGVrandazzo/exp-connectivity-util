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
        "Accept: application/json"
    })
    @RequestLine("GET /properties/{propertyId}/images")
    Observable<ExpediaResponse<List<Image>>> getImages(@Param("propertyId") Integer propertyId);

}

package com.expedia.eps.product;

import static java.util.Optional.ofNullable;

import com.expedia.eps.product.model.Property;

import java.util.List;

import feign.RequestInterceptor;
import feign.RequestLine;
import feign.RequestTemplate;
import lombok.AllArgsConstructor;

public interface ProductApi {

    String PRODUCT_API_V2 = "application/vnd.expedia.eps.product-v2+json";

    @RequestLine("GET /properties")
    ExpediaResponse<List<Property>> getProperties();

    @AllArgsConstructor
    class ExpediaAuthenticationInterceptor implements RequestInterceptor {

        private ExpediaCredentials credentials;

        public void apply(RequestTemplate template) {
            template.header("Accept", PRODUCT_API_V2);
            ofNullable(credentials)
                .ifPresent(auth -> template.header("Authorization", auth.asBasicAuthorizationHeader()));
        }
    }

}

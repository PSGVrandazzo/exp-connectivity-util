package com.expedia.eps;

import static java.util.Optional.ofNullable;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.Builder;

@Builder
public class ExpediaAuthenticationInterceptor implements RequestInterceptor {

    private ExpediaCredentials credentials;

    public void apply(RequestTemplate template) {
        ofNullable(credentials)
            .ifPresent(auth -> template.header("Authorization", auth.asBasicAuthorizationHeader()));
    }
}

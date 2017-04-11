package com.expedia.eps.product;

import static java.lang.String.format;
import static java.util.Base64.getEncoder;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class ExpediaCredentials {

    private String username;
    private String password;

    String asBasicAuthorizationHeader() {
        final String basicHeader = format("%s:%s", username, password);
        return format("Basic %s", new String(getEncoder().encode(basicHeader.getBytes())));
    }
}

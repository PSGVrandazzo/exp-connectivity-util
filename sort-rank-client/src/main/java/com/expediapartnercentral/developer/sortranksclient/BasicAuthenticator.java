/*
This file is copyright Expedia, Inc., and it is provided under the Expedia Connectivity Terms and Conditions.
Your viewing and use of this file contitutes consent to the Expedia Connectivity Terms and Conditions (https://developer.expediapartnercentral.com/terms)
 */

package com.expediapartnercentral.developer.sortranksclient;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class BasicAuthenticator implements ClientRequestFilter {

    private final String user;
    private final String password;

    public BasicAuthenticator(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public void filter(ClientRequestContext requestContext) throws IOException {
        MultivaluedMap<String, Object> headers = requestContext.getHeaders();
        final String basicAuthentication = getBasicAuthentication();
        headers.add("Authorization", basicAuthentication);

    }

    private String getBasicAuthentication() {
        String token = this.user + ":" + this.password;
        try {
            return "BASIC " + DatatypeConverter.printBase64Binary(token.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            throw new IllegalStateException("Cannot encode with UTF-8", ex);
        }
    }
}
package com.expedia.eps;

import static org.assertj.core.api.Assertions.assertThat;

import com.expedia.eps.ProductApi.ExpediaAuthenticationInterceptor;
import com.expedia.eps.model.ExpediaResponse;
import com.expedia.eps.model.Property;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class ProductApiTest {

    private ProductApi api;

    @Before
    public void setup() {
        final ExpediaCredentials credentials = ExpediaCredentials.builder()
            .username("EQCtest12933870")
            .password("ew67nk33")
            .build();
        this.api = Feign.builder()
            .decoder(new JacksonDecoder())
            .encoder(new JacksonEncoder())
            .requestInterceptor(new ExpediaAuthenticationInterceptor(credentials))
            .target(ProductApi.class, "https://services.expediapartnercentral.com/products");
    }

    @Test
    public void testGetProperties() {

        // When
        final ExpediaResponse<List<Property>> response = this.api.getProperties();

        // Then
        assertThat(response).isNotNull();
        assertThat(response.getErrors()).isNullOrEmpty();
        assertThat(response.getEntity()).isNotEmpty();
    }
}

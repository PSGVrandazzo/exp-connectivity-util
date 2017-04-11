package com.expedia.eps.product;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES;
import static org.assertj.core.api.Assertions.assertThat;

import com.expedia.eps.product.model.Property;
import com.expedia.eps.product.model.RoomType;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import feign.Logger;
import feign.hystrix.HystrixFeign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.slf4j.Slf4jLogger;

public class ProductApiTest {

    private static final String EQC_TEST_ACCOUNT_USERNAME = "EQCtest12933870";
    private static final String EQC_TEST_ACCOUNT_PASSWORD = "ew67nk33";

    private ProductApi api;

    @Before
    public void setup() {
        final ExpediaCredentials credentials = ExpediaCredentials.builder()
            .username(EQC_TEST_ACCOUNT_USERNAME)
            .password(EQC_TEST_ACCOUNT_PASSWORD)
            .build();
        final ObjectMapper objectMapper = buildObjectMapper();
        this.api = HystrixFeign.builder()
            .decoder(new JacksonDecoder(objectMapper))
            .encoder(new JacksonEncoder(objectMapper))
            .logger(new Slf4jLogger())
            .logLevel(Logger.Level.FULL)
            .requestInterceptor(new ProductApi.ExpediaAuthenticationInterceptor(credentials))
            .target(ProductApi.class, "https://services.expediapartnercentral.com/products");
    }

    @Test
    public void testGetProperties() {

        // When
        final ExpediaResponse<List<Property>> response = this.api.getProperties().toBlocking().single();

        // Then
        assertThat(response).isNotNull();
        assertThat(response.errors).isNullOrEmpty();
        assertThat(response.entity).isNotEmpty();
    }

    @Test
    public void getRoomTypes() {

        // Given
        this.api.getProperties().toBlocking().subscribe(response -> {

            // When
            final Integer propertyId = response.entity.stream().findFirst()
                .map(Property::getResourceId)
                .orElseThrow(() -> new RuntimeException("Failed test"));

            // Then
            final ExpediaResponse<List<RoomType>> rooms = this.api.getRoomTypes(propertyId).toBlocking().first();
            assertThat(rooms).isNotNull();
            assertThat(rooms.entity).isNotEmpty();
        });
    }

    private ObjectMapper buildObjectMapper() {
        return new ObjectMapper()
            .configure(FAIL_ON_IGNORED_PROPERTIES, false)
            .setSerializationInclusion(NON_NULL);
    }
}

package com.expedia.eps.image;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES;
import static org.assertj.core.api.Assertions.assertThat;

import com.expedia.eps.ExpediaAuthenticationInterceptor;
import com.expedia.eps.ExpediaCredentials;
import com.expedia.eps.ExpediaResponse;
import com.expedia.eps.image.model.Image;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import feign.Logger;
import feign.hystrix.HystrixFeign;
import feign.hystrix.SetterFactory;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.slf4j.Slf4jLogger;

public class ImageApiTest {

    private static final String EQC_TEST_ACCOUNT_USERNAME = "EQCtest12933870";
    private static final String EQC_TEST_ACCOUNT_PASSWORD = "ew67nk33";
    private static final Integer EQC_TEST_PROPERTY_ID = 12933870;

    private ImageApi api;

    @Before
    public void setup() {
        final ExpediaCredentials credentials = ExpediaCredentials.builder()
            .username(EQC_TEST_ACCOUNT_USERNAME)
            .password(EQC_TEST_ACCOUNT_PASSWORD)
            .build();
        final ObjectMapper objectMapper = buildObjectMapper();
        final SetterFactory customSetter = buildHystrixSetter();
        this.api = HystrixFeign.builder()
            .setterFactory(customSetter)
            .decoder(new JacksonDecoder(objectMapper))
            .encoder(new JacksonEncoder(objectMapper))
            .logger(new Slf4jLogger())
            .logLevel(Logger.Level.FULL)
            .requestInterceptor(ExpediaAuthenticationInterceptor.builder().credentials(credentials).build())
            .target(ImageApi.class, "https://services.expediapartnercentral.com");
    }

    @Test
    public void testGetImages() {

        // When
        final ExpediaResponse<List<Image>> response = this.api.getImages(EQC_TEST_PROPERTY_ID).toBlocking().single();

        // Then
        assertThat(response).isNotNull();
        assertThat(response.getErrors()).isNullOrEmpty();
        assertThat(response.getEntity()).isNotEmpty();
    }

    private ObjectMapper buildObjectMapper() {
        return new ObjectMapper()
            .configure(FAIL_ON_IGNORED_PROPERTIES, false)
            .registerModule(new JavaTimeModule())
            .setSerializationInclusion(NON_NULL);
    }

    private SetterFactory buildHystrixSetter() {
        return (target, method) -> {
            String groupKey = target.name();
            String commandKey = method.getName();
            return HystrixCommand.Setter
                .withGroupKey(HystrixCommandGroupKey.Factory.asKey(groupKey))
                .andCommandKey(HystrixCommandKey.Factory.asKey(commandKey));
        };
    }
}

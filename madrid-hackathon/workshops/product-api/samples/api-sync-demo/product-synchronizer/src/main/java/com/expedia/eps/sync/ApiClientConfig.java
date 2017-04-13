package com.expedia.eps.sync;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES;

import com.expedia.eps.ExpediaAuthenticationInterceptor;
import com.expedia.eps.ExpediaCredentials;
import com.expedia.eps.image.ImageApi;
import com.expedia.eps.product.ProductApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;
import feign.hystrix.HystrixFeign;
import feign.hystrix.SetterFactory;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.slf4j.Slf4jLogger;

@Configuration
public class ApiClientConfig {

    @Bean
    @ConditionalOnMissingBean
    public SetterFactory buildHystrixSetter() {
        return (target, method) -> {
            String groupKey = target.name();
            String commandKey = method.getName();
            return HystrixCommand.Setter
                .withGroupKey(HystrixCommandGroupKey.Factory.asKey(groupKey))
                .andCommandKey(HystrixCommandKey.Factory.asKey(commandKey));
        };
    }

    @Bean
    @ConditionalOnMissingBean
    public ExpediaCredentials expediaCredentials(@Value("${expedia.credentials.username}") String username,
                                                 @Value("${expedia.credentials.password}") String password) {
        return ExpediaCredentials.builder()
            .username(username)
            .password(password)
            .build();
    }

    @Bean
    public ImageApi imageApi(@Value("${expedia.imageApi.url}") String imageApiUrl,
                             SetterFactory customHystrixSetter,
                             ExpediaCredentials credentials) {
        final ObjectMapper customObjectMapper = customObjectMapper();
        return HystrixFeign.builder()
            .setterFactory(customHystrixSetter)
            .decoder(new JacksonDecoder(customObjectMapper))
            .encoder(new JacksonEncoder(customObjectMapper))
            .logger(new Slf4jLogger())
            .logLevel(Logger.Level.BASIC)
            .requestInterceptor(ExpediaAuthenticationInterceptor.builder().credentials(credentials).build())
            .target(ImageApi.class, imageApiUrl);
    }

    @Bean
    public ProductApi productApi(@Value("${expedia.productApi.url}") String productApiUrl,
                                 SetterFactory customHystrixSetter,
                                 ExpediaCredentials credentials) {
        final ObjectMapper customObjectMapper = customObjectMapper();
        return HystrixFeign.builder()
            .setterFactory(customHystrixSetter)
            .decoder(new JacksonDecoder(customObjectMapper))
            .encoder(new JacksonEncoder(customObjectMapper))
            .logger(new Slf4jLogger())
            .logLevel(Logger.Level.BASIC)
            .requestInterceptor(ExpediaAuthenticationInterceptor.builder().credentials(credentials).build())
            .target(ProductApi.class, productApiUrl);
    }

    private ObjectMapper customObjectMapper() {
        return new ObjectMapper()
            .configure(FAIL_ON_IGNORED_PROPERTIES, false)
            .registerModule(new JavaTimeModule())
            .setSerializationInclusion(NON_NULL);
    }
}

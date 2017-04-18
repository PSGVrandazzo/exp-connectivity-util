package com.expedia.eps.sync;

import static java.util.Collections.singletonList;
import static java.util.UUID.randomUUID;

import com.expedia.eps.ExpediaResponse;
import com.expedia.eps.product.ProductApi;
import com.expedia.eps.property.PropertyApi;
import com.expedia.eps.property.model.Property;
import com.expedia.eps.property.model.PropertyStatus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
import rx.Observable;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class OnboardingExample {

    @Autowired
    private PropertyApi propertyApi;

    @Autowired
    private ProductApi productApi;

    @Test
    public void onboardProperty() throws Exception {

        final String requestId = randomUUID().toString();
        final String providerId = "1000";

        // TODO: build the object you are posting
        Property property = Property.builder()
            .build();

        // Obtain the property id from Expedia
        final Integer propertyId = propertyApi.createOrUpdateProperties(requestId, providerId, singletonList(property))
            .map(ExpediaResponse::getEntity)
            .map(PropertyStatus::getExpediaId)
            .toBlocking()
            .single();

        // Now create rooms.. rates..

    }
}

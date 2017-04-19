package com.expedia.eps.sync;

import static java.util.Collections.singletonList;
import static java.util.UUID.randomUUID;

import com.expedia.eps.ExpediaResponse;
import com.expedia.eps.product.ProductApi;
import com.expedia.eps.property.PropertyApi;
import com.expedia.eps.property.model.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
import rx.Observable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        List<Address> addressList = new ArrayList<>();
        addressList.add(new Address("Calle Ruiz de Alarcon 23","","Madrid","","28014", "Spain"));

        Contact propertyContact = new Contact("John","Smith", new ArrayList<>(Arrays.asList("JohnSmith@nowhere.com")),
                new ArrayList<PhoneNumber>(Arrays.asList(new PhoneNumber(PhoneNumberType.PHONE, "1","1","1234567"))));
        PropertyContacts contracts = new PropertyContacts();
        contracts.setProperty(propertyContact);

        Property property = Property.builder()
                .providerPropertyId(requestId)
                .name("Prado National Museum")
                .addresses(addressList)
                .latitude("40.413722")
                .longitude("3.692412")
                .currencyCode("EUR")
                .contacts(contracts)
            .build();

        // Obtain the property id from Expedia
        PropertyResponse propertyResponse = propertyApi.createOrUpdateProperties(requestId, providerId, singletonList(property)).
                map(ExpediaResponse::getEntity).toBlocking().single();

        // Now create rooms.. rates..
    }
}

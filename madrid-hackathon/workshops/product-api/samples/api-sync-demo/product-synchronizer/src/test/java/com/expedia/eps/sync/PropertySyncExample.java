package com.expedia.eps.sync;

import com.expedia.eps.ExpediaRequest;
import com.expedia.eps.property.model.Property;
import com.expedia.eps.sync.producers.PropertyProducer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class PropertySyncExample {

    @Autowired
    private PropertyProducer kafkaProducer;

    @Test
    public void postNewProperty() throws Exception {

        final ExpediaRequest<Property> request = ExpediaRequest.<Property>builder()
            .payload(Property.builder().build())
            .build();
        kafkaProducer.send(request);
    }
}

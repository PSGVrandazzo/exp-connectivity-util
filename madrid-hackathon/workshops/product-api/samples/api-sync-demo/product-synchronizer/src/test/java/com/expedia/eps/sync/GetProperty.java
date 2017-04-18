package com.expedia.eps.sync;

import static com.expedia.eps.property.model.StatusCodes.ONBOARDINGSUCCEEDED;
import static java.util.UUID.randomUUID;
import static org.assertj.core.api.Assertions.assertThat;

import com.expedia.eps.ExpediaResponse;
import com.expedia.eps.property.PropertyApi;
import com.expedia.eps.property.model.PropertyStatus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class GetProperty {

    @Autowired
    private PropertyApi propertyApi;

    @Test
    public void getProperty() {

        final String requestId = randomUUID().toString();

        final PropertyStatus status = propertyApi.getPropertyStatus(requestId, "69107528", "1000", "11275")
            .map(ExpediaResponse::getEntity)
            .toBlocking()
            .single();

        assertThat(status.getCode()).isEqualTo(ONBOARDINGSUCCEEDED);
    }
}

package com.expedia.eps.sync.producers;

import com.expedia.eps.ExpediaRequest;
import com.expedia.eps.property.model.Property;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFutureCallback;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PropertyProducer {

    public static final String PROPERTY_SYNC_TOPIC = "PropertySync";

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper mapper;

    /**
     * Called whenever we need to create or update a property on Expedia's side
     */
    public void send(ExpediaRequest<Property> request) throws Exception {

        final String message = mapper.writeValueAsString(request);
        kafkaTemplate.send(PROPERTY_SYNC_TOPIC, message)
            .addCallback(callback());
    }

    private ListenableFutureCallback<SendResult<String, String>> callback() {
        return new ListenableFutureCallback<SendResult<String, String>>() {

            @Override
            public void onSuccess(SendResult<String, String> result) {}

            @Override
            public void onFailure(Throwable ex) {}
        };
    }
}

package com.expedia.eps.sync.consumers;

import static com.expedia.eps.sync.producers.PropertyProducer.PROPERTY_SYNC_TOPIC;

import com.expedia.eps.ExpediaRequest;
import com.expedia.eps.property.model.Property;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PropertyConsumer {

    private static final TypeReference<ExpediaRequest<Property>> ROOM_TYPE_MSG =
        new TypeReference<ExpediaRequest<Property>>() {
        };

    private final ObjectMapper mapper;

    /**
     * Reacts on property events by creating or updating them
     */
    @KafkaListener(topics = PROPERTY_SYNC_TOPIC)
    public void receive(String message) throws Exception {
        log.info("Message received on topic {}: {}", PROPERTY_SYNC_TOPIC, message);
    }
}

package com.expedia.eps.sync.consumers;

import static com.expedia.eps.sync.producers.RatePlanProducer.RATE_PLAN_TYPE_SYNC_TOPIC;
import static com.expedia.eps.sync.producers.RoomTypeProducer.ROOM_TYPE_SYNC_TOPIC;
import static java.util.Objects.isNull;

import com.expedia.eps.ExpediaRequest;
import com.expedia.eps.product.ProductApi;
import com.expedia.eps.product.model.RatePlan;
import com.expedia.eps.product.model.RoomType;
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
public class RatePlanConsumer {

    private static final TypeReference<ExpediaRequest<RatePlan>> RATE_PLAN_MSG =
        new TypeReference<ExpediaRequest<RatePlan>>() {
        };

    private final ProductApi productApi;
    private final ObjectMapper mapper;

    /**
     * Reacts on room type events by creating or updating them
     */
    @KafkaListener(topics = RATE_PLAN_TYPE_SYNC_TOPIC)
    public void receive(String message) throws Exception {
        log.info("Message received on topic {}: {}", RATE_PLAN_TYPE_SYNC_TOPIC, message);
    }
}

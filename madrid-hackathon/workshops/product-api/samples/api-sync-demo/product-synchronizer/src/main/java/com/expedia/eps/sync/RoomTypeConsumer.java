package com.expedia.eps.sync;

import com.expedia.eps.product.model.RoomType;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class RoomTypeConsumer {

    private final ObjectMapper mapper;

    @KafkaListener(topics = "TestTopic")
    public void receive(String message) throws IOException {
        final RoomType room = mapper.readValue(message, RoomType.class);
        log.info("Received room type with partner code '{}'", room.getPartnerCode());
    }
}

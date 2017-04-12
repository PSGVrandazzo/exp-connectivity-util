package com.expedia.eps.sync;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class RoomTypeConsumer {

    @KafkaListener(topics = "TestTopic")
    public void receive(String message) {
        log.info("received message='{}'", message);
    }
}

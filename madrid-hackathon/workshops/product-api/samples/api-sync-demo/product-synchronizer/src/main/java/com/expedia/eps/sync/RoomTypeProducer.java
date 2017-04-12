package com.expedia.eps.sync;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class RoomTypeProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(String topic, String message) {

        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(topic, message);
        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {

            @Override
            public void onSuccess(SendResult<String, String> result) {
                log.info("sent message='{}' with offset={}", message, result.getRecordMetadata().offset());
            }

            @Override
            public void onFailure(Throwable ex) {
                log.error("unable to send message='{}'", message, ex);
            }
        });
    }
}

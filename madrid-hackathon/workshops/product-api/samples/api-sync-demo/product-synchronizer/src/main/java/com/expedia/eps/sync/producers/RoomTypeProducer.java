package com.expedia.eps.sync.producers;

import com.expedia.eps.ExpediaRequest;
import com.expedia.eps.product.model.RoomType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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

    public static final String ROOM_TYPE_SYNC_TOPIC = "RoomTypeSync";

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper mapper;

    /**
     * Called whenever we need to create or update a room type on Expedia's side
     */
    public void send(ExpediaRequest<RoomType> request) throws Exception {

        final String message = mapper.writeValueAsString(request);
        final ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(ROOM_TYPE_SYNC_TOPIC, message);
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

package com.expedia.eps.sync.consumers;

import static com.expedia.eps.sync.producers.RoomTypeProducer.ROOM_TYPE_SYNC_TOPIC;
import static java.util.Objects.isNull;

import com.expedia.eps.ExpediaRequest;
import com.expedia.eps.product.ProductApi;
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
public class RoomTypeConsumer {

    private static final TypeReference<ExpediaRequest<RoomType>> ROOM_TYPE_MSG =
        new TypeReference<ExpediaRequest<RoomType>>() {
        };

    private final ProductApi productApi;
    private final ObjectMapper mapper;

    /**
     * Reacts on room type events by creating or updating them
     */
    @KafkaListener(topics = ROOM_TYPE_SYNC_TOPIC)
    public void receive(String message) throws Exception {

        // Convert the room object from the received String
        final ExpediaRequest<RoomType> request = mapper.readValue(message, ROOM_TYPE_MSG);
        final RoomType room = request.getPayload();

        // Create or Update?
        if (isNull(room.getResourceId())) {
            productApi.createRoomType(request.getGuid(), request.getPropertyId(), room).toBlocking().subscribe(
                response -> log.info("Room created on Expedia side: {}", response.getEntity().getResourceId()),
                error -> log.error("Could not create room type. Error processing Expedia Request ID {}",
                                   request.getGuid(), error),
                () -> log.info("Done synchronizing room")
            );
        }
    }
}

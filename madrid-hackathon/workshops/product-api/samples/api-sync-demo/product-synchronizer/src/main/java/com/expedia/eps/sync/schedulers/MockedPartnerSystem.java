package com.expedia.eps.sync.schedulers;

import static com.expedia.eps.product.utils.Defaults.defaultRoomType;
import static java.util.UUID.randomUUID;

import com.expedia.eps.ExpediaRequest;
import com.expedia.eps.product.model.RoomType;
import com.expedia.eps.sync.producers.RoomTypeProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * This class will simulate a client system sending messages to the Kafka topics that will synchronize with the
 * Expedia APIs
 */
@Slf4j
@Component
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class MockedPartnerSystem {

    private static final String EVERY_MINUTE = "* */1 * * * *";

    private final RoomTypeProducer roomTypeProducer;

//    @Scheduled(cron = EVERY_MINUTE)
    public void scheduledTask() {
        try {
            final Integer propertyId = 888793;
            log.info("Posting a new room type for property {}", propertyId);
            final RoomType newRoom = defaultRoomType(randomUUID().toString());
            final ExpediaRequest<RoomType> createRoomRequest = ExpediaRequest.<RoomType>builder()
                .propertyId(propertyId)
                .payload(newRoom)
                .build();
            roomTypeProducer.send(createRoomRequest);
        } catch (Exception error) {
            log.error("Unable to post to the producer", error);
        }
    }
}

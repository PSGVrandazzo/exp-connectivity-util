package com.expedia.eps.sync;

import static com.expedia.eps.product.utils.Defaults.defaultRoomType;
import static java.util.UUID.randomUUID;
import static java.util.concurrent.TimeUnit.SECONDS;

import com.expedia.eps.ExpediaRequest;
import com.expedia.eps.product.model.RoomType;
import com.expedia.eps.sync.producers.RoomTypeProducer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CountDownLatch;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class RoomTypeSyncExample {

    @Autowired
    private RoomTypeProducer kafkaProducer;

    @Test
    public void postNewRoomType() throws Exception {
        final Integer propertyId = 12933870;
        final RoomType newRoom = defaultRoomType(randomUUID().toString());
        final ExpediaRequest<RoomType> createRoomRequest = ExpediaRequest.<RoomType>builder()
            .propertyId(propertyId)
            .payload(newRoom)
            .build();

        final CountDownLatch latch = new CountDownLatch(1);
        kafkaProducer.send(latch, createRoomRequest);
        latch.await(15, SECONDS);
    }
}

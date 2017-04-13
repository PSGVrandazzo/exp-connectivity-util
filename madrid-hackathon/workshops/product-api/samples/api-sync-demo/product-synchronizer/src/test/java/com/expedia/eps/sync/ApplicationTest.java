package com.expedia.eps.sync;

import com.expedia.eps.product.model.RoomType;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ApplicationTest {

    @Autowired
    private RoomTypeProducer producer;

    @Test
    public void testReceive() throws Exception {
        final RoomType room = RoomType.builder()
            .partnerCode("Test Room")
            .build();
        producer.send("TestTopic", room);
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
    }
}

package com.expedia.eps.sync;

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
        producer.send("TestTopic", "Hello Spring Kafka!");
        try {
            Thread.sleep(30000);
        } catch (Exception e) {
        }
    }
}

package com.expedia.eps.sync;

import static java.util.UUID.randomUUID;
import static org.assertj.core.api.Fail.fail;
import static rx.schedulers.Schedulers.io;

import com.expedia.eps.ExpediaResponse;
import com.expedia.eps.product.ProductApi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.atomic.LongAdder;

import lombok.extern.slf4j.Slf4j;
import rx.Observable;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductApiTest {

    @Autowired
    private ProductApi productApi;

    @Test
    public void asynchronousCount() {

        final String requestId = randomUUID().toString();
        final LongAdder propertyCount = new LongAdder();
        final LongAdder roomTypeCount = new LongAdder();

        productApi.getProperties(requestId)
            .map(ExpediaResponse::getEntity)
            .doOnNext(list -> propertyCount.add(list.size()))
            .flatMap(list -> Observable.from(list).subscribeOn(io()))
            .doOnNext(property -> log.info("Counting rooms for property '{}'", property.getName()))
            .flatMap(property -> productApi.getRoomTypes(requestId, property.getResourceId()).subscribeOn(io()))
            .map(ExpediaResponse::getEntity)
            .doOnNext(list -> roomTypeCount.add(list.size()))
            .doOnError(e -> fail("Could not reach Product API"))
            .toBlocking()
            .last();

        log.info("There are {} properties and {} room types registered on this Expedia account",
                 propertyCount.intValue(),
                 roomTypeCount.intValue());
    }
}

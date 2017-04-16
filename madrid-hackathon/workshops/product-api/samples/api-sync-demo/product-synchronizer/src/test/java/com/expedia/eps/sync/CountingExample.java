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
public class CountingExample {

    @Autowired
    private ProductApi productApi;

    @Test
    public void asynchronousCount() {

        final String requestId = randomUUID().toString();
        final LongAdder properties = new LongAdder();
        final LongAdder roomTypes = new LongAdder();

        productApi.getProperties(requestId)
            .map(ExpediaResponse::getEntity)
            .doOnNext(list -> properties.add(list.size()))
            .flatMap(list -> Observable.from(list).subscribeOn(io()))
            .flatMap(property -> productApi.getRoomTypes(requestId, property.getResourceId()).subscribeOn(io()))
            .toBlocking()
            .subscribe(response -> roomTypes.add(response.getEntity().size()),
                       error -> fail("Unable to contact Expedia"),
                       () -> log.info("Found {} properties and {} active room types",
                                      properties.intValue(),
                                      roomTypes.intValue()));
    }
}

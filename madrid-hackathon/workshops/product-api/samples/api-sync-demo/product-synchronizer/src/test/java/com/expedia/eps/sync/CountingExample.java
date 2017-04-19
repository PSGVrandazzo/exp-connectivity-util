package com.expedia.eps.sync;

import static java.util.UUID.randomUUID;
import static rx.schedulers.Schedulers.io;

import com.expedia.eps.ExpediaResponse;
import com.expedia.eps.product.ProductApi;
import com.expedia.eps.product.model.Property;
import com.expedia.eps.product.model.RatePlan;
import com.expedia.eps.product.model.RoomType;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StopWatch;

import java.util.List;
import java.util.concurrent.atomic.LongAdder;

import lombok.extern.slf4j.Slf4j;
import rx.Observable;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class CountingExample {

    private final LongAdder propertyCount = new LongAdder();
    private final LongAdder roomTypeCount = new LongAdder();
    private final LongAdder ratePlanCount = new LongAdder();

    @Autowired
    private ProductApi productApi;

    @Test
    public void asynchronousCount() {

        final StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        productApi.getProperties(randomUUID().toString())
            .map(ExpediaResponse::getEntity)
            .flatMap(this::collectProperties)
            .flatMap(this::collectRoomTypesAndRatePlans)
            .toBlocking()
            .subscribe();

        stopWatch.stop();

        log.info("Counting {} properties, {} active room types and {} active rate plans. Total time {} seconds",
                 propertyCount.intValue(), roomTypeCount.intValue(), ratePlanCount.intValue(),
                 stopWatch.getTotalTimeSeconds());
    }

    private Observable<Property> collectProperties(List<Property> results) {
        propertyCount.add(results.size());
        return Observable.from(results)
            .subscribeOn(io());
    }

    private Observable<List<RatePlan>> collectRoomTypesAndRatePlans(Property property) {
        return productApi.getRoomTypes(randomUUID().toString(), property.getResourceId())
            .subscribeOn(io())
            .map(ExpediaResponse::getEntity)
            .flatMap(rooms -> this.collectRatePlans(property, rooms));
    }

    private Observable<List<RatePlan>> collectRatePlans(Property property, List<RoomType> rooms) {
        roomTypeCount.add(rooms.size());
        return Observable.from(rooms)
            .subscribeOn(io())
            .flatMap(room -> productApi.getRatePlans(randomUUID().toString(),
                                                     property.getResourceId(),
                                                     room.getResourceId()))
            .map(ExpediaResponse::getEntity)
            .doOnNext(ratePlans -> ratePlanCount.add(ratePlans.size()));
    }
}

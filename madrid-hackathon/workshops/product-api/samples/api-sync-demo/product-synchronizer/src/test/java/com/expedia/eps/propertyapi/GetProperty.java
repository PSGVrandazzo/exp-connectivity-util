package com.expedia.eps.propertyapi;

import static java.util.UUID.randomUUID;
import static org.assertj.core.api.Fail.fail;
import static rx.schedulers.Schedulers.io;

import com.expedia.eps.ExpediaResponse;
import com.expedia.eps.property.PropertyApi;

import com.expedia.eps.property.model.Property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
import rx.Observable;
import rx.functions.Func1;

import java.util.List;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class GetProperty
{
    @Autowired
    private PropertyApi propertyApi;

    @Test
    public void getProperty() {

        final String requestId = randomUUID().toString();

        Observable<List<Property>> map = propertyApi.getPropertyStatus(requestId, "1000", "11275").single().map(ExpediaResponse::getEntity);


    }
}

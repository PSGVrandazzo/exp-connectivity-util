package com.expedia.eps;

import static java.util.UUID.randomUUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExpediaRequest<T> {

    private final String guid = randomUUID().toString();

    private Integer propertyId;
    private Integer roomTypeId;
    private T payload;

}

package com.expedia.eps.property.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ValidationError
{
    private int provider;

    private String providerPropertyId;

    private ReasonCodes code;

    private String message;
}
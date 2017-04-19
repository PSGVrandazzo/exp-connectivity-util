package com.expedia.eps.property.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyResponse
{
    private List<ValidationError> validationErrors;
    private List<Property> properties;

    ///TODO: This should be serializing as a dictionary, not an object
    private Statistics statistics;
}

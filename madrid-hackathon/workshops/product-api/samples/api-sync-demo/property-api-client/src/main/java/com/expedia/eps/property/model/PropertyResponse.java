package com.expedia.eps.property.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Dictionary;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyResponse
{
    private List<ValidationError> validationErrors;
    private List<Property> properties;
    private Statistics statistics;
}

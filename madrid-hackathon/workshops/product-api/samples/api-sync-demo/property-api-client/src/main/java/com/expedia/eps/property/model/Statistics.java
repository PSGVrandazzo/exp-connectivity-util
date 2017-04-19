package com.expedia.eps.property.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Statistics
{
    ///TODO: This should be serializing as a dictionary, not an object
    @JsonProperty("Test.Property.New")
    private int testPropertyNew;
}

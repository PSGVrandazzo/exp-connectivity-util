package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompensationRule {

    private Double percent;
    private Double minAmount;

    @JsonProperty("exceptions")
    private List<CompensationExceptionRule> exceptionRules;
}

package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RateVerificationThresholds {

    private RateAcquisitionTypeModel type;
    private Double minAmount;
    private Double maxAmount;
    private RateVerificationThresholdsSourceModel source;

    @JsonProperty("_links")
    private RateVerificationThresholdLink links;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RateVerificationThresholdLink {

        private Link self;
    }

}


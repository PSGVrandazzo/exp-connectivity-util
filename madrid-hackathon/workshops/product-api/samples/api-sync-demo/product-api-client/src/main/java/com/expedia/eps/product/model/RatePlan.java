package com.expedia.eps.product.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RatePlan {

    private Integer resourceId;
    private String name;
    private RateAcquisitionTypeModel rateAcquisitionType;
    private List<DistributionRule> distributionRules;
    private ActiveStatus status;
    private RatePlanTypeModel type;
    private PricingModel pricingModel;
    private Integer occupantsForBaseRate;
    private Boolean taxInclusive;
    private Boolean depositRequired;
    private ZonedDateTime creationDateTime;
    private ZonedDateTime lastUpdateDateTime;
    private CancelPolicy cancelPolicy;
    private List<AdditionalGuestAmount> additionalGuestAmounts;
    private List<String> valueAddInclusions;
    private Integer minLOSDefault;
    private Integer maxLOSDefault;
    private Integer minAdvBookDays;
    private Integer maxAdvBookDays;
    private LocalDate bookDateStart;
    private LocalDate bookDateEnd;
    private LocalDate travelDateStart;
    private LocalDate travelDateEnd;
    private Boolean mobileOnly;
    private RatePlanLinkage ratePlanLinkage;

    @JsonProperty("_links")
    private RatePlanLink links;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RatePlanLink {

        private Link self;
        private Link parentRatePlan;
        private List<Link> derivedRatePlans;
    }

}

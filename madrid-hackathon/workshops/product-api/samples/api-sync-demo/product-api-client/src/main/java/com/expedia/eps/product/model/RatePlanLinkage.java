package com.expedia.eps.product.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RatePlanLinkage {

    private Boolean deriveAvailabilityStatus;
    private Boolean deriveLengthOfStayRestriction;
    private Boolean deriveClosedToArrival;
    private Boolean deriveClosedToDeparture;
    private List<RateDerivationRule> rateDerivationRules;
}

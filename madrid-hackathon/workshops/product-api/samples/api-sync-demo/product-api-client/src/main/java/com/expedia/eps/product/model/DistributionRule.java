package com.expedia.eps.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DistributionRule {

    private String expediaId;
    private String partnerCode;
    private BusinessModel distributionModel;
    private Boolean manageable;
    private CompensationRule compensation;
}

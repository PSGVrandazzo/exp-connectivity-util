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
public class Property {

    private Integer resourceId;
    private String name;
    private String partnerCode;
    private PropertyStatusModel status;
    private String currency;
    private PropertyAddress address;
    private List<BusinessModel> distributionModels;
    private RateAcquisitionTypeModel rateAcquisitionType;
    private Boolean taxInclusive;
    private PricingModel pricingModel;
    private boolean baseAllocationEnabled;
    private Integer minLOSThreshold;
    private String cancellationTime;
    private String timezone;
    private CutOff reservationCutOff;
}

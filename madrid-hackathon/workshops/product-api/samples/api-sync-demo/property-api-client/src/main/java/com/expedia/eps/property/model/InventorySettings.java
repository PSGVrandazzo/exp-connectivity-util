package com.expedia.eps.property.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventorySettings {

    private RateAcquisitionType rateAcquisitionType;
    private List<DistributionModel> distributionModels;

}


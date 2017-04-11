package com.expedia.eps.product.model;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RateDerivationRule {

    private LocalDate dateStart;
    private LocalDate dateEnd;
    private AdjustmentTypeModel adjustmentType;
    private Double adjustmentValue;
    private List<Period> exclusionDates;
}

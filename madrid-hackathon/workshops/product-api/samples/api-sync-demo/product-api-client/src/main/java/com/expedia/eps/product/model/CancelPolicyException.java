package com.expedia.eps.product.model;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CancelPolicyException {

    private LocalDate startDate;
    private LocalDate endDate;
    private List<Penalty> penalties;
}

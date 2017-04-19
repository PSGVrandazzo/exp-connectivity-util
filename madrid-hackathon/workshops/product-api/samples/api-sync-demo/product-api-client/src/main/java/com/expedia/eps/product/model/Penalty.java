package com.expedia.eps.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Penalty {

    private Integer deadline;
    private CancelPolicyFeeModel perStayFee;
    private Double amount;
}

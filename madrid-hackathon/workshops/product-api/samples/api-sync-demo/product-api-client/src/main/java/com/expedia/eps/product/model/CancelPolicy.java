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
public class CancelPolicy {

    private List<Penalty> defaultPenalties;
    private List<CancelPolicyException> exceptions;

}

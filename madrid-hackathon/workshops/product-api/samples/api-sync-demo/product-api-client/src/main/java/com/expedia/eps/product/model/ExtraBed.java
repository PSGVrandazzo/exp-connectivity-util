package com.expedia.eps.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExtraBed {

    private Long quantity;
    private ExtraBedTypeModel type;
    private String size;
    private Surcharge surcharge;

}

package com.expedia.eps.product.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Period {

    private LocalDate dateStart;
    private LocalDate dateEnd;
}

package com.expedia.eps.property.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyStatus {

    private String provider;
    private String providerPropertyId;
    private Integer expediaId;
    private StatusCodes code;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private LocalDateTime timestampUtc = null;

    private List<ReasonCodes> reasonCodes;
    private List<String> messages;

}


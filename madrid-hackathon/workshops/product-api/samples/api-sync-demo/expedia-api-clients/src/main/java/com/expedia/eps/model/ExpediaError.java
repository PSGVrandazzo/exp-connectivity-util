package com.expedia.eps.model;

import lombok.Data;

@Data
public class ExpediaError {

    private Integer code;
    private String message;
}

package com.expedia.eps.property;

import java.util.List;

import lombok.Data;

@Data
public class ExpediaResponse<T> {

    T entity;

    List<ExpediaError> errors;

}


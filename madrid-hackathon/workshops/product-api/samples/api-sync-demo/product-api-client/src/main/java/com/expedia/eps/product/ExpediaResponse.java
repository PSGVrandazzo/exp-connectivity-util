package com.expedia.eps.product;

import java.util.List;

import lombok.Data;

@Data
public class ExpediaResponse<T> {

    T entity;

    List<ExpediaError> errors;

}

package com.expedia.eps;

import java.util.List;

import lombok.Data;

@Data
public class ExpediaResponse<T> {

    T entity;

    List<ExpediaError> errors;

}

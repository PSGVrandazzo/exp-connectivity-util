package com.expedia.eps.model;

import java.util.List;

import lombok.Data;

@Data
public class ExpediaResponse<T> {

    T entity;

    List<ExpediaError> errors;

}

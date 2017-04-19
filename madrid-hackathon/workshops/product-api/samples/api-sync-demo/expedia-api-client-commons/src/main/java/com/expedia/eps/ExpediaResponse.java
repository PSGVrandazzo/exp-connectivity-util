package com.expedia.eps;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExpediaResponse<T> {

    T entity;

    List<ExpediaError> errors;

}

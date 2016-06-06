package com.expedia.lct.eps.sdk.product.auth;

import com.expedia.lct.eps.sdk.product.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}

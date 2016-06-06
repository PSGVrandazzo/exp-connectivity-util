package com.expedia.lct.eps.sdk.promo.auth;

import com.expedia.lct.eps.sdk.promo.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}

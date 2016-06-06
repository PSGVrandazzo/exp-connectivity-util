package com.expedia.lct.eps.sdk.promo.api;

import com.sun.jersey.api.client.GenericType;

import com.expedia.lct.eps.sdk.promo.ApiException;
import com.expedia.lct.eps.sdk.promo.ApiClient;
import com.expedia.lct.eps.sdk.promo.Configuration;
import com.expedia.lct.eps.sdk.promo.Pair;

import com.expedia.lct.eps.sdk.promo.model.PromoType;
import com.expedia.lct.eps.sdk.promo.model.PromoRS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-01T15:41:28.421-04:00")
public class PromoApi {
  private ApiClient apiClient;

  public PromoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PromoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create promo for given hotel.
   * 
   * @param authorization  (required)
   * @param body Promo object that is to be created. It support status update with promo id in this version. Required fields: promo id, status. (required)
   * @param hotelID The Id of the hotel to create the promotions for. (required)
   * @return PromoRS
   * @throws ApiException if fails to make API call
   */
  public PromoRS createPromo(String authorization, PromoType body, Integer hotelID) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling createPromo");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createPromo");
    }
    
    // verify the required parameter 'hotelID' is set
    if (hotelID == null) {
      throw new ApiException(400, "Missing the required parameter 'hotelID' when calling createPromo");
    }
    
    // create path and map variables
    String localVarPath = "/v1/hotels/{hotelID}/promos".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "hotelID" + "\\}", apiClient.escapeString(hotelID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<PromoRS> localVarReturnType = new GenericType<PromoRS>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get all promos for a hotel.
   * 
   * @param authorization  (required)
   * @param hotelID The Id of the hotel to retrieve promotions for. (required)
   * @param returnScore If specified, will add a score element to the promo payload, indicating strenght of the promotion. Optional, false by default. (optional, default to false)
   * @param activeOnly If specified to true, will only return active promotions. Optional, false by default. (optional, default to false)
   * @return PromoRS
   * @throws ApiException if fails to make API call
   */
  public PromoRS getAllPromotionsForHotel(String authorization, Integer hotelID, Boolean returnScore, Boolean activeOnly) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling getAllPromotionsForHotel");
    }
    
    // verify the required parameter 'hotelID' is set
    if (hotelID == null) {
      throw new ApiException(400, "Missing the required parameter 'hotelID' when calling getAllPromotionsForHotel");
    }
    
    // create path and map variables
    String localVarPath = "/v1/hotels/{hotelID}/promos".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "hotelID" + "\\}", apiClient.escapeString(hotelID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "returnScore", returnScore));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "activeOnly", activeOnly));
    

    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<PromoRS> localVarReturnType = new GenericType<PromoRS>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get promo details
   * 
   * @param authorization  (required)
   * @param hotelID The Id of the hotel to retrieve promotions for. (required)
   * @param promoID The Id of the promo to retrieve (required)
   * @param returnScore If specified, will add a score element to the promo payload, indicating strenght of the promotion. Optional, false by default. (optional, default to false)
   * @param activeOnly If specified to true, will only return active promotions. Optional, false by default. (optional, default to false)
   * @return PromoRS
   * @throws ApiException if fails to make API call
   */
  public PromoRS getPromoById(String authorization, Integer hotelID, Integer promoID, Boolean returnScore, Boolean activeOnly) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling getPromoById");
    }
    
    // verify the required parameter 'hotelID' is set
    if (hotelID == null) {
      throw new ApiException(400, "Missing the required parameter 'hotelID' when calling getPromoById");
    }
    
    // verify the required parameter 'promoID' is set
    if (promoID == null) {
      throw new ApiException(400, "Missing the required parameter 'promoID' when calling getPromoById");
    }
    
    // create path and map variables
    String localVarPath = "/v1/hotels/{hotelID}/promos/{promoID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "hotelID" + "\\}", apiClient.escapeString(hotelID.toString()))
      .replaceAll("\\{" + "promoID" + "\\}", apiClient.escapeString(promoID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "returnScore", returnScore));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "activeOnly", activeOnly));
    

    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<PromoRS> localVarReturnType = new GenericType<PromoRS>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update promo
   * 
   * @param authorization  (required)
   * @param body Promo object that needs to be updated. It support status update with promo id in this version. Required fields: promo id, status. (required)
   * @param hotelID The Id of the hotel to retrieve promotions for. (required)
   * @param promoID The Id of the promo to retrieve (required)
   * @return PromoRS
   * @throws ApiException if fails to make API call
   */
  public PromoRS updatePromo(String authorization, PromoType body, Integer hotelID, Integer promoID) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling updatePromo");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updatePromo");
    }
    
    // verify the required parameter 'hotelID' is set
    if (hotelID == null) {
      throw new ApiException(400, "Missing the required parameter 'hotelID' when calling updatePromo");
    }
    
    // verify the required parameter 'promoID' is set
    if (promoID == null) {
      throw new ApiException(400, "Missing the required parameter 'promoID' when calling updatePromo");
    }
    
    // create path and map variables
    String localVarPath = "/v1/hotels/{hotelID}/promos/{promoID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "hotelID" + "\\}", apiClient.escapeString(hotelID.toString()))
      .replaceAll("\\{" + "promoID" + "\\}", apiClient.escapeString(promoID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<PromoRS> localVarReturnType = new GenericType<PromoRS>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

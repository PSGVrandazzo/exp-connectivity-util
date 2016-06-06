package com.expedia.lct.eps.sdk.product.api;

import com.sun.jersey.api.client.GenericType;

import com.expedia.lct.eps.sdk.product.ApiException;
import com.expedia.lct.eps.sdk.product.ApiClient;
import com.expedia.lct.eps.sdk.product.Configuration;
import com.expedia.lct.eps.sdk.product.Pair;

import com.expedia.lct.eps.sdk.product.model.ResponseWrapperDTOListPropertyDTO;
import com.expedia.lct.eps.sdk.product.model.ResponseWrapperDTOPropertyDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-02T10:27:36.680-04:00")
public class PropertyApi {
  private ApiClient apiClient;

  public PropertyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PropertyApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Obtain a list of properties
   * 
   * @param authorization  (required)
   * @param status Status filter. String. Only supported value is \&quot;all\&quot;. (optional, default to )
   * @param offset Pagination offset. Integer starting at 0 (optional, default to )
   * @param limit Pagination limit. Integer between 1 and 200. (optional, default to )
   * @return ResponseWrapperDTOListPropertyDTO
   * @throws ApiException if fails to make API call
   */
  public ResponseWrapperDTOListPropertyDTO getProperties(String authorization, String status, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling getProperties");
    }
    
    // create path and map variables
    String localVarPath = "/v1/properties".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    

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

    
    GenericType<ResponseWrapperDTOListPropertyDTO> localVarReturnType = new GenericType<ResponseWrapperDTOListPropertyDTO>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read a single property
   * 
   * @param authorization  (required)
   * @param propertyId Expedia Property ID (required)
   * @return ResponseWrapperDTOPropertyDTO
   * @throws ApiException if fails to make API call
   */
  public ResponseWrapperDTOPropertyDTO getProperty(String authorization, Integer propertyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling getProperty");
    }
    
    // verify the required parameter 'propertyId' is set
    if (propertyId == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyId' when calling getProperty");
    }
    
    // create path and map variables
    String localVarPath = "/v1/properties/{propertyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "propertyId" + "\\}", apiClient.escapeString(propertyId.toString()));

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

    
    GenericType<ResponseWrapperDTOPropertyDTO> localVarReturnType = new GenericType<ResponseWrapperDTOPropertyDTO>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

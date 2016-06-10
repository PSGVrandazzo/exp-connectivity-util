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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-10T14:38:55.703-04:00")
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
   * @param status Status filter. String. Only supported value is \&quot;all\&quot;. (optional, default to active)
   * @param offset Pagination offset. Integer starting at 0 (optional, default to 0)
   * @param limit Pagination limit. Integer between 1 and 200. (optional, default to 20)
   * @return ResponseWrapperDTOListPropertyDTO
   * @throws ApiException if fails to make API call
   */
  public ResponseWrapperDTOListPropertyDTO getProperties(String status, String offset, String limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/properties".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    

    

    

    final String[] localVarAccepts = {
      "application/vnd.expedia.eps.product-v2+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic" };

    
    GenericType<ResponseWrapperDTOListPropertyDTO> localVarReturnType = new GenericType<ResponseWrapperDTOListPropertyDTO>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read a single property
   * 
   * @param propertyId Expedia Property ID (required)
   * @return ResponseWrapperDTOPropertyDTO
   * @throws ApiException if fails to make API call
   */
  public ResponseWrapperDTOPropertyDTO getProperty(String propertyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'propertyId' is set
    if (propertyId == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyId' when calling getProperty");
    }
    
    // create path and map variables
    String localVarPath = "/properties/{propertyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "propertyId" + "\\}", apiClient.escapeString(propertyId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/vnd.expedia.eps.product-v2+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic" };

    
    GenericType<ResponseWrapperDTOPropertyDTO> localVarReturnType = new GenericType<ResponseWrapperDTOPropertyDTO>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

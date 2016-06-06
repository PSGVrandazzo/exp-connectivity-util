package com.expedia.lct.eps.sdk.product.api;

import com.sun.jersey.api.client.GenericType;

import com.expedia.lct.eps.sdk.product.ApiException;
import com.expedia.lct.eps.sdk.product.ApiClient;
import com.expedia.lct.eps.sdk.product.Configuration;
import com.expedia.lct.eps.sdk.product.Pair;

import com.expedia.lct.eps.sdk.product.model.RatePlanDTO;
import com.expedia.lct.eps.sdk.product.model.ResponseWrapperDTORatePlanDTO;
import com.expedia.lct.eps.sdk.product.model.ResponseWrapperDTOListRatePlanDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-02T10:27:36.680-04:00")
public class RatePlanApi {
  private ApiClient apiClient;

  public RatePlanApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RatePlanApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Creates a new rate plan
   * 
   * @param authorization  (required)
   * @param propertyId Expedia Property ID (required)
   * @param roomTypeId Room type resource ID (required)
   * @param body JSON message describing the new rate plan (required)
   * @return ResponseWrapperDTORatePlanDTO
   * @throws ApiException if fails to make API call
   */
  public ResponseWrapperDTORatePlanDTO createRatePlan(String authorization, Integer propertyId, Integer roomTypeId, RatePlanDTO body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling createRatePlan");
    }
    
    // verify the required parameter 'propertyId' is set
    if (propertyId == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyId' when calling createRatePlan");
    }
    
    // verify the required parameter 'roomTypeId' is set
    if (roomTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomTypeId' when calling createRatePlan");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createRatePlan");
    }
    
    // create path and map variables
    String localVarPath = "/v1/properties/{propertyId}/roomTypes/{roomTypeId}/ratePlans".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "propertyId" + "\\}", apiClient.escapeString(propertyId.toString()))
      .replaceAll("\\{" + "roomTypeId" + "\\}", apiClient.escapeString(roomTypeId.toString()));

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

    
    GenericType<ResponseWrapperDTORatePlanDTO> localVarReturnType = new GenericType<ResponseWrapperDTORatePlanDTO>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete an existing rate plan
   * 
   * @param authorization  (required)
   * @param propertyId Expedia Property ID (required)
   * @param roomTypeId Room type resource ID (required)
   * @param ratePlanId Rate plan resource ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRatePlan(String authorization, Integer propertyId, Integer roomTypeId, Integer ratePlanId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling deleteRatePlan");
    }
    
    // verify the required parameter 'propertyId' is set
    if (propertyId == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyId' when calling deleteRatePlan");
    }
    
    // verify the required parameter 'roomTypeId' is set
    if (roomTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomTypeId' when calling deleteRatePlan");
    }
    
    // verify the required parameter 'ratePlanId' is set
    if (ratePlanId == null) {
      throw new ApiException(400, "Missing the required parameter 'ratePlanId' when calling deleteRatePlan");
    }
    
    // create path and map variables
    String localVarPath = "/v1/properties/{propertyId}/roomTypes/{roomTypeId}/ratePlans/{ratePlanId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "propertyId" + "\\}", apiClient.escapeString(propertyId.toString()))
      .replaceAll("\\{" + "roomTypeId" + "\\}", apiClient.escapeString(roomTypeId.toString()))
      .replaceAll("\\{" + "ratePlanId" + "\\}", apiClient.escapeString(ratePlanId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "eps-security" };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Read a single rate plan
   * 
   * @param authorization  (required)
   * @param propertyId Expedia Property ID (required)
   * @param roomTypeId Room type resource ID (required)
   * @param ratePlanId Rate plan resource ID (required)
   * @return ResponseWrapperDTORatePlanDTO
   * @throws ApiException if fails to make API call
   */
  public ResponseWrapperDTORatePlanDTO getRatePlan(String authorization, Integer propertyId, Integer roomTypeId, Integer ratePlanId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling getRatePlan");
    }
    
    // verify the required parameter 'propertyId' is set
    if (propertyId == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyId' when calling getRatePlan");
    }
    
    // verify the required parameter 'roomTypeId' is set
    if (roomTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomTypeId' when calling getRatePlan");
    }
    
    // verify the required parameter 'ratePlanId' is set
    if (ratePlanId == null) {
      throw new ApiException(400, "Missing the required parameter 'ratePlanId' when calling getRatePlan");
    }
    
    // create path and map variables
    String localVarPath = "/v1/properties/{propertyId}/roomTypes/{roomTypeId}/ratePlans/{ratePlanId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "propertyId" + "\\}", apiClient.escapeString(propertyId.toString()))
      .replaceAll("\\{" + "roomTypeId" + "\\}", apiClient.escapeString(roomTypeId.toString()))
      .replaceAll("\\{" + "ratePlanId" + "\\}", apiClient.escapeString(ratePlanId.toString()));

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

    
    GenericType<ResponseWrapperDTORatePlanDTO> localVarReturnType = new GenericType<ResponseWrapperDTORatePlanDTO>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Obtain a list of rate plans
   * 
   * @param authorization  (required)
   * @param propertyId Expedia Property ID (required)
   * @param roomTypeId Room type resource ID (required)
   * @param status Status filter. String. Only supported value is \&quot;all\&quot;. (optional)
   * @return ResponseWrapperDTOListRatePlanDTO
   * @throws ApiException if fails to make API call
   */
  public ResponseWrapperDTOListRatePlanDTO getRatePlans(String authorization, Integer propertyId, Integer roomTypeId, String status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling getRatePlans");
    }
    
    // verify the required parameter 'propertyId' is set
    if (propertyId == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyId' when calling getRatePlans");
    }
    
    // verify the required parameter 'roomTypeId' is set
    if (roomTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomTypeId' when calling getRatePlans");
    }
    
    // create path and map variables
    String localVarPath = "/v1/properties/{propertyId}/roomTypes/{roomTypeId}/ratePlans".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "propertyId" + "\\}", apiClient.escapeString(propertyId.toString()))
      .replaceAll("\\{" + "roomTypeId" + "\\}", apiClient.escapeString(roomTypeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    

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

    
    GenericType<ResponseWrapperDTOListRatePlanDTO> localVarReturnType = new GenericType<ResponseWrapperDTOListRatePlanDTO>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Modify an existing rate plan
   * 
   * @param authorization  (required)
   * @param propertyId Expedia Property ID (required)
   * @param roomTypeId Room type resource ID (required)
   * @param ratePlanId Rate plan resource ID (required)
   * @param body JSON message of modified rate plan (required)
   * @return ResponseWrapperDTORatePlanDTO
   * @throws ApiException if fails to make API call
   */
  public ResponseWrapperDTORatePlanDTO updateRatePlan(String authorization, Integer propertyId, Integer roomTypeId, Integer ratePlanId, RatePlanDTO body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling updateRatePlan");
    }
    
    // verify the required parameter 'propertyId' is set
    if (propertyId == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyId' when calling updateRatePlan");
    }
    
    // verify the required parameter 'roomTypeId' is set
    if (roomTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomTypeId' when calling updateRatePlan");
    }
    
    // verify the required parameter 'ratePlanId' is set
    if (ratePlanId == null) {
      throw new ApiException(400, "Missing the required parameter 'ratePlanId' when calling updateRatePlan");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateRatePlan");
    }
    
    // create path and map variables
    String localVarPath = "/v1/properties/{propertyId}/roomTypes/{roomTypeId}/ratePlans/{ratePlanId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "propertyId" + "\\}", apiClient.escapeString(propertyId.toString()))
      .replaceAll("\\{" + "roomTypeId" + "\\}", apiClient.escapeString(roomTypeId.toString()))
      .replaceAll("\\{" + "ratePlanId" + "\\}", apiClient.escapeString(ratePlanId.toString()));

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

    
    GenericType<ResponseWrapperDTORatePlanDTO> localVarReturnType = new GenericType<ResponseWrapperDTORatePlanDTO>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

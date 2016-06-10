package com.expedia.lct.eps.sdk.product.api;

import com.sun.jersey.api.client.GenericType;

import com.expedia.lct.eps.sdk.product.ApiException;
import com.expedia.lct.eps.sdk.product.ApiClient;
import com.expedia.lct.eps.sdk.product.Configuration;
import com.expedia.lct.eps.sdk.product.Pair;

import com.expedia.lct.eps.sdk.product.model.ResponseWrapperDTORoomTypeDTO;
import com.expedia.lct.eps.sdk.product.model.RoomTypeDTO;
import com.expedia.lct.eps.sdk.product.model.ResponseWrapperDTOListRoomTypeDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-10T14:38:55.703-04:00")
public class RoomTypeApi {
  private ApiClient apiClient;

  public RoomTypeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RoomTypeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Creates a new room type
   * 
   * @param propertyId Expedia Property Id (required)
   * @param roomTypeDTO JSON message describing the new room type (required)
   * @return ResponseWrapperDTORoomTypeDTO
   * @throws ApiException if fails to make API call
   */
  public ResponseWrapperDTORoomTypeDTO createRoomType(String propertyId, RoomTypeDTO roomTypeDTO) throws ApiException {
    Object localVarPostBody = roomTypeDTO;
    
    // verify the required parameter 'propertyId' is set
    if (propertyId == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyId' when calling createRoomType");
    }
    
    // verify the required parameter 'roomTypeDTO' is set
    if (roomTypeDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'roomTypeDTO' when calling createRoomType");
    }
    
    // create path and map variables
    String localVarPath = "/properties/{propertyId}/roomTypes".replaceAll("\\{format\\}","json")
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
      "application/vnd.expedia.eps.product-v2+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic" };

    
    GenericType<ResponseWrapperDTORoomTypeDTO> localVarReturnType = new GenericType<ResponseWrapperDTORoomTypeDTO>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read a single room type from a given property
   * 
   * @param propertyId Expedia Property ID (required)
   * @param roomTypeId Room type resource ID. Integer (required)
   * @return ResponseWrapperDTORoomTypeDTO
   * @throws ApiException if fails to make API call
   */
  public ResponseWrapperDTORoomTypeDTO getRoomType(String propertyId, String roomTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'propertyId' is set
    if (propertyId == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyId' when calling getRoomType");
    }
    
    // verify the required parameter 'roomTypeId' is set
    if (roomTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomTypeId' when calling getRoomType");
    }
    
    // create path and map variables
    String localVarPath = "/properties/{propertyId}/roomTypes/{roomTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "propertyId" + "\\}", apiClient.escapeString(propertyId.toString()))
      .replaceAll("\\{" + "roomTypeId" + "\\}", apiClient.escapeString(roomTypeId.toString()));

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

    
    GenericType<ResponseWrapperDTORoomTypeDTO> localVarReturnType = new GenericType<ResponseWrapperDTORoomTypeDTO>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Obtain a list of room types for a given property
   * 
   * @param propertyId Expedia Property ID (required)
   * @param status Status filter. Only supported value is \&quot;all\&quot;. (optional)
   * @return ResponseWrapperDTOListRoomTypeDTO
   * @throws ApiException if fails to make API call
   */
  public ResponseWrapperDTOListRoomTypeDTO getRoomTypes(String propertyId, String status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'propertyId' is set
    if (propertyId == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyId' when calling getRoomTypes");
    }
    
    // create path and map variables
    String localVarPath = "/properties/{propertyId}/roomTypes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "propertyId" + "\\}", apiClient.escapeString(propertyId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    

    

    

    final String[] localVarAccepts = {
      "application/vnd.expedia.eps.product-v2+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic" };

    
    GenericType<ResponseWrapperDTOListRoomTypeDTO> localVarReturnType = new GenericType<ResponseWrapperDTOListRoomTypeDTO>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Modify an existing room type
   * 
   * @param propertyId Expedia Property Id (required)
   * @param roomTypeId Room type resource ID (required)
   * @param roomTypeDTO JSON message with modified room type (required)
   * @return ResponseWrapperDTORoomTypeDTO
   * @throws ApiException if fails to make API call
   */
  public ResponseWrapperDTORoomTypeDTO updateRoomType(String propertyId, String roomTypeId, RoomTypeDTO roomTypeDTO) throws ApiException {
    Object localVarPostBody = roomTypeDTO;
    
    // verify the required parameter 'propertyId' is set
    if (propertyId == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyId' when calling updateRoomType");
    }
    
    // verify the required parameter 'roomTypeId' is set
    if (roomTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomTypeId' when calling updateRoomType");
    }
    
    // verify the required parameter 'roomTypeDTO' is set
    if (roomTypeDTO == null) {
      throw new ApiException(400, "Missing the required parameter 'roomTypeDTO' when calling updateRoomType");
    }
    
    // create path and map variables
    String localVarPath = "/properties/{propertyId}/roomTypes/{roomTypeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "propertyId" + "\\}", apiClient.escapeString(propertyId.toString()))
      .replaceAll("\\{" + "roomTypeId" + "\\}", apiClient.escapeString(roomTypeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/vnd.expedia.eps.product-v2+json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/vnd.expedia.eps.product-v2+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Basic" };

    
    GenericType<ResponseWrapperDTORoomTypeDTO> localVarReturnType = new GenericType<ResponseWrapperDTORoomTypeDTO>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

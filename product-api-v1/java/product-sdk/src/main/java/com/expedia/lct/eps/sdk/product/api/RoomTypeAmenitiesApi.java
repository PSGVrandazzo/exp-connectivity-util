package com.expedia.lct.eps.sdk.product.api;

import com.sun.jersey.api.client.GenericType;

import com.expedia.lct.eps.sdk.product.ApiException;
import com.expedia.lct.eps.sdk.product.ApiClient;
import com.expedia.lct.eps.sdk.product.Configuration;
import com.expedia.lct.eps.sdk.product.Pair;

import com.expedia.lct.eps.sdk.product.model.ResponseWrapperDTOListRoomTypeAmenityDTO;
import com.expedia.lct.eps.sdk.product.model.RoomTypeAmenityDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-02T10:27:36.680-04:00")
public class RoomTypeAmenitiesApi {
  private ApiClient apiClient;

  public RoomTypeAmenitiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RoomTypeAmenitiesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Read a single room type&#39;s amenities
   * 
   * @param authorization  (required)
   * @param propertyId Expedia Property ID (required)
   * @param roomTypeId Room type resource ID. Integer (required)
   * @return ResponseWrapperDTOListRoomTypeAmenityDTO
   * @throws ApiException if fails to make API call
   */
  public ResponseWrapperDTOListRoomTypeAmenityDTO getRoomTypeAmenities(String authorization, String propertyId, String roomTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling getRoomTypeAmenities");
    }
    
    // verify the required parameter 'propertyId' is set
    if (propertyId == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyId' when calling getRoomTypeAmenities");
    }
    
    // verify the required parameter 'roomTypeId' is set
    if (roomTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomTypeId' when calling getRoomTypeAmenities");
    }
    
    // create path and map variables
    String localVarPath = "/v1/properties/{propertyId}/roomTypes/{roomTypeId}/amenities".replaceAll("\\{format\\}","json")
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ResponseWrapperDTOListRoomTypeAmenityDTO> localVarReturnType = new GenericType<ResponseWrapperDTOListRoomTypeAmenityDTO>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Set room type amenities to an existing room type
   * 
   * @param authorization  (required)
   * @param propertyId Expedia Property Id (required)
   * @param roomTypeId Room type resource ID (required)
   * @param body JSON message with the room type amenities (required)
   * @return ResponseWrapperDTOListRoomTypeAmenityDTO
   * @throws ApiException if fails to make API call
   */
  public ResponseWrapperDTOListRoomTypeAmenityDTO setRoomTypeAmenities(String authorization, Integer propertyId, String roomTypeId, List<RoomTypeAmenityDTO> body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling setRoomTypeAmenities");
    }
    
    // verify the required parameter 'propertyId' is set
    if (propertyId == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyId' when calling setRoomTypeAmenities");
    }
    
    // verify the required parameter 'roomTypeId' is set
    if (roomTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomTypeId' when calling setRoomTypeAmenities");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling setRoomTypeAmenities");
    }
    
    // create path and map variables
    String localVarPath = "/v1/properties/{propertyId}/roomTypes/{roomTypeId}/amenities".replaceAll("\\{format\\}","json")
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

    
    GenericType<ResponseWrapperDTOListRoomTypeAmenityDTO> localVarReturnType = new GenericType<ResponseWrapperDTOListRoomTypeAmenityDTO>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

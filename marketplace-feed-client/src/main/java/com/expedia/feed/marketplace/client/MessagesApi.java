package com.expedia.feed.marketplace.client;

import com.expedia.feed.marketplace.client.model.FeedResponse;

import javax.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-03T14:24:50.606+10:00")
public class MessagesApi {
  private ApiClient apiClient;

  public MessagesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MessagesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   * Get the messages for the given hotel, by ID.
   *
   * @param hotelId Hotel ID
   * @param clientId Client ID
   * @return FeedResponse
   */
  public FeedResponse getFeed(String hotelId, String clientId) throws ApiException {
    Object postBody = null;

    // verify the required parameter 'hotelId' is set
    if (hotelId == null) {
      throw new ApiException(400, "Missing the required parameter 'hotelId' when calling getFeed");
    }

    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getFeed");
    }

    // create path and map variables
    String path = "/v1/messages".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();


    queryParams.addAll(apiClient.parameterToPairs("", "hotelId", hotelId));

    queryParams.addAll(apiClient.parameterToPairs("", "clientId", clientId));






    final String[] accepts = {
      "application/json; charset=UTF-8"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {

    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "basic" };


    GenericType<FeedResponse> returnType = new GenericType<FeedResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);

  }

}

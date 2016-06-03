package com.expedia.feed.marketplace.client;

import com.expedia.feed.marketplace.client.model.BatchEventReport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-03T14:24:50.606+10:00")
public class EventsApi {
  private ApiClient apiClient;

  public EventsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EventsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   * Record that events occurred for given messages.
   *
   * @param clientId Client ID
   * @param body
   * @return void
   */
  public void postEvents(String clientId, BatchEventReport body) throws ApiException {
    Object postBody = body;

    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling postEvents");
    }

    // create path and map variables
    String path = "/v1/events".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();


    queryParams.addAll(apiClient.parameterToPairs("", "clientId", clientId));






    final String[] accepts = {
      "application/json; charset=UTF-8"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };


    apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);

  }

}

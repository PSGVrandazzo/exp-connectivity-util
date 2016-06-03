package com.expedia.feed.marketplace.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-03T14:24:50.606+10:00")
public class Message   {

  private String id = null;
  private String hotelId = null;
  private String category = null;
  private String shortMessage = null;
  private String longMessage = null;
  private Map<String, Object> values = new HashMap<String, Object>();
  private String actionURL = null;


  /**
   * The unique ID of this message
   **/

  @ApiModelProperty(required = true, value = "The unique ID of this message")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The hotelId to which this message pertains
   **/

  @ApiModelProperty(required = true, value = "The hotelId to which this message pertains")
  @JsonProperty("hotelId")
  public String getHotelId() {
    return hotelId;
  }
  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }


  /**
   * The category of the given message
   **/

  @ApiModelProperty(required = true, value = "The category of the given message")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }


  /**
   * The message in short form
   **/

  @ApiModelProperty(required = true, value = "The message in short form")
  @JsonProperty("shortMessage")
  public String getShortMessage() {
    return shortMessage;
  }
  public void setShortMessage(String shortMessage) {
    this.shortMessage = shortMessage;
  }


  /**
   * The message in long form
   **/

  @ApiModelProperty(required = true, value = "The message in long form")
  @JsonProperty("longMessage")
  public String getLongMessage() {
    return longMessage;
  }
  public void setLongMessage(String longMessage) {
    this.longMessage = longMessage;
  }


  /**
   * Values of the message, context will change with message category
   **/

  @ApiModelProperty(value = "Values of the message, context will change with message category")
  @JsonProperty("values")
  public Map<String, Object> getValues() {
    return values;
  }
  public void setValues(Map<String, Object> values) {
    this.values = values;
  }


  /**
   * A URL for you to action a response to this message
   **/

  @ApiModelProperty(value = "A URL for you to action a response to this message")
  @JsonProperty("actionURL")
  public String getActionURL() {
    return actionURL;
  }
  public void setActionURL(String actionURL) {
    this.actionURL = actionURL;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(id, message.id) &&
        Objects.equals(hotelId, message.hotelId) &&
        Objects.equals(category, message.category) &&
        Objects.equals(shortMessage, message.shortMessage) &&
        Objects.equals(longMessage, message.longMessage) &&
        Objects.equals(values, message.values) &&
        Objects.equals(actionURL, message.actionURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hotelId, category, shortMessage, longMessage, values, actionURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    shortMessage: ").append(toIndentedString(shortMessage)).append("\n");
    sb.append("    longMessage: ").append(toIndentedString(longMessage)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    actionURL: ").append(toIndentedString(actionURL)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


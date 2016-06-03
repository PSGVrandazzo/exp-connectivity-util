package com.expedia.feed.marketplace.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.Objects;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-03T14:24:50.606+10:00")
public class EventReport   {

  private String messageId = null;
  private String action = null;
  private Integer value = null;
  private Date timestamp = null;
  private String userId = null;


  /**
   **/

  @ApiModelProperty(required = true, value = "")
  @JsonProperty("messageId")
  public String getMessageId() {
    return messageId;
  }
  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  /**
   **/

  @ApiModelProperty(required = true, value = "")
  @JsonProperty("action")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }


  /**
   * minimum: 0.0
   **/

  @ApiModelProperty(value = "")
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }
  public void setValue(Integer value) {
    this.value = value;
  }


  /**
   **/

  @ApiModelProperty(value = "")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }


  /**
   **/

  @ApiModelProperty(value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventReport eventReport = (EventReport) o;
    return Objects.equals(messageId, eventReport.messageId) &&
        Objects.equals(action, eventReport.action) &&
        Objects.equals(value, eventReport.value) &&
        Objects.equals(timestamp, eventReport.timestamp) &&
        Objects.equals(userId, eventReport.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, action, value, timestamp, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventReport {\n");

    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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


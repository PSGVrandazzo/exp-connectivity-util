package com.expedia.lct.eps.sdk.promo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-01T15:41:28.421-04:00")
public class TravelDateBlackout   {
  
  private String start = null;
  private String end = null;

  
  /**
   * Data format: xs:date
   **/
  public TravelDateBlackout start(String start) {
    this.start = start;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Data format: xs:date")
  @JsonProperty("start")
  public String getStart() {
    return start;
  }
  public void setStart(String start) {
    this.start = start;
  }

  
  /**
   * Data format: xs:date
   **/
  public TravelDateBlackout end(String end) {
    this.end = end;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Data format: xs:date")
  @JsonProperty("end")
  public String getEnd() {
    return end;
  }
  public void setEnd(String end) {
    this.end = end;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelDateBlackout travelDateBlackout = (TravelDateBlackout) o;
    return Objects.equals(this.start, travelDateBlackout.start) &&
        Objects.equals(this.end, travelDateBlackout.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelDateBlackout {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


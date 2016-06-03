package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-30T14:27:20.069-04:00")
public class CutOffDTO   {
  


  public enum DayEnum {
    SAMEDAY("sameDay"),
    NEXTDAY("nextDay");

    private String value;

    DayEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private DayEnum day = null;
  private String time = null;

  
  /**
   * Can be of same day or next day. Complements the time attribute
   **/
  public CutOffDTO day(DayEnum day) {
    this.day = day;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Can be of same day or next day. Complements the time attribute")
  @JsonProperty("day")
  public DayEnum getDay() {
    return day;
  }
  public void setDay(DayEnum day) {
    this.day = day;
  }

  
  /**
   * Indicates at which time we\u2019ll stop making inventory available for same day reservations
   **/
  public CutOffDTO time(String time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates at which time we\u2019ll stop making inventory available for same day reservations")
  @JsonProperty("time")
  public String getTime() {
    return time;
  }
  public void setTime(String time) {
    this.time = time;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CutOffDTO cutOffDTO = (CutOffDTO) o;
    return Objects.equals(this.day, cutOffDTO.day) &&
        Objects.equals(this.time, cutOffDTO.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CutOffDTO {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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


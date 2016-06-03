package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-02T10:27:36.680-04:00")
public class RoomSizeDTO   {
  
  private Integer squareFeet = null;
  private Integer squareMeters = null;

  
  /**
   * Room size in square feet. No decimals.
   **/
  public RoomSizeDTO squareFeet(Integer squareFeet) {
    this.squareFeet = squareFeet;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Room size in square feet. No decimals.")
  @JsonProperty("squareFeet")
  public Integer getSquareFeet() {
    return squareFeet;
  }
  public void setSquareFeet(Integer squareFeet) {
    this.squareFeet = squareFeet;
  }

  
  /**
   * Room size in square meters. No decimals.
   **/
  public RoomSizeDTO squareMeters(Integer squareMeters) {
    this.squareMeters = squareMeters;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Room size in square meters. No decimals.")
  @JsonProperty("squareMeters")
  public Integer getSquareMeters() {
    return squareMeters;
  }
  public void setSquareMeters(Integer squareMeters) {
    this.squareMeters = squareMeters;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomSizeDTO roomSizeDTO = (RoomSizeDTO) o;
    return Objects.equals(this.squareFeet, roomSizeDTO.squareFeet) &&
        Objects.equals(this.squareMeters, roomSizeDTO.squareMeters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(squareFeet, squareMeters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomSizeDTO {\n");
    
    sb.append("    squareFeet: ").append(toIndentedString(squareFeet)).append("\n");
    sb.append("    squareMeters: ").append(toIndentedString(squareMeters)).append("\n");
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


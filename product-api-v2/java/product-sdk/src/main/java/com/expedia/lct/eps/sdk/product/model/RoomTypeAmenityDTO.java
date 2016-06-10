package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-10T14:38:55.703-04:00")
public class RoomTypeAmenityDTO   {
  
  private String code = null;
  private String detailCode = null;
  private Integer value = null;

  
  /**
   * Uniquely identifies an amenitiy
   **/
  public RoomTypeAmenityDTO code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Uniquely identifies an amenitiy")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   * Adds precision or qualifies the amenity. Mandatory for some amenity, optional for other and prohibited by the rest of the amenities.
   **/
  public RoomTypeAmenityDTO detailCode(String detailCode) {
    this.detailCode = detailCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Adds precision or qualifies the amenity. Mandatory for some amenity, optional for other and prohibited by the rest of the amenities.")
  @JsonProperty("detailCode")
  public String getDetailCode() {
    return detailCode;
  }
  public void setDetailCode(String detailCode) {
    this.detailCode = detailCode;
  }

  
  /**
   * Integer. Adds precision to the amenity. Mandatory for some amenity, optional for other and prohibited by the rest of the amenities.
   **/
  public RoomTypeAmenityDTO value(Integer value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Integer. Adds precision to the amenity. Mandatory for some amenity, optional for other and prohibited by the rest of the amenities.")
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }
  public void setValue(Integer value) {
    this.value = value;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomTypeAmenityDTO roomTypeAmenityDTO = (RoomTypeAmenityDTO) o;
    return Objects.equals(this.code, roomTypeAmenityDTO.code) &&
        Objects.equals(this.detailCode, roomTypeAmenityDTO.detailCode) &&
        Objects.equals(this.value, roomTypeAmenityDTO.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, detailCode, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomTypeAmenityDTO {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    detailCode: ").append(toIndentedString(detailCode)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


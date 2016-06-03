package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.expedia.lct.eps.sdk.product.model.RnsAttributesDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-02T10:27:36.680-04:00")
public class RoomTypeNameDTO   {
  
  private RnsAttributesDTO attributes = null;
  private String value = null;

  
  /**
   * Defines the attributes used to compose the common name for the room. You should not provide a custom name when using these attributes
   **/
  public RoomTypeNameDTO attributes(RnsAttributesDTO attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defines the attributes used to compose the common name for the room. You should not provide a custom name when using these attributes")
  @JsonProperty("attributes")
  public RnsAttributesDTO getAttributes() {
    return attributes;
  }
  public void setAttributes(RnsAttributesDTO attributes) {
    this.attributes = attributes;
  }

  
  /**
   * The custom name provided for the room. Max. 255 characters. Not to be used in conjunction with the attributes
   **/
  public RoomTypeNameDTO value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The custom name provided for the room. Max. 255 characters. Not to be used in conjunction with the attributes")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
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
    RoomTypeNameDTO roomTypeNameDTO = (RoomTypeNameDTO) o;
    return Objects.equals(this.attributes, roomTypeNameDTO.attributes) &&
        Objects.equals(this.value, roomTypeNameDTO.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomTypeNameDTO {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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


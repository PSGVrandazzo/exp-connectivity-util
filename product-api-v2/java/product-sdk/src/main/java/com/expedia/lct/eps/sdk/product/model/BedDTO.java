package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-10T14:38:55.703-04:00")
public class BedDTO   {
  
  private Long quantity = null;
  private String size = null;
  private String type = null;

  
  /**
   **/
  public BedDTO quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("quantity")
  public Long getQuantity() {
    return quantity;
  }
  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  
  /**
   **/
  public BedDTO size(String size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("size")
  public String getSize() {
    return size;
  }
  public void setSize(String size) {
    this.size = size;
  }

  
  /**
   **/
  public BedDTO type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BedDTO bedDTO = (BedDTO) o;
    return Objects.equals(this.quantity, bedDTO.quantity) &&
        Objects.equals(this.size, bedDTO.size) &&
        Objects.equals(this.type, bedDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, size, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BedDTO {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


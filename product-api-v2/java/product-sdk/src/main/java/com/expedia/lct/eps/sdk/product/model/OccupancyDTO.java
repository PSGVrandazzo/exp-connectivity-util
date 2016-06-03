package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-30T14:27:20.069-04:00")
public class OccupancyDTO   {
  
  private Integer adults = null;
  private Integer children = null;
  private Integer total = null;

  
  /**
   **/
  public OccupancyDTO adults(Integer adults) {
    this.adults = adults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("adults")
  public Integer getAdults() {
    return adults;
  }
  public void setAdults(Integer adults) {
    this.adults = adults;
  }

  
  /**
   **/
  public OccupancyDTO children(Integer children) {
    this.children = children;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("children")
  public Integer getChildren() {
    return children;
  }
  public void setChildren(Integer children) {
    this.children = children;
  }

  
  /**
   **/
  public OccupancyDTO total(Integer total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OccupancyDTO occupancyDTO = (OccupancyDTO) o;
    return Objects.equals(this.adults, occupancyDTO.adults) &&
        Objects.equals(this.children, occupancyDTO.children) &&
        Objects.equals(this.total, occupancyDTO.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adults, children, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OccupancyDTO {\n");
    
    sb.append("    adults: ").append(toIndentedString(adults)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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


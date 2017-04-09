package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.expedia.lct.eps.sdk.product.model.BedDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-10T14:38:55.703-04:00")
public class BeddingOptionDTO   {
  
  private List<BedDTO> option = new ArrayList<BedDTO>();

  
  /**
   **/
  public BeddingOptionDTO option(List<BedDTO> option) {
    this.option = option;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("option")
  public List<BedDTO> getOption() {
    return option;
  }
  public void setOption(List<BedDTO> option) {
    this.option = option;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeddingOptionDTO beddingOptionDTO = (BeddingOptionDTO) o;
    return Objects.equals(this.option, beddingOptionDTO.option);
  }

  @Override
  public int hashCode() {
    return Objects.hash(option);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeddingOptionDTO {\n");
    
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
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


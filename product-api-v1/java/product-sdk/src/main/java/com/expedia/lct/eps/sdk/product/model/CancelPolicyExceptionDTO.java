package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.expedia.lct.eps.sdk.product.model.PenaltyDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-02T10:27:36.680-04:00")
public class CancelPolicyExceptionDTO   {
  
  private List<PenaltyDTO> penalties = new ArrayList<PenaltyDTO>();

  
  /**
   * Penalties' definition. Min 1, Max 2 penalties defined
   **/
  public CancelPolicyExceptionDTO penalties(List<PenaltyDTO> penalties) {
    this.penalties = penalties;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Penalties' definition. Min 1, Max 2 penalties defined")
  @JsonProperty("penalties")
  public List<PenaltyDTO> getPenalties() {
    return penalties;
  }
  public void setPenalties(List<PenaltyDTO> penalties) {
    this.penalties = penalties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelPolicyExceptionDTO cancelPolicyExceptionDTO = (CancelPolicyExceptionDTO) o;
    return Objects.equals(this.penalties, cancelPolicyExceptionDTO.penalties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(penalties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelPolicyExceptionDTO {\n");
    
    sb.append("    penalties: ").append(toIndentedString(penalties)).append("\n");
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


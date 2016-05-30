package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.expedia.lct.eps.sdk.product.model.CancelPolicyExceptionDTO;
import com.expedia.lct.eps.sdk.product.model.PenaltyDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-30T14:27:20.069-04:00")
public class CancelPolicyDTO   {
  
  private List<PenaltyDTO> defaultPenalties = new ArrayList<PenaltyDTO>();
  private List<CancelPolicyExceptionDTO> exceptions = new ArrayList<CancelPolicyExceptionDTO>();

  
  /**
   * Default penalties' definition. Min 1, Max 2 penalties defined
   **/
  public CancelPolicyDTO defaultPenalties(List<PenaltyDTO> defaultPenalties) {
    this.defaultPenalties = defaultPenalties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Default penalties' definition. Min 1, Max 2 penalties defined")
  @JsonProperty("defaultPenalties")
  public List<PenaltyDTO> getDefaultPenalties() {
    return defaultPenalties;
  }
  public void setDefaultPenalties(List<PenaltyDTO> defaultPenalties) {
    this.defaultPenalties = defaultPenalties;
  }

  
  /**
   * List os exceptional cancel penalties defined for the Rate Plan
   **/
  public CancelPolicyDTO exceptions(List<CancelPolicyExceptionDTO> exceptions) {
    this.exceptions = exceptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List os exceptional cancel penalties defined for the Rate Plan")
  @JsonProperty("exceptions")
  public List<CancelPolicyExceptionDTO> getExceptions() {
    return exceptions;
  }
  public void setExceptions(List<CancelPolicyExceptionDTO> exceptions) {
    this.exceptions = exceptions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelPolicyDTO cancelPolicyDTO = (CancelPolicyDTO) o;
    return Objects.equals(this.defaultPenalties, cancelPolicyDTO.defaultPenalties) &&
        Objects.equals(this.exceptions, cancelPolicyDTO.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultPenalties, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelPolicyDTO {\n");
    
    sb.append("    defaultPenalties: ").append(toIndentedString(defaultPenalties)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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


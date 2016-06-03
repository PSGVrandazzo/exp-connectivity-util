package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.expedia.lct.eps.sdk.product.model.CompensationExceptionRuleDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-02T10:27:36.680-04:00")
public class CompensationRuleDTO   {
  
  private Double percent = null;
  private Double minAmount = null;
  private List<CompensationExceptionRuleDTO> exceptions = new ArrayList<CompensationExceptionRuleDTO>();

  
  /**
   * Compensation percentage applied by default. Expressed as a value. Between 0 and 1, accepts up to 4 decimal points
   **/
  public CompensationRuleDTO percent(Double percent) {
    this.percent = percent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Compensation percentage applied by default. Expressed as a value. Between 0 and 1, accepts up to 4 decimal points")
  @JsonProperty("percent")
  public Double getPercent() {
    return percent;
  }
  public void setPercent(Double percent) {
    this.percent = percent;
  }

  
  /**
   * Minimum amount. Accepts up to 3 decimal points. Only applicable to ExpediaCollect distribution rules
   **/
  public CompensationRuleDTO minAmount(Double minAmount) {
    this.minAmount = minAmount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Minimum amount. Accepts up to 3 decimal points. Only applicable to ExpediaCollect distribution rules")
  @JsonProperty("minAmount")
  public Double getMinAmount() {
    return minAmount;
  }
  public void setMinAmount(Double minAmount) {
    this.minAmount = minAmount;
  }

  
  /**
   * Depending on the contractual agreement between Expedia and the partner, compensation can vary based on different criteria. This array of exceptions will reflect this
   **/
  public CompensationRuleDTO exceptions(List<CompensationExceptionRuleDTO> exceptions) {
    this.exceptions = exceptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Depending on the contractual agreement between Expedia and the partner, compensation can vary based on different criteria. This array of exceptions will reflect this")
  @JsonProperty("exceptions")
  public List<CompensationExceptionRuleDTO> getExceptions() {
    return exceptions;
  }
  public void setExceptions(List<CompensationExceptionRuleDTO> exceptions) {
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
    CompensationRuleDTO compensationRuleDTO = (CompensationRuleDTO) o;
    return Objects.equals(this.percent, compensationRuleDTO.percent) &&
        Objects.equals(this.minAmount, compensationRuleDTO.minAmount) &&
        Objects.equals(this.exceptions, compensationRuleDTO.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percent, minAmount, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompensationRuleDTO {\n");
    
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
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


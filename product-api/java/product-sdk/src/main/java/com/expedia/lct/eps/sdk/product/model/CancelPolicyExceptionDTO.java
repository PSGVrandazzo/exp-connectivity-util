package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.expedia.lct.eps.sdk.product.model.PenaltyDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-10T14:38:55.703-04:00")
public class CancelPolicyExceptionDTO   {
  
  private String endDate = null;
  private List<PenaltyDTO> penalties = new ArrayList<PenaltyDTO>();
  private String startDate = null;

  
  /**
   * Format: YYYY-MM-DD. Cancel penalty exception's end date
   **/
  public CancelPolicyExceptionDTO endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Format: YYYY-MM-DD. Cancel penalty exception's end date")
  @JsonProperty("endDate")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  
  /**
   * Definition of the exception penalties applied
   **/
  public CancelPolicyExceptionDTO penalties(List<PenaltyDTO> penalties) {
    this.penalties = penalties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Definition of the exception penalties applied")
  @JsonProperty("penalties")
  public List<PenaltyDTO> getPenalties() {
    return penalties;
  }
  public void setPenalties(List<PenaltyDTO> penalties) {
    this.penalties = penalties;
  }

  
  /**
   * Format: YYYY-MM-DD. Cancel penalty exception's starting date
   **/
  public CancelPolicyExceptionDTO startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Format: YYYY-MM-DD. Cancel penalty exception's starting date")
  @JsonProperty("startDate")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
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
    return Objects.equals(this.endDate, cancelPolicyExceptionDTO.endDate) &&
        Objects.equals(this.penalties, cancelPolicyExceptionDTO.penalties) &&
        Objects.equals(this.startDate, cancelPolicyExceptionDTO.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, penalties, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelPolicyExceptionDTO {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    penalties: ").append(toIndentedString(penalties)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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


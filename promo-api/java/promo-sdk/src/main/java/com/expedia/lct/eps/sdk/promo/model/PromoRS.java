package com.expedia.lct.eps.sdk.promo.model;

import java.util.Objects;
import com.expedia.lct.eps.sdk.promo.model.ErrorType;
import com.expedia.lct.eps.sdk.promo.model.PromoType;
import com.expedia.lct.eps.sdk.promo.model.WarningType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-01T15:41:28.421-04:00")
public class PromoRS   {
  
  private List<PromoType> entity = new ArrayList<PromoType>();
  private List<WarningType> warnings = new ArrayList<WarningType>();
  private List<ErrorType> errors = new ArrayList<ErrorType>();
  private String requestId = null;

  
  /**
   **/
  public PromoRS entity(List<PromoType> entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Entity")
  public List<PromoType> getEntity() {
    return entity;
  }
  public void setEntity(List<PromoType> entity) {
    this.entity = entity;
  }

  
  /**
   **/
  public PromoRS warnings(List<WarningType> warnings) {
    this.warnings = warnings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Warnings")
  public List<WarningType> getWarnings() {
    return warnings;
  }
  public void setWarnings(List<WarningType> warnings) {
    this.warnings = warnings;
  }

  
  /**
   **/
  public PromoRS errors(List<ErrorType> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Errors")
  public List<ErrorType> getErrors() {
    return errors;
  }
  public void setErrors(List<ErrorType> errors) {
    this.errors = errors;
  }

  
  /**
   * A generated id (UUID) for tracking
   **/
  public PromoRS requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A generated id (UUID) for tracking")
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromoRS promoRS = (PromoRS) o;
    return Objects.equals(this.entity, promoRS.entity) &&
        Objects.equals(this.warnings, promoRS.warnings) &&
        Objects.equals(this.errors, promoRS.errors) &&
        Objects.equals(this.requestId, promoRS.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, warnings, errors, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromoRS {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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


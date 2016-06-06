package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.expedia.lct.eps.sdk.product.model.CompensationRuleDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-02T10:27:36.680-04:00")
public class DistributionRuleDTO   {
  
  private String expediaId = null;
  private String partnerCode = null;


  public enum DistributionModelEnum {
    HOTELCOLLECT("HotelCollect"),
    EXPEDIACOLLECT("ExpediaCollect");

    private String value;

    DistributionModelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private DistributionModelEnum distributionModel = null;
  private Boolean manageable = false;
  private CompensationRuleDTO compensation = null;

  
  /**
   * String, min 1, max 50 characters. Expedia rate plan ID that will be specified in booking messages and that should be used to manage avail/rates if this set of distribution rules is marked as manageable.
   **/
  public DistributionRuleDTO expediaId(String expediaId) {
    this.expediaId = expediaId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "String, min 1, max 50 characters. Expedia rate plan ID that will be specified in booking messages and that should be used to manage avail/rates if this set of distribution rules is marked as manageable.")
  @JsonProperty("expediaId")
  public String getExpediaId() {
    return expediaId;
  }
  public void setExpediaId(String expediaId) {
    this.expediaId = expediaId;
  }

  
  /**
   * Unique partner identifier for the rate plan. For a given room type, this code has to be unique per distribution model (e.g. for all ExpediaCollect rate plan distribution rules under this room, this code has to be unique). Uniqueness will be validated by Expedia during create or update operations.
   **/
  public DistributionRuleDTO partnerCode(String partnerCode) {
    this.partnerCode = partnerCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique partner identifier for the rate plan. For a given room type, this code has to be unique per distribution model (e.g. for all ExpediaCollect rate plan distribution rules under this room, this code has to be unique). Uniqueness will be validated by Expedia during create or update operations.")
  @JsonProperty("partnerCode")
  public String getPartnerCode() {
    return partnerCode;
  }
  public void setPartnerCode(String partnerCode) {
    this.partnerCode = partnerCode;
  }

  
  /**
   * Distribution model adopted by the rate plan, matching property configuration.
   **/
  public DistributionRuleDTO distributionModel(DistributionModelEnum distributionModel) {
    this.distributionModel = distributionModel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Distribution model adopted by the rate plan, matching property configuration.")
  @JsonProperty("distributionModel")
  public DistributionModelEnum getDistributionModel() {
    return distributionModel;
  }
  public void setDistributionModel(DistributionModelEnum distributionModel) {
    this.distributionModel = distributionModel;
  }

  
  @ApiModelProperty(example = "null", value = "Cannot be provided in a create request. Default to yes for HotelCollect-only or ExpediaCollect-only rate plans. For ExpediaTravelerPreference rate plans, if rate acquisition type is net, ExpediaCollect will default to true; if rate acquisition type is Sell/LAR, HotelCollect will default to true.")
  @JsonProperty("manageable")
  public Boolean getManageable() {
    return manageable;
  }

  
  /**
   * Applicable compensation rules for this distribution model. Defaults to the value defined on the contract with the partner
   **/
  public DistributionRuleDTO compensation(CompensationRuleDTO compensation) {
    this.compensation = compensation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Applicable compensation rules for this distribution model. Defaults to the value defined on the contract with the partner")
  @JsonProperty("compensation")
  public CompensationRuleDTO getCompensation() {
    return compensation;
  }
  public void setCompensation(CompensationRuleDTO compensation) {
    this.compensation = compensation;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionRuleDTO distributionRuleDTO = (DistributionRuleDTO) o;
    return Objects.equals(this.expediaId, distributionRuleDTO.expediaId) &&
        Objects.equals(this.partnerCode, distributionRuleDTO.partnerCode) &&
        Objects.equals(this.distributionModel, distributionRuleDTO.distributionModel) &&
        Objects.equals(this.manageable, distributionRuleDTO.manageable) &&
        Objects.equals(this.compensation, distributionRuleDTO.compensation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expediaId, partnerCode, distributionModel, manageable, compensation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionRuleDTO {\n");
    
    sb.append("    expediaId: ").append(toIndentedString(expediaId)).append("\n");
    sb.append("    partnerCode: ").append(toIndentedString(partnerCode)).append("\n");
    sb.append("    distributionModel: ").append(toIndentedString(distributionModel)).append("\n");
    sb.append("    manageable: ").append(toIndentedString(manageable)).append("\n");
    sb.append("    compensation: ").append(toIndentedString(compensation)).append("\n");
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


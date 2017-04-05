package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.expedia.lct.eps.sdk.product.model.AdditionalGuestAmountDTO;
import com.expedia.lct.eps.sdk.product.model.CancelPolicyDTO;
import com.expedia.lct.eps.sdk.product.model.DistributionRuleDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-10T14:38:55.703-04:00")
public class RatePlanDTO   {
  
  private List<AdditionalGuestAmountDTO> additionalGuestAmounts = new ArrayList<AdditionalGuestAmountDTO>();
  private String bookDateEnd = null;
  private String bookDateStart = null;
  private CancelPolicyDTO cancelPolicy = null;
  private List<DistributionRuleDTO> distributionRules = new ArrayList<DistributionRuleDTO>();
  private Integer maxAdvBookDays = null;
  private Integer maxLOSDefault = null;
  private Integer minAdvBookDays = null;
  private Integer minLOSDefault = null;
  private Boolean mobileOnly = null;
  private String name = null;
  private Integer occupantsForBaseRate = null;


  public enum PricingModelEnum {
    PERDAYPRICING("PerDayPricing"),
    PERDAYPRICINGBYDAYOFARRIVAL("PerDayPricingByDayOfArrival"),
    OCCUPANCYBASEDPRICING("OccupancyBasedPricing"),
    OCCUPANCYBASEDPRICINGBYDAYOFARRIVAL("OccupancyBasedPricingByDayOfArrival");

    private String value;

    PricingModelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PricingModelEnum pricingModel = null;


  public enum RateAcquisitionTypeEnum {
    NETRATE("NetRate"),
    SELLLAR("SellLAR");

    private String value;

    RateAcquisitionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private RateAcquisitionTypeEnum rateAcquisitionType = null;
  private Integer resourceId = null;


  public enum StatusEnum {
    ACTIVE("Active"),
    INACTIVE("Inactive");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;
  private Boolean taxInclusive = null;
  private String travelDateEnd = null;
  private String travelDateStart = null;


  public enum TypeEnum {
    STANDALONE("Standalone"),
    PACKAGE("Package"),
    CORPORATE("Corporate");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type = null;
  private List<String> valueAddInclusions = new ArrayList<String>();

  
  /**
   * Array of additional guest amounts. Up to 6 can be specified, 1 per category. Only 1 amount can be given per category, for all dates
   **/
  public RatePlanDTO additionalGuestAmounts(List<AdditionalGuestAmountDTO> additionalGuestAmounts) {
    this.additionalGuestAmounts = additionalGuestAmounts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Array of additional guest amounts. Up to 6 can be specified, 1 per category. Only 1 amount can be given per category, for all dates")
  @JsonProperty("additionalGuestAmounts")
  public List<AdditionalGuestAmountDTO> getAdditionalGuestAmounts() {
    return additionalGuestAmounts;
  }
  public void setAdditionalGuestAmounts(List<AdditionalGuestAmountDTO> additionalGuestAmounts) {
    this.additionalGuestAmounts = additionalGuestAmounts;
  }

  
  /**
   * Date at which this rate plan stops being available for searching on any Expedia POS. Format YYYY-MM-DD. If not restricted, will be returned as 2079-06-06. If in 2079, indicates this rate plan book end date is unrestricted
   **/
  public RatePlanDTO bookDateEnd(String bookDateEnd) {
    this.bookDateEnd = bookDateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date at which this rate plan stops being available for searching on any Expedia POS. Format YYYY-MM-DD. If not restricted, will be returned as 2079-06-06. If in 2079, indicates this rate plan book end date is unrestricted")
  @JsonProperty("bookDateEnd")
  public String getBookDateEnd() {
    return bookDateEnd;
  }
  public void setBookDateEnd(String bookDateEnd) {
    this.bookDateEnd = bookDateEnd;
  }

  
  /**
   * Date at which this rate plan starts being available for searching on any Expedia POS. If in the past, indicates rate plan book date start is not restricted. Accepted format: YYYY-MM-DD. If not restricted, will be returned as 1900-01-01
   **/
  public RatePlanDTO bookDateStart(String bookDateStart) {
    this.bookDateStart = bookDateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date at which this rate plan starts being available for searching on any Expedia POS. If in the past, indicates rate plan book date start is not restricted. Accepted format: YYYY-MM-DD. If not restricted, will be returned as 1900-01-01")
  @JsonProperty("bookDateStart")
  public String getBookDateStart() {
    return bookDateStart;
  }
  public void setBookDateStart(String bookDateStart) {
    this.bookDateStart = bookDateStart;
  }

  
  /**
   * Default cancel policy. If not provided in a create request, the product API will select a refundable cancellation policy that is currently used by the most recently created standalone rate plan under the same property
   **/
  public RatePlanDTO cancelPolicy(CancelPolicyDTO cancelPolicy) {
    this.cancelPolicy = cancelPolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Default cancel policy. If not provided in a create request, the product API will select a refundable cancellation policy that is currently used by the most recently created standalone rate plan under the same property")
  @JsonProperty("cancelPolicy")
  public CancelPolicyDTO getCancelPolicy() {
    return cancelPolicy;
  }
  public void setCancelPolicy(CancelPolicyDTO cancelPolicy) {
    this.cancelPolicy = cancelPolicy;
  }

  
  /**
   * Used to provide information about how this rate plan can be sold (ExpediaCollect, HotelCollect or both).
   **/
  public RatePlanDTO distributionRules(List<DistributionRuleDTO> distributionRules) {
    this.distributionRules = distributionRules;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Used to provide information about how this rate plan can be sold (ExpediaCollect, HotelCollect or both).")
  @JsonProperty("distributionRules")
  public List<DistributionRuleDTO> getDistributionRules() {
    return distributionRules;
  }
  public void setDistributionRules(List<DistributionRuleDTO> distributionRules) {
    this.distributionRules = distributionRules;
  }

  
  /**
   * The maximum days before a stay date that the rate plan can be sold. Min 1, Max 500
   **/
  public RatePlanDTO maxAdvBookDays(Integer maxAdvBookDays) {
    this.maxAdvBookDays = maxAdvBookDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum days before a stay date that the rate plan can be sold. Min 1, Max 500")
  @JsonProperty("maxAdvBookDays")
  public Integer getMaxAdvBookDays() {
    return maxAdvBookDays;
  }
  public void setMaxAdvBookDays(Integer maxAdvBookDays) {
    this.maxAdvBookDays = maxAdvBookDays;
  }

  
  /**
   * Default maximum LengthOfStay restriction. Min 1, Max 28. Set to 28 by default if not provided in a create request. Will always be considered along the value defined for each stay date, and the most restrictive of this default and the daily restriction will prevail
   **/
  public RatePlanDTO maxLOSDefault(Integer maxLOSDefault) {
    this.maxLOSDefault = maxLOSDefault;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Default maximum LengthOfStay restriction. Min 1, Max 28. Set to 28 by default if not provided in a create request. Will always be considered along the value defined for each stay date, and the most restrictive of this default and the daily restriction will prevail")
  @JsonProperty("maxLOSDefault")
  public Integer getMaxLOSDefault() {
    return maxLOSDefault;
  }
  public void setMaxLOSDefault(Integer maxLOSDefault) {
    this.maxLOSDefault = maxLOSDefault;
  }

  
  /**
   * The minimum days before a stay date that the rate plan can be sold. Min 1, Max 500
   **/
  public RatePlanDTO minAdvBookDays(Integer minAdvBookDays) {
    this.minAdvBookDays = minAdvBookDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimum days before a stay date that the rate plan can be sold. Min 1, Max 500")
  @JsonProperty("minAdvBookDays")
  public Integer getMinAdvBookDays() {
    return minAdvBookDays;
  }
  public void setMinAdvBookDays(Integer minAdvBookDays) {
    this.minAdvBookDays = minAdvBookDays;
  }

  
  /**
   * Default minimum LengthOfStay restriction. Min 1, Max 28. Set to 1 by default if not provided in a create request. Will always be considered along the value defined for each stay date, and the most restrictive of this default and the daily restriction will prevail
   **/
  public RatePlanDTO minLOSDefault(Integer minLOSDefault) {
    this.minLOSDefault = minLOSDefault;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Default minimum LengthOfStay restriction. Min 1, Max 28. Set to 1 by default if not provided in a create request. Will always be considered along the value defined for each stay date, and the most restrictive of this default and the daily restriction will prevail")
  @JsonProperty("minLOSDefault")
  public Integer getMinLOSDefault() {
    return minLOSDefault;
  }
  public void setMinLOSDefault(Integer minLOSDefault) {
    this.minLOSDefault = minLOSDefault;
  }

  
  /**
   * Indicates this rate plan is only available through shopping done on mobile devices
   **/
  public RatePlanDTO mobileOnly(Boolean mobileOnly) {
    this.mobileOnly = mobileOnly;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indicates this rate plan is only available through shopping done on mobile devices")
  @JsonProperty("mobileOnly")
  public Boolean getMobileOnly() {
    return mobileOnly;
  }
  public void setMobileOnly(Boolean mobileOnly) {
    this.mobileOnly = mobileOnly;
  }

  
  /**
   * Name of the rate plan, for information/identification purposes. Min 1, Max 40 characters. If not provided, defaults to the manageable rate plan partner code.
   **/
  public RatePlanDTO name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the rate plan, for information/identification purposes. Min 1, Max 40 characters. If not provided, defaults to the manageable rate plan partner code.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Max occupants allowed for the base rate. Min 1, Max 20. This is only applicable for per day pricing properties, and required in create requests. It indicates how many occupants the per day price applies to
   **/
  public RatePlanDTO occupantsForBaseRate(Integer occupantsForBaseRate) {
    this.occupantsForBaseRate = occupantsForBaseRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Max occupants allowed for the base rate. Min 1, Max 20. This is only applicable for per day pricing properties, and required in create requests. It indicates how many occupants the per day price applies to")
  @JsonProperty("occupantsForBaseRate")
  public Integer getOccupantsForBaseRate() {
    return occupantsForBaseRate;
  }
  public void setOccupantsForBaseRate(Integer occupantsForBaseRate) {
    this.occupantsForBaseRate = occupantsForBaseRate;
  }

  
  /**
   * Rate Plan pricing model. Will default to property\u2019s pricing model, and if provided, it has to match the property\u2019s pricing model
   **/
  public RatePlanDTO pricingModel(PricingModelEnum pricingModel) {
    this.pricingModel = pricingModel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Rate Plan pricing model. Will default to property\u2019s pricing model, and if provided, it has to match the property\u2019s pricing model")
  @JsonProperty("pricingModel")
  public PricingModelEnum getPricingModel() {
    return pricingModel;
  }
  public void setPricingModel(PricingModelEnum pricingModel) {
    this.pricingModel = pricingModel;
  }

  
  @ApiModelProperty(example = "null", value = "Rate acquisition type, inherited from the Property")
  @JsonProperty("rateAcquisitionType")
  public RateAcquisitionTypeEnum getRateAcquisitionType() {
    return rateAcquisitionType;
  }

  
  /**
   * Expedia ID for this resource. Generated when created. Generated on POST, required on PUT
   **/
  public RatePlanDTO resourceId(Integer resourceId) {
    this.resourceId = resourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Expedia ID for this resource. Generated when created. Generated on POST, required on PUT")
  @JsonProperty("resourceId")
  public Integer getResourceId() {
    return resourceId;
  }
  public void setResourceId(Integer resourceId) {
    this.resourceId = resourceId;
  }

  
  /**
   * Defaults to active if not provided during creation
   **/
  public RatePlanDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defaults to active if not provided during creation")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Returned to indicate whether the rate being exchanged over other APIs (availability/rates or booking) is inclusive of taxes or not. During creation, for properties managing net rates, the default value is false. For sell rates, it is based on the property's configuration
   **/
  public RatePlanDTO taxInclusive(Boolean taxInclusive) {
    this.taxInclusive = taxInclusive;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Returned to indicate whether the rate being exchanged over other APIs (availability/rates or booking) is inclusive of taxes or not. During creation, for properties managing net rates, the default value is false. For sell rates, it is based on the property's configuration")
  @JsonProperty("taxInclusive")
  public Boolean getTaxInclusive() {
    return taxInclusive;
  }
  public void setTaxInclusive(Boolean taxInclusive) {
    this.taxInclusive = taxInclusive;
  }

  
  /**
   * Latest date at which customers can checkout for a stay including this rate plan. Format YYYY-MM-DD. If not restricted, will be returned as 2079-06-06. If in 2079, indicates rate plan travel end date is not restricted
   **/
  public RatePlanDTO travelDateEnd(String travelDateEnd) {
    this.travelDateEnd = travelDateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Latest date at which customers can checkout for a stay including this rate plan. Format YYYY-MM-DD. If not restricted, will be returned as 2079-06-06. If in 2079, indicates rate plan travel end date is not restricted")
  @JsonProperty("travelDateEnd")
  public String getTravelDateEnd() {
    return travelDateEnd;
  }
  public void setTravelDateEnd(String travelDateEnd) {
    this.travelDateEnd = travelDateEnd;
  }

  
  /**
   * Date at which customers can start checking in for a stay including this rate plan. Format YYYY-MM-DD. If not restricted, will be returned at 1900-01-01.If in the past, indicates rate plan travel start date is not restricted
   **/
  public RatePlanDTO travelDateStart(String travelDateStart) {
    this.travelDateStart = travelDateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date at which customers can start checking in for a stay including this rate plan. Format YYYY-MM-DD. If not restricted, will be returned at 1900-01-01.If in the past, indicates rate plan travel start date is not restricted")
  @JsonProperty("travelDateStart")
  public String getTravelDateStart() {
    return travelDateStart;
  }
  public void setTravelDateStart(String travelDateStart) {
    this.travelDateStart = travelDateStart;
  }

  
  /**
   * Rate Plan type. Only Standalone type can be managed through the Product API. Defaults to Standalone if not provided during creation
   **/
  public RatePlanDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Rate Plan type. Only Standalone type can be managed through the Product API. Defaults to Standalone if not provided during creation")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Array of value add inclusions. Value add inclusions are special features included with this rate. Breakfast, Internet, or parking inclusions are the most frequently used ones
   **/
  public RatePlanDTO valueAddInclusions(List<String> valueAddInclusions) {
    this.valueAddInclusions = valueAddInclusions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Array of value add inclusions. Value add inclusions are special features included with this rate. Breakfast, Internet, or parking inclusions are the most frequently used ones")
  @JsonProperty("valueAddInclusions")
  public List<String> getValueAddInclusions() {
    return valueAddInclusions;
  }
  public void setValueAddInclusions(List<String> valueAddInclusions) {
    this.valueAddInclusions = valueAddInclusions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatePlanDTO ratePlanDTO = (RatePlanDTO) o;
    return Objects.equals(this.additionalGuestAmounts, ratePlanDTO.additionalGuestAmounts) &&
        Objects.equals(this.bookDateEnd, ratePlanDTO.bookDateEnd) &&
        Objects.equals(this.bookDateStart, ratePlanDTO.bookDateStart) &&
        Objects.equals(this.cancelPolicy, ratePlanDTO.cancelPolicy) &&
        Objects.equals(this.distributionRules, ratePlanDTO.distributionRules) &&
        Objects.equals(this.maxAdvBookDays, ratePlanDTO.maxAdvBookDays) &&
        Objects.equals(this.maxLOSDefault, ratePlanDTO.maxLOSDefault) &&
        Objects.equals(this.minAdvBookDays, ratePlanDTO.minAdvBookDays) &&
        Objects.equals(this.minLOSDefault, ratePlanDTO.minLOSDefault) &&
        Objects.equals(this.mobileOnly, ratePlanDTO.mobileOnly) &&
        Objects.equals(this.name, ratePlanDTO.name) &&
        Objects.equals(this.occupantsForBaseRate, ratePlanDTO.occupantsForBaseRate) &&
        Objects.equals(this.pricingModel, ratePlanDTO.pricingModel) &&
        Objects.equals(this.rateAcquisitionType, ratePlanDTO.rateAcquisitionType) &&
        Objects.equals(this.resourceId, ratePlanDTO.resourceId) &&
        Objects.equals(this.status, ratePlanDTO.status) &&
        Objects.equals(this.taxInclusive, ratePlanDTO.taxInclusive) &&
        Objects.equals(this.travelDateEnd, ratePlanDTO.travelDateEnd) &&
        Objects.equals(this.travelDateStart, ratePlanDTO.travelDateStart) &&
        Objects.equals(this.type, ratePlanDTO.type) &&
        Objects.equals(this.valueAddInclusions, ratePlanDTO.valueAddInclusions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalGuestAmounts, bookDateEnd, bookDateStart, cancelPolicy, distributionRules, maxAdvBookDays, maxLOSDefault, minAdvBookDays, minLOSDefault, mobileOnly, name, occupantsForBaseRate, pricingModel, rateAcquisitionType, resourceId, status, taxInclusive, travelDateEnd, travelDateStart, type, valueAddInclusions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatePlanDTO {\n");
    
    sb.append("    additionalGuestAmounts: ").append(toIndentedString(additionalGuestAmounts)).append("\n");
    sb.append("    bookDateEnd: ").append(toIndentedString(bookDateEnd)).append("\n");
    sb.append("    bookDateStart: ").append(toIndentedString(bookDateStart)).append("\n");
    sb.append("    cancelPolicy: ").append(toIndentedString(cancelPolicy)).append("\n");
    sb.append("    distributionRules: ").append(toIndentedString(distributionRules)).append("\n");
    sb.append("    maxAdvBookDays: ").append(toIndentedString(maxAdvBookDays)).append("\n");
    sb.append("    maxLOSDefault: ").append(toIndentedString(maxLOSDefault)).append("\n");
    sb.append("    minAdvBookDays: ").append(toIndentedString(minAdvBookDays)).append("\n");
    sb.append("    minLOSDefault: ").append(toIndentedString(minLOSDefault)).append("\n");
    sb.append("    mobileOnly: ").append(toIndentedString(mobileOnly)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    occupantsForBaseRate: ").append(toIndentedString(occupantsForBaseRate)).append("\n");
    sb.append("    pricingModel: ").append(toIndentedString(pricingModel)).append("\n");
    sb.append("    rateAcquisitionType: ").append(toIndentedString(rateAcquisitionType)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taxInclusive: ").append(toIndentedString(taxInclusive)).append("\n");
    sb.append("    travelDateEnd: ").append(toIndentedString(travelDateEnd)).append("\n");
    sb.append("    travelDateStart: ").append(toIndentedString(travelDateStart)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueAddInclusions: ").append(toIndentedString(valueAddInclusions)).append("\n");
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


package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.expedia.lct.eps.sdk.product.model.CutOffDTO;
import com.expedia.lct.eps.sdk.product.model.PropertyAddressDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-02T10:27:36.680-04:00")
public class PropertyDTO   {
  
  private Integer resourceId = null;
  private String name = null;
  private String partnerCode = null;
  private String status = null;
  private String currency = null;
  private PropertyAddressDTO address = null;
  private List<String> distributionModels = new ArrayList<String>();


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
  private Boolean taxInclusive = false;


  public enum PricingModelEnum {
    PERDAYPRICING("PerDayPricing"),
    OCCUPANCYBASEDPRICING("OccupancyBasedPricing");

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
  private Boolean baseAllocationEnabled = false;
  private Integer minLOSThreshold = null;
  private String cancellationTime = null;
  private String timezone = null;
  private CutOffDTO reservationCutOff = null;

  
  /**
   * Expedia ID for this resource. Generated when created. Generated on POST, required on PUT
   **/
  public PropertyDTO resourceId(Integer resourceId) {
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
   * Name describing the property. Max. 255 characters
   **/
  public PropertyDTO name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name describing the property. Max. 255 characters")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Partner property code/identifier. Max 64 characters. Optional field returned for connected properties. This code allows partner to uniquely identify the property in its system.
   **/
  public PropertyDTO partnerCode(String partnerCode) {
    this.partnerCode = partnerCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Partner property code/identifier. Max 64 characters. Optional field returned for connected properties. This code allows partner to uniquely identify the property in its system.")
  @JsonProperty("partnerCode")
  public String getPartnerCode() {
    return partnerCode;
  }
  public void setPartnerCode(String partnerCode) {
    this.partnerCode = partnerCode;
  }

  
  /**
   * Status in which the property can be in; Allowed values are: Active, Inactive, Onboarding, UnderConversion
   **/
  public PropertyDTO status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status in which the property can be in; Allowed values are: Active, Inactive, Onboarding, UnderConversion")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Format: ISO 4217 Alpha 3. This currency code is applicable to all amounts found in any resources available as part of the EPS Product API.
   **/
  public PropertyDTO currency(String currency) {
    this.currency = currency;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Format: ISO 4217 Alpha 3. This currency code is applicable to all amounts found in any resources available as part of the EPS Product API.")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   * Property address details
   **/
  public PropertyDTO address(PropertyAddressDTO address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Property address details")
  @JsonProperty("address")
  public PropertyAddressDTO getAddress() {
    return address;
  }
  public void setAddress(PropertyAddressDTO address) {
    this.address = address;
  }

  
  /**
   * Distribution model(s) under which the property is configured to work with Expedia
   **/
  public PropertyDTO distributionModels(List<String> distributionModels) {
    this.distributionModels = distributionModels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Distribution model(s) under which the property is configured to work with Expedia")
  @JsonProperty("distributionModels")
  public List<String> getDistributionModels() {
    return distributionModels;
  }
  public void setDistributionModels(List<String> distributionModels) {
    this.distributionModels = distributionModels;
  }

  
  /**
   * Describes which type of rate will be provided via this API, but also which type of rate should be used when managing availability and rates in  ExpediaPartnerCentral or using EC or EQC APIs.
   **/
  public PropertyDTO rateAcquisitionType(RateAcquisitionTypeEnum rateAcquisitionType) {
    this.rateAcquisitionType = rateAcquisitionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Describes which type of rate will be provided via this API, but also which type of rate should be used when managing availability and rates in  ExpediaPartnerCentral or using EC or EQC APIs.")
  @JsonProperty("rateAcquisitionType")
  public RateAcquisitionTypeEnum getRateAcquisitionType() {
    return rateAcquisitionType;
  }
  public void setRateAcquisitionType(RateAcquisitionTypeEnum rateAcquisitionType) {
    this.rateAcquisitionType = rateAcquisitionType;
  }

  
  /**
   * Returned to indicate whether the rate being exchanged over other APIs (availability/rates or booking) is inclusive of taxes or not.
   **/
  public PropertyDTO taxInclusive(Boolean taxInclusive) {
    this.taxInclusive = taxInclusive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Returned to indicate whether the rate being exchanged over other APIs (availability/rates or booking) is inclusive of taxes or not.")
  @JsonProperty("taxInclusive")
  public Boolean getTaxInclusive() {
    return taxInclusive;
  }
  public void setTaxInclusive(Boolean taxInclusive) {
    this.taxInclusive = taxInclusive;
  }

  
  /**
   * Configuration of the property when it comes to pricing rooms and rates.
   **/
  public PropertyDTO pricingModel(PricingModelEnum pricingModel) {
    this.pricingModel = pricingModel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configuration of the property when it comes to pricing rooms and rates.")
  @JsonProperty("pricingModel")
  public PricingModelEnum getPricingModel() {
    return pricingModel;
  }
  public void setPricingModel(PricingModelEnum pricingModel) {
    this.pricingModel = pricingModel;
  }

  
  /**
   * Boolean to indicate whether this property has a base allocation contract with Expedia.
   **/
  public PropertyDTO baseAllocationEnabled(Boolean baseAllocationEnabled) {
    this.baseAllocationEnabled = baseAllocationEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean to indicate whether this property has a base allocation contract with Expedia.")
  @JsonProperty("baseAllocationEnabled")
  public Boolean getBaseAllocationEnabled() {
    return baseAllocationEnabled;
  }
  public void setBaseAllocationEnabled(Boolean baseAllocationEnabled) {
    this.baseAllocationEnabled = baseAllocationEnabled;
  }

  
  /**
   * This property configuration is used by Expedia when MinLOS Restrictions updates are received via EQC AR. If the MinLOS restriction update attempted via EQC AR is greater than this value, the update will be rejected.
   **/
  public PropertyDTO minLOSThreshold(Integer minLOSThreshold) {
    this.minLOSThreshold = minLOSThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This property configuration is used by Expedia when MinLOS Restrictions updates are received via EQC AR. If the MinLOS restriction update attempted via EQC AR is greater than this value, the update will be rejected.")
  @JsonProperty("minLOSThreshold")
  public Integer getMinLOSThreshold() {
    return minLOSThreshold;
  }
  public void setMinLOSThreshold(Integer minLOSThreshold) {
    this.minLOSThreshold = minLOSThreshold;
  }

  
  /**
   * Cancellation deadline reference time. When cancel policies are defined and exchanged via the rate plan resource, a deadline in hours is provided. The deadline in hours is always relative to this property cancellation deadline reference time configuration
   **/
  public PropertyDTO cancellationTime(String cancellationTime) {
    this.cancellationTime = cancellationTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cancellation deadline reference time. When cancel policies are defined and exchanged via the rate plan resource, a deadline in hours is provided. The deadline in hours is always relative to this property cancellation deadline reference time configuration")
  @JsonProperty("cancellationTime")
  public String getCancellationTime() {
    return cancellationTime;
  }
  public void setCancellationTime(String cancellationTime) {
    this.cancellationTime = cancellationTime;
  }

  
  /**
   * Descriptive information about property timezone configuration in Expedia system. Description will start by a GMT offset, followed by a friendly name.
   **/
  public PropertyDTO timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descriptive information about property timezone configuration in Expedia system. Description will start by a GMT offset, followed by a friendly name.")
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  
  /**
   * Used to indicate when we stop making rate plans available to book for same day reservations.
   **/
  public PropertyDTO reservationCutOff(CutOffDTO reservationCutOff) {
    this.reservationCutOff = reservationCutOff;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Used to indicate when we stop making rate plans available to book for same day reservations.")
  @JsonProperty("reservationCutOff")
  public CutOffDTO getReservationCutOff() {
    return reservationCutOff;
  }
  public void setReservationCutOff(CutOffDTO reservationCutOff) {
    this.reservationCutOff = reservationCutOff;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyDTO propertyDTO = (PropertyDTO) o;
    return Objects.equals(this.resourceId, propertyDTO.resourceId) &&
        Objects.equals(this.name, propertyDTO.name) &&
        Objects.equals(this.partnerCode, propertyDTO.partnerCode) &&
        Objects.equals(this.status, propertyDTO.status) &&
        Objects.equals(this.currency, propertyDTO.currency) &&
        Objects.equals(this.address, propertyDTO.address) &&
        Objects.equals(this.distributionModels, propertyDTO.distributionModels) &&
        Objects.equals(this.rateAcquisitionType, propertyDTO.rateAcquisitionType) &&
        Objects.equals(this.taxInclusive, propertyDTO.taxInclusive) &&
        Objects.equals(this.pricingModel, propertyDTO.pricingModel) &&
        Objects.equals(this.baseAllocationEnabled, propertyDTO.baseAllocationEnabled) &&
        Objects.equals(this.minLOSThreshold, propertyDTO.minLOSThreshold) &&
        Objects.equals(this.cancellationTime, propertyDTO.cancellationTime) &&
        Objects.equals(this.timezone, propertyDTO.timezone) &&
        Objects.equals(this.reservationCutOff, propertyDTO.reservationCutOff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, name, partnerCode, status, currency, address, distributionModels, rateAcquisitionType, taxInclusive, pricingModel, baseAllocationEnabled, minLOSThreshold, cancellationTime, timezone, reservationCutOff);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyDTO {\n");
    
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    partnerCode: ").append(toIndentedString(partnerCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    distributionModels: ").append(toIndentedString(distributionModels)).append("\n");
    sb.append("    rateAcquisitionType: ").append(toIndentedString(rateAcquisitionType)).append("\n");
    sb.append("    taxInclusive: ").append(toIndentedString(taxInclusive)).append("\n");
    sb.append("    pricingModel: ").append(toIndentedString(pricingModel)).append("\n");
    sb.append("    baseAllocationEnabled: ").append(toIndentedString(baseAllocationEnabled)).append("\n");
    sb.append("    minLOSThreshold: ").append(toIndentedString(minLOSThreshold)).append("\n");
    sb.append("    cancellationTime: ").append(toIndentedString(cancellationTime)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    reservationCutOff: ").append(toIndentedString(reservationCutOff)).append("\n");
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


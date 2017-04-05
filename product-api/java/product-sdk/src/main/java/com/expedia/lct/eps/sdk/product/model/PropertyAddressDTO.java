package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-10T14:38:55.703-04:00")
public class PropertyAddressDTO   {
  
  private String city = null;
  private String countryCode = null;
  private String line1 = null;
  private String line2 = null;
  private String postalCode = null;
  private String state = null;

  
  /**
   * City in which the property is located
   **/
  public PropertyAddressDTO city(String city) {
    this.city = city;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "City in which the property is located")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   * ISO 3166-1 Alpha 3 country code, for the country where the property is located
   **/
  public PropertyAddressDTO countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ISO 3166-1 Alpha 3 country code, for the country where the property is located")
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  
  /**
   * First line of address
   **/
  public PropertyAddressDTO line1(String line1) {
    this.line1 = line1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "First line of address")
  @JsonProperty("line1")
  public String getLine1() {
    return line1;
  }
  public void setLine1(String line1) {
    this.line1 = line1;
  }

  
  /**
   * Second line of address, not always available
   **/
  public PropertyAddressDTO line2(String line2) {
    this.line2 = line2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Second line of address, not always available")
  @JsonProperty("line2")
  public String getLine2() {
    return line2;
  }
  public void setLine2(String line2) {
    this.line2 = line2;
  }

  
  /**
   * Postal or State Code, might not be available
   **/
  public PropertyAddressDTO postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Postal or State Code, might not be available")
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  
  /**
   * State/Province, which is optional and thus might not be available
   **/
  public PropertyAddressDTO state(String state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "State/Province, which is optional and thus might not be available")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyAddressDTO propertyAddressDTO = (PropertyAddressDTO) o;
    return Objects.equals(this.city, propertyAddressDTO.city) &&
        Objects.equals(this.countryCode, propertyAddressDTO.countryCode) &&
        Objects.equals(this.line1, propertyAddressDTO.line1) &&
        Objects.equals(this.line2, propertyAddressDTO.line2) &&
        Objects.equals(this.postalCode, propertyAddressDTO.postalCode) &&
        Objects.equals(this.state, propertyAddressDTO.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, countryCode, line1, line2, postalCode, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyAddressDTO {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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


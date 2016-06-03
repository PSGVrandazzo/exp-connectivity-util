package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-02T10:27:36.680-04:00")
public class AdditionalGuestAmountDTO   {
  


  public enum AgeCategoryEnum {
    ADULT("Adult"),
    CHILDAGEA("ChildAgeA"),
    CHILDAGEB("ChildAgeB"),
    CHILDAGEC("ChildAgeC"),
    CHILDAGED("ChildAgeD"),
    INFANT("Infant");

    private String value;

    AgeCategoryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private AgeCategoryEnum ageCategory = null;
  private Double amount = null;

  
  /**
   * The age category for the additional guests
   **/
  public AdditionalGuestAmountDTO ageCategory(AgeCategoryEnum ageCategory) {
    this.ageCategory = ageCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The age category for the additional guests")
  @JsonProperty("ageCategory")
  public AgeCategoryEnum getAgeCategory() {
    return ageCategory;
  }
  public void setAgeCategory(AgeCategoryEnum ageCategory) {
    this.ageCategory = ageCategory;
  }

  
  /**
   * Min value 0.000, accepts up to 3 decimal points
   **/
  public AdditionalGuestAmountDTO amount(Double amount) {
    this.amount = amount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Min value 0.000, accepts up to 3 decimal points")
  @JsonProperty("amount")
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalGuestAmountDTO additionalGuestAmountDTO = (AdditionalGuestAmountDTO) o;
    return Objects.equals(this.ageCategory, additionalGuestAmountDTO.ageCategory) &&
        Objects.equals(this.amount, additionalGuestAmountDTO.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageCategory, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalGuestAmountDTO {\n");
    
    sb.append("    ageCategory: ").append(toIndentedString(ageCategory)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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


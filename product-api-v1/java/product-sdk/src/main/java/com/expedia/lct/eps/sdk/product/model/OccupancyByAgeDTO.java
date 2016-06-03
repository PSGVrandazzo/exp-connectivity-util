package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-02T10:27:36.680-04:00")
public class OccupancyByAgeDTO   {
  


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
  private Integer minAge = null;
  private Integer maxOccupants = null;

  
  /**
   * The age category whose occupancy is being defined
   **/
  public OccupancyByAgeDTO ageCategory(AgeCategoryEnum ageCategory) {
    this.ageCategory = ageCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The age category whose occupancy is being defined")
  @JsonProperty("ageCategory")
  public AgeCategoryEnum getAgeCategory() {
    return ageCategory;
  }
  public void setAgeCategory(AgeCategoryEnum ageCategory) {
    this.ageCategory = ageCategory;
  }

  
  /**
   * Minimum age allowed for the category. Min 0, max 99
   **/
  public OccupancyByAgeDTO minAge(Integer minAge) {
    this.minAge = minAge;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Minimum age allowed for the category. Min 0, max 99")
  @JsonProperty("minAge")
  public Integer getMinAge() {
    return minAge;
  }
  public void setMinAge(Integer minAge) {
    this.minAge = minAge;
  }

  
  /**
   * Max number of occupants on the category. Min 0, max 20
   **/
  public OccupancyByAgeDTO maxOccupants(Integer maxOccupants) {
    this.maxOccupants = maxOccupants;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Max number of occupants on the category. Min 0, max 20")
  @JsonProperty("maxOccupants")
  public Integer getMaxOccupants() {
    return maxOccupants;
  }
  public void setMaxOccupants(Integer maxOccupants) {
    this.maxOccupants = maxOccupants;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OccupancyByAgeDTO occupancyByAgeDTO = (OccupancyByAgeDTO) o;
    return Objects.equals(this.ageCategory, occupancyByAgeDTO.ageCategory) &&
        Objects.equals(this.minAge, occupancyByAgeDTO.minAge) &&
        Objects.equals(this.maxOccupants, occupancyByAgeDTO.maxOccupants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageCategory, minAge, maxOccupants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OccupancyByAgeDTO {\n");
    
    sb.append("    ageCategory: ").append(toIndentedString(ageCategory)).append("\n");
    sb.append("    minAge: ").append(toIndentedString(minAge)).append("\n");
    sb.append("    maxOccupants: ").append(toIndentedString(maxOccupants)).append("\n");
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


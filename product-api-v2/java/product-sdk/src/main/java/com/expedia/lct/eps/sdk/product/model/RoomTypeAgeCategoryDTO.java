package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-10T14:38:55.703-04:00")
public class RoomTypeAgeCategoryDTO   {
  


  public enum CategoryEnum {
    ADULT("Adult"),
    CHILDAGEA("ChildAgeA"),
    CHILDAGEB("ChildAgeB"),
    CHILDAGEC("ChildAgeC"),
    CHILDAGED("ChildAgeD"),
    INFANT("Infant");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CategoryEnum category = null;
  private Integer minAge = null;

  
  /**
   * The age category whose occupancy is being defined
   **/
  public RoomTypeAgeCategoryDTO category(CategoryEnum category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The age category whose occupancy is being defined")
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  
  /**
   * Minimum age allowed for the category. Min 0, max 99
   **/
  public RoomTypeAgeCategoryDTO minAge(Integer minAge) {
    this.minAge = minAge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum age allowed for the category. Min 0, max 99")
  @JsonProperty("minAge")
  public Integer getMinAge() {
    return minAge;
  }
  public void setMinAge(Integer minAge) {
    this.minAge = minAge;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomTypeAgeCategoryDTO roomTypeAgeCategoryDTO = (RoomTypeAgeCategoryDTO) o;
    return Objects.equals(this.category, roomTypeAgeCategoryDTO.category) &&
        Objects.equals(this.minAge, roomTypeAgeCategoryDTO.minAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, minAge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomTypeAgeCategoryDTO {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    minAge: ").append(toIndentedString(minAge)).append("\n");
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


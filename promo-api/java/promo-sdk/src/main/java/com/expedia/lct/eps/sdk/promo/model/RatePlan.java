package com.expedia.lct.eps.sdk.promo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-01T15:41:28.421-04:00")
public class RatePlan   {
  
  private String id = null;

  
  /**
   * The unique identifier for the rate plan. At least one rate plan ID for an active Expedia rate plan is required when requesting to create a promotion. Derived rate plan IDs should never be provided, as the promotion will always be attached to the parent. If a derived rate plan is provided, the promo will be created on the parent. If the same promo already exists on the parent, it will return an error.
   **/
  public RatePlan id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier for the rate plan. At least one rate plan ID for an active Expedia rate plan is required when requesting to create a promotion. Derived rate plan IDs should never be provided, as the promotion will always be attached to the parent. If a derived rate plan is provided, the promo will be created on the parent. If the same promo already exists on the parent, it will return an error.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatePlan ratePlan = (RatePlan) o;
    return Objects.equals(this.id, ratePlan.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatePlan {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


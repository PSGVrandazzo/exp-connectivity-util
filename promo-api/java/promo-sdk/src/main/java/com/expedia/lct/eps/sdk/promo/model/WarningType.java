package com.expedia.lct.eps.sdk.promo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-01T15:41:28.421-04:00")
public class WarningType   {
  
  private Integer code = null;
  private String message = null;
  private Integer promoId = null;
  private String link = null;

  
  /**
   * Warning code, range (7000, 7999)
   **/
  public WarningType code(Integer code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Warning code, range (7000, 7999)")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  
  /**
   * Warning message
   **/
  public WarningType message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Warning message")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * The unique identifier for the promo
   **/
  public WarningType promoId(Integer promoId) {
    this.promoId = promoId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier for the promo")
  @JsonProperty("promoId")
  public Integer getPromoId() {
    return promoId;
  }
  public void setPromoId(Integer promoId) {
    this.promoId = promoId;
  }

  
  /**
   * The link for the additional information related to this warning
   **/
  public WarningType link(String link) {
    this.link = link;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The link for the additional information related to this warning")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WarningType warningType = (WarningType) o;
    return Objects.equals(this.code, warningType.code) &&
        Objects.equals(this.message, warningType.message) &&
        Objects.equals(this.promoId, warningType.promoId) &&
        Objects.equals(this.link, warningType.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, promoId, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarningType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    promoId: ").append(toIndentedString(promoId)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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


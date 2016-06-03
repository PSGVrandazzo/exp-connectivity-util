package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-30T14:27:20.069-04:00")
public class CompensationExceptionRuleDTO   {
  
  private String dateEnd = null;
  private String dateStart = null;
  private Boolean fri = null;
  private Double minAmount = null;
  private Boolean mon = null;
  private Double percent = null;
  private Boolean sat = null;
  private Boolean sun = null;
  private Boolean thu = null;
  private Boolean tue = null;
  private Boolean wed = null;

  
  /**
   * End date of the exception rule. Accepted format: YYYY-MM-DD
   **/
  public CompensationExceptionRuleDTO dateEnd(String dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "End date of the exception rule. Accepted format: YYYY-MM-DD")
  @JsonProperty("dateEnd")
  public String getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(String dateEnd) {
    this.dateEnd = dateEnd;
  }

  
  /**
   * Starting date of the exception rule. Accepted format: YYYY-MM-DD
   **/
  public CompensationExceptionRuleDTO dateStart(String dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Starting date of the exception rule. Accepted format: YYYY-MM-DD")
  @JsonProperty("dateStart")
  public String getDateStart() {
    return dateStart;
  }
  public void setDateStart(String dateStart) {
    this.dateStart = dateStart;
  }

  
  /**
   * For any exception, all 7 days of week are returned with a true/false indicator.
   **/
  public CompensationExceptionRuleDTO fri(Boolean fri) {
    this.fri = fri;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "For any exception, all 7 days of week are returned with a true/false indicator.")
  @JsonProperty("fri")
  public Boolean getFri() {
    return fri;
  }
  public void setFri(Boolean fri) {
    this.fri = fri;
  }

  
  /**
   * Accepts up to 3 decimal points
   **/
  public CompensationExceptionRuleDTO minAmount(Double minAmount) {
    this.minAmount = minAmount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Accepts up to 3 decimal points")
  @JsonProperty("minAmount")
  public Double getMinAmount() {
    return minAmount;
  }
  public void setMinAmount(Double minAmount) {
    this.minAmount = minAmount;
  }

  
  /**
   * For any exception, all 7 days of week are returned with a true/false indicator.
   **/
  public CompensationExceptionRuleDTO mon(Boolean mon) {
    this.mon = mon;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "For any exception, all 7 days of week are returned with a true/false indicator.")
  @JsonProperty("mon")
  public Boolean getMon() {
    return mon;
  }
  public void setMon(Boolean mon) {
    this.mon = mon;
  }

  
  /**
   * Between 0 and 1, accepts up to 3 decimal points
   **/
  public CompensationExceptionRuleDTO percent(Double percent) {
    this.percent = percent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Between 0 and 1, accepts up to 3 decimal points")
  @JsonProperty("percent")
  public Double getPercent() {
    return percent;
  }
  public void setPercent(Double percent) {
    this.percent = percent;
  }

  
  /**
   * For any exception, all 7 days of week are returned with a true/false indicator.
   **/
  public CompensationExceptionRuleDTO sat(Boolean sat) {
    this.sat = sat;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "For any exception, all 7 days of week are returned with a true/false indicator.")
  @JsonProperty("sat")
  public Boolean getSat() {
    return sat;
  }
  public void setSat(Boolean sat) {
    this.sat = sat;
  }

  
  /**
   * For any exception, all 7 days of week are returned with a true/false indicator.
   **/
  public CompensationExceptionRuleDTO sun(Boolean sun) {
    this.sun = sun;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "For any exception, all 7 days of week are returned with a true/false indicator.")
  @JsonProperty("sun")
  public Boolean getSun() {
    return sun;
  }
  public void setSun(Boolean sun) {
    this.sun = sun;
  }

  
  /**
   * For any exception, all 7 days of week are returned with a true/false indicator.
   **/
  public CompensationExceptionRuleDTO thu(Boolean thu) {
    this.thu = thu;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "For any exception, all 7 days of week are returned with a true/false indicator.")
  @JsonProperty("thu")
  public Boolean getThu() {
    return thu;
  }
  public void setThu(Boolean thu) {
    this.thu = thu;
  }

  
  /**
   * For any exception, all 7 days of week are returned with a true/false indicator.
   **/
  public CompensationExceptionRuleDTO tue(Boolean tue) {
    this.tue = tue;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "For any exception, all 7 days of week are returned with a true/false indicator.")
  @JsonProperty("tue")
  public Boolean getTue() {
    return tue;
  }
  public void setTue(Boolean tue) {
    this.tue = tue;
  }

  
  /**
   * For any exception, all 7 days of week are returned with a true/false indicator.
   **/
  public CompensationExceptionRuleDTO wed(Boolean wed) {
    this.wed = wed;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "For any exception, all 7 days of week are returned with a true/false indicator.")
  @JsonProperty("wed")
  public Boolean getWed() {
    return wed;
  }
  public void setWed(Boolean wed) {
    this.wed = wed;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompensationExceptionRuleDTO compensationExceptionRuleDTO = (CompensationExceptionRuleDTO) o;
    return Objects.equals(this.dateEnd, compensationExceptionRuleDTO.dateEnd) &&
        Objects.equals(this.dateStart, compensationExceptionRuleDTO.dateStart) &&
        Objects.equals(this.fri, compensationExceptionRuleDTO.fri) &&
        Objects.equals(this.minAmount, compensationExceptionRuleDTO.minAmount) &&
        Objects.equals(this.mon, compensationExceptionRuleDTO.mon) &&
        Objects.equals(this.percent, compensationExceptionRuleDTO.percent) &&
        Objects.equals(this.sat, compensationExceptionRuleDTO.sat) &&
        Objects.equals(this.sun, compensationExceptionRuleDTO.sun) &&
        Objects.equals(this.thu, compensationExceptionRuleDTO.thu) &&
        Objects.equals(this.tue, compensationExceptionRuleDTO.tue) &&
        Objects.equals(this.wed, compensationExceptionRuleDTO.wed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateEnd, dateStart, fri, minAmount, mon, percent, sat, sun, thu, tue, wed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompensationExceptionRuleDTO {\n");
    
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    fri: ").append(toIndentedString(fri)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    mon: ").append(toIndentedString(mon)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    sat: ").append(toIndentedString(sat)).append("\n");
    sb.append("    sun: ").append(toIndentedString(sun)).append("\n");
    sb.append("    thu: ").append(toIndentedString(thu)).append("\n");
    sb.append("    tue: ").append(toIndentedString(tue)).append("\n");
    sb.append("    wed: ").append(toIndentedString(wed)).append("\n");
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


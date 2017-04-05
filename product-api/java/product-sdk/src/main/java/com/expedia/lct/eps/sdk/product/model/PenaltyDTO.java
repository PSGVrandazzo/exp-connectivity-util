package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-10T14:38:55.703-04:00")
public class PenaltyDTO   {
  
  private Double amount = null;
  private Integer deadline = null;


  public enum PerStayFeeEnum {
    NONE("None"),
    _1STNIGHTROOMANDTAX("1stNightRoomAndTax"),
    _2NIGHTSROOMANDTAX("2NightsRoomAndTax"),
    _10PERCENTCOSTOFSTAY("10PercentCostOfStay"),
    _20PERCENTCOSTOFSTAY("20PercentCostOfStay"),
    _30PERCENTCOSTOFSTAY("30PercentCostOfStay"),
    _40PERCENTCOSTOFSTAY("40PercentCostOfStay"),
    _50PERCENTCOSTOFSTAY("50PercentCostOfStay"),
    _60PERCENTCOSTOFSTAY("60PercentCostOfStay"),
    _70PERCENTCOSTOFSTAY("70PercentCostOfStay"),
    _80PERCENTCOSTOFSTAY("80PercentCostOfStay"),
    _90PERCENTCOSTOFSTAY("90PercentCostOfStay"),
    FULLCOSTOFSTAY("FullCostOfStay");

    private String value;

    PerStayFeeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PerStayFeeEnum perStayFee = null;

  
  /**
   * Min value 0.000 (3 decimal points). The amount provided here should be based on the property rate acquisition type. If the property rate acquisition type is Net, the rate provided here should be net of Expedia compensation. If it is SellLAR, the rate should be what the customer will be charged (inclusive of Expedia compensation). Used to define a flat amount that would be charged as a cancel or change penalty. This would normally replace a per-stay fee, but it can also be added on top of a per-stay fee if that is what the partner requires
   **/
  public PenaltyDTO amount(Double amount) {
    this.amount = amount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Min value 0.000 (3 decimal points). The amount provided here should be based on the property rate acquisition type. If the property rate acquisition type is Net, the rate provided here should be net of Expedia compensation. If it is SellLAR, the rate should be what the customer will be charged (inclusive of Expedia compensation). Used to define a flat amount that would be charged as a cancel or change penalty. This would normally replace a per-stay fee, but it can also be added on top of a per-stay fee if that is what the partner requires")
  @JsonProperty("amount")
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  
  /**
   * Number of hours prior to the arrival of the guest. When set to 0, it means up until end of the day of arrival. Min 0, Max 999
   **/
  public PenaltyDTO deadline(Integer deadline) {
    this.deadline = deadline;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of hours prior to the arrival of the guest. When set to 0, it means up until end of the day of arrival. Min 0, Max 999")
  @JsonProperty("deadline")
  public Integer getDeadline() {
    return deadline;
  }
  public void setDeadline(Integer deadline) {
    this.deadline = deadline;
  }

  
  /**
   * Fee that will be charged if the customer cancels within the specified deadline.
   **/
  public PenaltyDTO perStayFee(PerStayFeeEnum perStayFee) {
    this.perStayFee = perStayFee;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fee that will be charged if the customer cancels within the specified deadline.")
  @JsonProperty("perStayFee")
  public PerStayFeeEnum getPerStayFee() {
    return perStayFee;
  }
  public void setPerStayFee(PerStayFeeEnum perStayFee) {
    this.perStayFee = perStayFee;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PenaltyDTO penaltyDTO = (PenaltyDTO) o;
    return Objects.equals(this.amount, penaltyDTO.amount) &&
        Objects.equals(this.deadline, penaltyDTO.deadline) &&
        Objects.equals(this.perStayFee, penaltyDTO.perStayFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, deadline, perStayFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PenaltyDTO {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
    sb.append("    perStayFee: ").append(toIndentedString(perStayFee)).append("\n");
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


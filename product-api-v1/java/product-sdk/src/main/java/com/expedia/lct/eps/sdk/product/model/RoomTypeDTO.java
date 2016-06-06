package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.expedia.lct.eps.sdk.product.model.BedTypeDTO;
import com.expedia.lct.eps.sdk.product.model.OccupancyByAgeDTO;
import com.expedia.lct.eps.sdk.product.model.RoomSizeDTO;
import com.expedia.lct.eps.sdk.product.model.RoomTypeNameDTO;
import com.expedia.lct.eps.sdk.product.model.SmokingPreferenceDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-02T10:27:36.680-04:00")
public class RoomTypeDTO   {
  
  private Integer resourceId = null;
  private String partnerCode = null;
  private RoomTypeNameDTO name = null;


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
  private Integer maxOccupants = null;
  private List<OccupancyByAgeDTO> occupancyByAge = new ArrayList<OccupancyByAgeDTO>();
  private List<BedTypeDTO> bedTypes = new ArrayList<BedTypeDTO>();
  private List<SmokingPreferenceDTO> smokingPreferences = new ArrayList<SmokingPreferenceDTO>();
  private RoomSizeDTO roomSize = null;
  private List<String> views = new ArrayList<String>();
  private Boolean wheelchairAccessibility = false;

  
  /**
   * Expedia ID for this resource. Generated when created. Generated on POST, required on PUT
   **/
  public RoomTypeDTO resourceId(Integer resourceId) {
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
   * Partner room type code/identifier. Max. 40 characters
   **/
  public RoomTypeDTO partnerCode(String partnerCode) {
    this.partnerCode = partnerCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Partner room type code/identifier. Max. 40 characters")
  @JsonProperty("partnerCode")
  public String getPartnerCode() {
    return partnerCode;
  }
  public void setPartnerCode(String partnerCode) {
    this.partnerCode = partnerCode;
  }

  
  /**
   * Formed by a [ISO 639-1]-[ISO-3166-1]. If applicable, it contains the RNS attributes used to generate the value. Max 255 characters
   **/
  public RoomTypeDTO name(RoomTypeNameDTO name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Formed by a [ISO 639-1]-[ISO-3166-1]. If applicable, it contains the RNS attributes used to generate the value. Max 255 characters")
  @JsonProperty("name")
  public RoomTypeNameDTO getName() {
    return name;
  }
  public void setName(RoomTypeNameDTO name) {
    this.name = name;
  }

  
  /**
   * Room type status is derived from the rate plans under the room type: if at least 1 rate plan is active, the room type status will be active. If all rate plans are inactive, then the room type becomes inactive as well.
   **/
  public RoomTypeDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Room type status is derived from the rate plans under the room type: if at least 1 rate plan is active, the room type status will be active. If all rate plans are inactive, then the room type becomes inactive as well.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Min 1, max 20. Maximum number of people the room can accommodate, across all age categories.
   **/
  public RoomTypeDTO maxOccupants(Integer maxOccupants) {
    this.maxOccupants = maxOccupants;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Min 1, max 20. Maximum number of people the room can accommodate, across all age categories.")
  @JsonProperty("maxOccupants")
  public Integer getMaxOccupants() {
    return maxOccupants;
  }
  public void setMaxOccupants(Integer maxOccupants) {
    this.maxOccupants = maxOccupants;
  }

  
  /**
   * Array of occupancies by age. A room will minimally have 1 age category (adult). Indicates, for each age category supported by the room, how many occupants of each category the room supports, as well as the minimum age for each category. The maximum age of a category is 1 less than the minimum of the next category in line.
   **/
  public RoomTypeDTO occupancyByAge(List<OccupancyByAgeDTO> occupancyByAge) {
    this.occupancyByAge = occupancyByAge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Array of occupancies by age. A room will minimally have 1 age category (adult). Indicates, for each age category supported by the room, how many occupants of each category the room supports, as well as the minimum age for each category. The maximum age of a category is 1 less than the minimum of the next category in line.")
  @JsonProperty("occupancyByAge")
  public List<OccupancyByAgeDTO> getOccupancyByAge() {
    return occupancyByAge;
  }
  public void setOccupancyByAge(List<OccupancyByAgeDTO> occupancyByAge) {
    this.occupancyByAge = occupancyByAge;
  }

  
  /**
   * Used to define bed type configuration of the room. If more than one bed type is provided, it means that the room type offers different types of configurations, and the customer will be presented with the opportunity to request one at time of booking.
   **/
  public RoomTypeDTO bedTypes(List<BedTypeDTO> bedTypes) {
    this.bedTypes = bedTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Used to define bed type configuration of the room. If more than one bed type is provided, it means that the room type offers different types of configurations, and the customer will be presented with the opportunity to request one at time of booking.")
  @JsonProperty("bedTypes")
  public List<BedTypeDTO> getBedTypes() {
    return bedTypes;
  }
  public void setBedTypes(List<BedTypeDTO> bedTypes) {
    this.bedTypes = bedTypes;
  }

  
  /**
   * Used to define whether the room type is smoking, nonsmoking, or if both options are available on request. If a single smoking option is provided, then the room is, by default, only available in this configuration. If both options are provided, then a choice will be offered to the customer at the time he makes a reservation, and the customer preference will be sent in electronic booking messages to the partner
   **/
  public RoomTypeDTO smokingPreferences(List<SmokingPreferenceDTO> smokingPreferences) {
    this.smokingPreferences = smokingPreferences;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Used to define whether the room type is smoking, nonsmoking, or if both options are available on request. If a single smoking option is provided, then the room is, by default, only available in this configuration. If both options are provided, then a choice will be offered to the customer at the time he makes a reservation, and the customer preference will be sent in electronic booking messages to the partner")
  @JsonProperty("smokingPreferences")
  public List<SmokingPreferenceDTO> getSmokingPreferences() {
    return smokingPreferences;
  }
  public void setSmokingPreferences(List<SmokingPreferenceDTO> smokingPreferences) {
    this.smokingPreferences = smokingPreferences;
  }

  
  /**
   * Optional. Used to define room size. When used, both size in square feet and in square meters must be specified.
   **/
  public RoomTypeDTO roomSize(RoomSizeDTO roomSize) {
    this.roomSize = roomSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional. Used to define room size. When used, both size in square feet and in square meters must be specified.")
  @JsonProperty("roomSize")
  public RoomSizeDTO getRoomSize() {
    return roomSize;
  }
  public void setRoomSize(RoomSizeDTO roomSize) {
    this.roomSize = roomSize;
  }

  
  /**
   * Optional. Used to indicate the views available from this room.
   **/
  public RoomTypeDTO views(List<String> views) {
    this.views = views;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional. Used to indicate the views available from this room.")
  @JsonProperty("views")
  public List<String> getViews() {
    return views;
  }
  public void setViews(List<String> views) {
    this.views = views;
  }

  
  /**
   * Optional. Used to indicate whether the room is configured to be wheelchair accessible or not.
   **/
  public RoomTypeDTO wheelchairAccessibility(Boolean wheelchairAccessibility) {
    this.wheelchairAccessibility = wheelchairAccessibility;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional. Used to indicate whether the room is configured to be wheelchair accessible or not.")
  @JsonProperty("wheelchairAccessibility")
  public Boolean getWheelchairAccessibility() {
    return wheelchairAccessibility;
  }
  public void setWheelchairAccessibility(Boolean wheelchairAccessibility) {
    this.wheelchairAccessibility = wheelchairAccessibility;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomTypeDTO roomTypeDTO = (RoomTypeDTO) o;
    return Objects.equals(this.resourceId, roomTypeDTO.resourceId) &&
        Objects.equals(this.partnerCode, roomTypeDTO.partnerCode) &&
        Objects.equals(this.name, roomTypeDTO.name) &&
        Objects.equals(this.status, roomTypeDTO.status) &&
        Objects.equals(this.maxOccupants, roomTypeDTO.maxOccupants) &&
        Objects.equals(this.occupancyByAge, roomTypeDTO.occupancyByAge) &&
        Objects.equals(this.bedTypes, roomTypeDTO.bedTypes) &&
        Objects.equals(this.smokingPreferences, roomTypeDTO.smokingPreferences) &&
        Objects.equals(this.roomSize, roomTypeDTO.roomSize) &&
        Objects.equals(this.views, roomTypeDTO.views) &&
        Objects.equals(this.wheelchairAccessibility, roomTypeDTO.wheelchairAccessibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, partnerCode, name, status, maxOccupants, occupancyByAge, bedTypes, smokingPreferences, roomSize, views, wheelchairAccessibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomTypeDTO {\n");
    
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    partnerCode: ").append(toIndentedString(partnerCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    maxOccupants: ").append(toIndentedString(maxOccupants)).append("\n");
    sb.append("    occupancyByAge: ").append(toIndentedString(occupancyByAge)).append("\n");
    sb.append("    bedTypes: ").append(toIndentedString(bedTypes)).append("\n");
    sb.append("    smokingPreferences: ").append(toIndentedString(smokingPreferences)).append("\n");
    sb.append("    roomSize: ").append(toIndentedString(roomSize)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
    sb.append("    wheelchairAccessibility: ").append(toIndentedString(wheelchairAccessibility)).append("\n");
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


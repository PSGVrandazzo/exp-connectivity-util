package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.expedia.lct.eps.sdk.product.model.BedDTO;
import com.expedia.lct.eps.sdk.product.model.BeddingOptionDTO;
import com.expedia.lct.eps.sdk.product.model.OccupancyDTO;
import com.expedia.lct.eps.sdk.product.model.RoomSizeDTO;
import com.expedia.lct.eps.sdk.product.model.RoomTypeAgeCategoryDTO;
import com.expedia.lct.eps.sdk.product.model.RoomTypeNameDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-10T14:38:55.703-04:00")
public class RoomTypeDTO   {
  
  private List<RoomTypeAgeCategoryDTO> ageCategories = new ArrayList<RoomTypeAgeCategoryDTO>();
  private List<BedDTO> extraBedding = new ArrayList<BedDTO>();
  private OccupancyDTO maxOccupancy = null;
  private RoomTypeNameDTO name = null;
  private String partnerCode = null;
  private Long resourceId = null;
  private RoomSizeDTO roomSize = null;


  public enum SmokingPreferencesEnum {
    SMOKING("Smoking"),
    NON_SMOKING("Non-Smoking");

    private String value;

    SmokingPreferencesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<SmokingPreferencesEnum> smokingPreferences = new ArrayList<SmokingPreferencesEnum>();
  private List<BeddingOptionDTO> standardBedding = new ArrayList<BeddingOptionDTO>();


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


  public enum ViewsEnum {
    BAY_VIEW("Bay View"),
    BEACH_VIEW("Beach View"),
    CANAL_VIEW("Canal View"),
    CITY_VIEW("City View"),
    COURTYARD_VIEW("Courtyard View"),
    DESERT_VIEW("Desert View"),
    GARDEN_VIEW("Garden View"),
    GOLF_VIEW("Golf View"),
    HARBOR_VIEW("Harbor View"),
    HILL_VIEW("Hill View"),
    LAGOON_VIEW("Lagoon View"),
    LAKE_VIEW("Lake View"),
    PARTIAL_LAKE_VIEW("Partial Lake View"),
    MARINA_VIEW("Marina View"),
    MOUNTAIN_VIEW("Mountain View"),
    OCEAN_VIEW("Ocean View"),
    PARTIAL_OCEAN_VIEW("Partial Ocean View"),
    PARK_VIEW("Park View"),
    POOL_VIEW("Pool View"),
    RESORT_VIEW("Resort View"),
    RIVER_VIEW("River View"),
    SEA_VIEW("Sea View"),
    PARTIAL_SEA_VIEW("Partial Sea View"),
    VALLEY_VIEW("Valley View"),
    VINEYARD_VIEW("Vineyard View"),
    WATER_VIEW("Water View");

    private String value;

    ViewsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<ViewsEnum> views = new ArrayList<ViewsEnum>();
  private Boolean wheelchairAccessibility = null;

  
  /**
   * Defines the different age categories supported by the room type. At the very least, the 'Adult' category must be defined.
   **/
  public RoomTypeDTO ageCategories(List<RoomTypeAgeCategoryDTO> ageCategories) {
    this.ageCategories = ageCategories;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Defines the different age categories supported by the room type. At the very least, the 'Adult' category must be defined.")
  @JsonProperty("ageCategories")
  public List<RoomTypeAgeCategoryDTO> getAgeCategories() {
    return ageCategories;
  }
  public void setAgeCategories(List<RoomTypeAgeCategoryDTO> ageCategories) {
    this.ageCategories = ageCategories;
  }

  
  /**
   * Defines the configuration (type, size and quality) of any extra beds the room type may have.
   **/
  public RoomTypeDTO extraBedding(List<BedDTO> extraBedding) {
    this.extraBedding = extraBedding;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Defines the configuration (type, size and quality) of any extra beds the room type may have.")
  @JsonProperty("extraBedding")
  public List<BedDTO> getExtraBedding() {
    return extraBedding;
  }
  public void setExtraBedding(List<BedDTO> extraBedding) {
    this.extraBedding = extraBedding;
  }

  
  /**
   * Defines the maximum occupancy for the room, counting adults and children.
   **/
  public RoomTypeDTO maxOccupancy(OccupancyDTO maxOccupancy) {
    this.maxOccupancy = maxOccupancy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Defines the maximum occupancy for the room, counting adults and children.")
  @JsonProperty("maxOccupancy")
  public OccupancyDTO getMaxOccupancy() {
    return maxOccupancy;
  }
  public void setMaxOccupancy(OccupancyDTO maxOccupancy) {
    this.maxOccupancy = maxOccupancy;
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
   * Expedia ID for this resource. Generated when created. Generated on POST, required on PUT
   **/
  public RoomTypeDTO resourceId(Long resourceId) {
    this.resourceId = resourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Expedia ID for this resource. Generated when created. Generated on POST, required on PUT")
  @JsonProperty("resourceId")
  public Long getResourceId() {
    return resourceId;
  }
  public void setResourceId(Long resourceId) {
    this.resourceId = resourceId;
  }

  
  /**
   * Used to define room size. When used, both size in square feet and in square meters must be specified.
   **/
  public RoomTypeDTO roomSize(RoomSizeDTO roomSize) {
    this.roomSize = roomSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Used to define room size. When used, both size in square feet and in square meters must be specified.")
  @JsonProperty("roomSize")
  public RoomSizeDTO getRoomSize() {
    return roomSize;
  }
  public void setRoomSize(RoomSizeDTO roomSize) {
    this.roomSize = roomSize;
  }

  
  /**
   * Used to define whether the room type is smoking, nonsmoking, or if both options are available on request. If a single smoking option is provided, then the room is, by default, only available in this configuration. If both options are provided, then a choice will be offered to the customer at the time he makes a reservation, and the customer preference will be sent in electronic booking messages to the partner
   **/
  public RoomTypeDTO smokingPreferences(List<SmokingPreferencesEnum> smokingPreferences) {
    this.smokingPreferences = smokingPreferences;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Used to define whether the room type is smoking, nonsmoking, or if both options are available on request. If a single smoking option is provided, then the room is, by default, only available in this configuration. If both options are provided, then a choice will be offered to the customer at the time he makes a reservation, and the customer preference will be sent in electronic booking messages to the partner")
  @JsonProperty("smokingPreferences")
  public List<SmokingPreferencesEnum> getSmokingPreferences() {
    return smokingPreferences;
  }
  public void setSmokingPreferences(List<SmokingPreferencesEnum> smokingPreferences) {
    this.smokingPreferences = smokingPreferences;
  }

  
  /**
   * Lists the different combination of beds (type, size and quality) a room may have.
   **/
  public RoomTypeDTO standardBedding(List<BeddingOptionDTO> standardBedding) {
    this.standardBedding = standardBedding;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Lists the different combination of beds (type, size and quality) a room may have.")
  @JsonProperty("standardBedding")
  public List<BeddingOptionDTO> getStandardBedding() {
    return standardBedding;
  }
  public void setStandardBedding(List<BeddingOptionDTO> standardBedding) {
    this.standardBedding = standardBedding;
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
   * Used to indicate the views available from this room.
   **/
  public RoomTypeDTO views(List<ViewsEnum> views) {
    this.views = views;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Used to indicate the views available from this room.")
  @JsonProperty("views")
  public List<ViewsEnum> getViews() {
    return views;
  }
  public void setViews(List<ViewsEnum> views) {
    this.views = views;
  }

  
  /**
   * Used to indicate whether the room is configured to be wheelchair accessible or not.
   **/
  public RoomTypeDTO wheelchairAccessibility(Boolean wheelchairAccessibility) {
    this.wheelchairAccessibility = wheelchairAccessibility;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Used to indicate whether the room is configured to be wheelchair accessible or not.")
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
    return Objects.equals(this.ageCategories, roomTypeDTO.ageCategories) &&
        Objects.equals(this.extraBedding, roomTypeDTO.extraBedding) &&
        Objects.equals(this.maxOccupancy, roomTypeDTO.maxOccupancy) &&
        Objects.equals(this.name, roomTypeDTO.name) &&
        Objects.equals(this.partnerCode, roomTypeDTO.partnerCode) &&
        Objects.equals(this.resourceId, roomTypeDTO.resourceId) &&
        Objects.equals(this.roomSize, roomTypeDTO.roomSize) &&
        Objects.equals(this.smokingPreferences, roomTypeDTO.smokingPreferences) &&
        Objects.equals(this.standardBedding, roomTypeDTO.standardBedding) &&
        Objects.equals(this.status, roomTypeDTO.status) &&
        Objects.equals(this.views, roomTypeDTO.views) &&
        Objects.equals(this.wheelchairAccessibility, roomTypeDTO.wheelchairAccessibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageCategories, extraBedding, maxOccupancy, name, partnerCode, resourceId, roomSize, smokingPreferences, standardBedding, status, views, wheelchairAccessibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomTypeDTO {\n");
    
    sb.append("    ageCategories: ").append(toIndentedString(ageCategories)).append("\n");
    sb.append("    extraBedding: ").append(toIndentedString(extraBedding)).append("\n");
    sb.append("    maxOccupancy: ").append(toIndentedString(maxOccupancy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    partnerCode: ").append(toIndentedString(partnerCode)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    roomSize: ").append(toIndentedString(roomSize)).append("\n");
    sb.append("    smokingPreferences: ").append(toIndentedString(smokingPreferences)).append("\n");
    sb.append("    standardBedding: ").append(toIndentedString(standardBedding)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


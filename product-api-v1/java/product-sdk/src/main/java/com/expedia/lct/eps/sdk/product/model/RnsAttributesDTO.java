package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-02T10:27:36.680-04:00")
public class RnsAttributesDTO   {
  
  private String typeOfRoom = null;
  private String roomClass = null;
  private Boolean includeBedType = false;
  private String bedroomDetails = null;
  private Boolean includeSmokingPref = false;
  private Boolean accessibility = false;
  private String view = null;
  private String featuredAmenity = null;
  private String area = null;
  private String customLabel = null;

  
  /**
   * Attribute that determines the type of room, which is used to compose the name
   **/
  public RnsAttributesDTO typeOfRoom(String typeOfRoom) {
    this.typeOfRoom = typeOfRoom;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that determines the type of room, which is used to compose the name")
  @JsonProperty("typeOfRoom")
  public String getTypeOfRoom() {
    return typeOfRoom;
  }
  public void setTypeOfRoom(String typeOfRoom) {
    this.typeOfRoom = typeOfRoom;
  }

  
  /**
   * Attribute that described the class of room, which is used to compose the name
   **/
  public RnsAttributesDTO roomClass(String roomClass) {
    this.roomClass = roomClass;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that described the class of room, which is used to compose the name")
  @JsonProperty("roomClass")
  public String getRoomClass() {
    return roomClass;
  }
  public void setRoomClass(String roomClass) {
    this.roomClass = roomClass;
  }

  
  /**
   * Attribute that determines whether or not to include bed type on the room name
   **/
  public RnsAttributesDTO includeBedType(Boolean includeBedType) {
    this.includeBedType = includeBedType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that determines whether or not to include bed type on the room name")
  @JsonProperty("includeBedType")
  public Boolean getIncludeBedType() {
    return includeBedType;
  }
  public void setIncludeBedType(Boolean includeBedType) {
    this.includeBedType = includeBedType;
  }

  
  /**
   * Attribute that describes details of the bedroom used to compose the name of the room
   **/
  public RnsAttributesDTO bedroomDetails(String bedroomDetails) {
    this.bedroomDetails = bedroomDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that describes details of the bedroom used to compose the name of the room")
  @JsonProperty("bedroomDetails")
  public String getBedroomDetails() {
    return bedroomDetails;
  }
  public void setBedroomDetails(String bedroomDetails) {
    this.bedroomDetails = bedroomDetails;
  }

  
  /**
   * Attribute that determines if room has smoking preference
   **/
  public RnsAttributesDTO includeSmokingPref(Boolean includeSmokingPref) {
    this.includeSmokingPref = includeSmokingPref;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that determines if room has smoking preference")
  @JsonProperty("includeSmokingPref")
  public Boolean getIncludeSmokingPref() {
    return includeSmokingPref;
  }
  public void setIncludeSmokingPref(Boolean includeSmokingPref) {
    this.includeSmokingPref = includeSmokingPref;
  }

  
  /**
   * Attribute that determines if room is considered wheelchair accessible
   **/
  public RnsAttributesDTO accessibility(Boolean accessibility) {
    this.accessibility = accessibility;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that determines if room is considered wheelchair accessible")
  @JsonProperty("accessibility")
  public Boolean getAccessibility() {
    return accessibility;
  }
  public void setAccessibility(Boolean accessibility) {
    this.accessibility = accessibility;
  }

  
  /**
   * Attribute that gives additional information about the view of the room
   **/
  public RnsAttributesDTO view(String view) {
    this.view = view;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that gives additional information about the view of the room")
  @JsonProperty("view")
  public String getView() {
    return view;
  }
  public void setView(String view) {
    this.view = view;
  }

  
  /**
   * Attribute used to highlight a feature of the room on its name
   **/
  public RnsAttributesDTO featuredAmenity(String featuredAmenity) {
    this.featuredAmenity = featuredAmenity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute used to highlight a feature of the room on its name")
  @JsonProperty("featuredAmenity")
  public String getFeaturedAmenity() {
    return featuredAmenity;
  }
  public void setFeaturedAmenity(String featuredAmenity) {
    this.featuredAmenity = featuredAmenity;
  }

  
  /**
   * Attributed used to highlight the location of the room
   **/
  public RnsAttributesDTO area(String area) {
    this.area = area;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attributed used to highlight the location of the room")
  @JsonProperty("area")
  public String getArea() {
    return area;
  }
  public void setArea(String area) {
    this.area = area;
  }

  
  /**
   * Free text that can be appended to the name generated by the attributes. Use of this attribute is discouraged (see full spec). Max 37 characters
   **/
  public RnsAttributesDTO customLabel(String customLabel) {
    this.customLabel = customLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Free text that can be appended to the name generated by the attributes. Use of this attribute is discouraged (see full spec). Max 37 characters")
  @JsonProperty("customLabel")
  public String getCustomLabel() {
    return customLabel;
  }
  public void setCustomLabel(String customLabel) {
    this.customLabel = customLabel;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RnsAttributesDTO rnsAttributesDTO = (RnsAttributesDTO) o;
    return Objects.equals(this.typeOfRoom, rnsAttributesDTO.typeOfRoom) &&
        Objects.equals(this.roomClass, rnsAttributesDTO.roomClass) &&
        Objects.equals(this.includeBedType, rnsAttributesDTO.includeBedType) &&
        Objects.equals(this.bedroomDetails, rnsAttributesDTO.bedroomDetails) &&
        Objects.equals(this.includeSmokingPref, rnsAttributesDTO.includeSmokingPref) &&
        Objects.equals(this.accessibility, rnsAttributesDTO.accessibility) &&
        Objects.equals(this.view, rnsAttributesDTO.view) &&
        Objects.equals(this.featuredAmenity, rnsAttributesDTO.featuredAmenity) &&
        Objects.equals(this.area, rnsAttributesDTO.area) &&
        Objects.equals(this.customLabel, rnsAttributesDTO.customLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeOfRoom, roomClass, includeBedType, bedroomDetails, includeSmokingPref, accessibility, view, featuredAmenity, area, customLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RnsAttributesDTO {\n");
    
    sb.append("    typeOfRoom: ").append(toIndentedString(typeOfRoom)).append("\n");
    sb.append("    roomClass: ").append(toIndentedString(roomClass)).append("\n");
    sb.append("    includeBedType: ").append(toIndentedString(includeBedType)).append("\n");
    sb.append("    bedroomDetails: ").append(toIndentedString(bedroomDetails)).append("\n");
    sb.append("    includeSmokingPref: ").append(toIndentedString(includeSmokingPref)).append("\n");
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    featuredAmenity: ").append(toIndentedString(featuredAmenity)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    customLabel: ").append(toIndentedString(customLabel)).append("\n");
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


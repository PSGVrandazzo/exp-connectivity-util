package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.expedia.lct.eps.sdk.product.model.ErrorDTO;
import com.expedia.lct.eps.sdk.product.model.RoomTypeAmenityDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-10T14:38:55.703-04:00")
public class ResponseWrapperDTOListRoomTypeAmenityDTO   {
  
  private List<RoomTypeAmenityDTO> entity = new ArrayList<RoomTypeAmenityDTO>();
  private List<ErrorDTO> errors = new ArrayList<ErrorDTO>();

  
  /**
   **/
  public ResponseWrapperDTOListRoomTypeAmenityDTO entity(List<RoomTypeAmenityDTO> entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entity")
  public List<RoomTypeAmenityDTO> getEntity() {
    return entity;
  }
  public void setEntity(List<RoomTypeAmenityDTO> entity) {
    this.entity = entity;
  }

  
  /**
   **/
  public ResponseWrapperDTOListRoomTypeAmenityDTO errors(List<ErrorDTO> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errors")
  public List<ErrorDTO> getErrors() {
    return errors;
  }
  public void setErrors(List<ErrorDTO> errors) {
    this.errors = errors;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseWrapperDTOListRoomTypeAmenityDTO responseWrapperDTOListRoomTypeAmenityDTO = (ResponseWrapperDTOListRoomTypeAmenityDTO) o;
    return Objects.equals(this.entity, responseWrapperDTOListRoomTypeAmenityDTO.entity) &&
        Objects.equals(this.errors, responseWrapperDTOListRoomTypeAmenityDTO.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWrapperDTOListRoomTypeAmenityDTO {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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


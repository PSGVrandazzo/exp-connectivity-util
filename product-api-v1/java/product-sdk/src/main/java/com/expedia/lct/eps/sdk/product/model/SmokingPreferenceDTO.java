package com.expedia.lct.eps.sdk.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-02T10:27:36.680-04:00")
public class SmokingPreferenceDTO   {
  


  public enum IdEnum {
    _1("2.1"),
    _2("2.2");

    private String value;

    IdEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private IdEnum id = null;
  private String name = null;

  
  /**
   * Id identifying the smoking preference.
   **/
  public SmokingPreferenceDTO id(IdEnum id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id identifying the smoking preference.")
  @JsonProperty("id")
  public IdEnum getId() {
    return id;
  }
  public void setId(IdEnum id) {
    this.id = id;
  }

  
  /**
   * Name identifying the smoking preference.
   **/
  public SmokingPreferenceDTO name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name identifying the smoking preference.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmokingPreferenceDTO smokingPreferenceDTO = (SmokingPreferenceDTO) o;
    return Objects.equals(this.id, smokingPreferenceDTO.id) &&
        Objects.equals(this.name, smokingPreferenceDTO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmokingPreferenceDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


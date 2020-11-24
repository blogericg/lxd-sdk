/*
 * LXD
 * The services listed below are referred as .....
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@relxd.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.relxd.lxd.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.relxd.lxd.model.DevicesKvm;
import org.relxd.lxd.model.MemoryLimitsConfig;

/**
 * GetProfilesByNameResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-24T09:07:38.931+02:00[Africa/Harare]")
public class GetProfilesByNameResponse {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private MemoryLimitsConfig config;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private DevicesKvm devices;

  public static final String SERIALIZED_NAME_USED_BY = "used_by";
  @SerializedName(SERIALIZED_NAME_USED_BY)
  private List<String> usedBy = null;


  public GetProfilesByNameResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetProfilesByNameResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Some description string", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetProfilesByNameResponse config(MemoryLimitsConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MemoryLimitsConfig getConfig() {
    return config;
  }


  public void setConfig(MemoryLimitsConfig config) {
    this.config = config;
  }


  public GetProfilesByNameResponse devices(DevicesKvm devices) {
    
    this.devices = devices;
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DevicesKvm getDevices() {
    return devices;
  }


  public void setDevices(DevicesKvm devices) {
    this.devices = devices;
  }


  public GetProfilesByNameResponse usedBy(List<String> usedBy) {
    
    this.usedBy = usedBy;
    return this;
  }

  public GetProfilesByNameResponse addUsedByItem(String usedByItem) {
    if (this.usedBy == null) {
      this.usedBy = new ArrayList<String>();
    }
    this.usedBy.add(usedByItem);
    return this;
  }

   /**
   * Get usedBy
   * @return usedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"/1.0/instances/blah\"]", value = "")

  public List<String> getUsedBy() {
    return usedBy;
  }


  public void setUsedBy(List<String> usedBy) {
    this.usedBy = usedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProfilesByNameResponse getProfilesByNameResponse = (GetProfilesByNameResponse) o;
    return Objects.equals(this.name, getProfilesByNameResponse.name) &&
        Objects.equals(this.description, getProfilesByNameResponse.description) &&
        Objects.equals(this.config, getProfilesByNameResponse.config) &&
        Objects.equals(this.devices, getProfilesByNameResponse.devices) &&
        Objects.equals(this.usedBy, getProfilesByNameResponse.usedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, config, devices, usedBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProfilesByNameResponse {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    usedBy: ").append(toIndentedString(usedBy)).append("\n");
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


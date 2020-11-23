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
import org.relxd.lxd.model.NetworkIPConfig;

/**
 * GetNetworksByNameResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-23T13:37:46.576+02:00[Africa/Harare]")
public class GetNetworksByNameResponse {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private NetworkIPConfig config;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MANAGED = "managed";
  @SerializedName(SERIALIZED_NAME_MANAGED)
  private Boolean managed;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_USED_BY = "used_by";
  @SerializedName(SERIALIZED_NAME_USED_BY)
  private List<String> usedBy = null;


  public GetNetworksByNameResponse config(NetworkIPConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NetworkIPConfig getConfig() {
    return config;
  }


  public void setConfig(NetworkIPConfig config) {
    this.config = config;
  }


  public GetNetworksByNameResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "lxdbr0", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetNetworksByNameResponse managed(Boolean managed) {
    
    this.managed = managed;
    return this;
  }

   /**
   * Get managed
   * @return managed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getManaged() {
    return managed;
  }


  public void setManaged(Boolean managed) {
    this.managed = managed;
  }


  public GetNetworksByNameResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bridge", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public GetNetworksByNameResponse usedBy(List<String> usedBy) {
    
    this.usedBy = usedBy;
    return this;
  }

  public GetNetworksByNameResponse addUsedByItem(String usedByItem) {
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
    GetNetworksByNameResponse getNetworksByNameResponse = (GetNetworksByNameResponse) o;
    return Objects.equals(this.config, getNetworksByNameResponse.config) &&
        Objects.equals(this.name, getNetworksByNameResponse.name) &&
        Objects.equals(this.managed, getNetworksByNameResponse.managed) &&
        Objects.equals(this.type, getNetworksByNameResponse.type) &&
        Objects.equals(this.usedBy, getNetworksByNameResponse.usedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, name, managed, type, usedBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNetworksByNameResponse {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


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
import org.relxd.lxd.model.Source13;

/**
 * Input (when copying a volume)
 */
@ApiModel(description = "Input (when copying a volume)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-24T09:07:38.931+02:00[Africa/Harare]")
public class CreateStoragePoolsByNameVolumesByTypeRequest {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private Object config;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private Source13 source;


  public CreateStoragePoolsByNameVolumesByTypeRequest config(Object config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "")

  public Object getConfig() {
    return config;
  }


  public void setConfig(Object config) {
    this.config = config;
  }


  public CreateStoragePoolsByNameVolumesByTypeRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "vol1", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateStoragePoolsByNameVolumesByTypeRequest source(Source13 source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Source13 getSource() {
    return source;
  }


  public void setSource(Source13 source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateStoragePoolsByNameVolumesByTypeRequest createStoragePoolsByNameVolumesByTypeRequest = (CreateStoragePoolsByNameVolumesByTypeRequest) o;
    return Objects.equals(this.config, createStoragePoolsByNameVolumesByTypeRequest.config) &&
        Objects.equals(this.name, createStoragePoolsByNameVolumesByTypeRequest.name) &&
        Objects.equals(this.source, createStoragePoolsByNameVolumesByTypeRequest.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, name, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateStoragePoolsByNameVolumesByTypeRequest {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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


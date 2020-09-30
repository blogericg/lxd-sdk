/*
 * LXD
 * The services listed below are referred as .....
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@competitionlabs.com
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
import org.relxd.lxd.model.Config9;

/**
 * GetStoragePoolsByNameResponseMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-30T13:16:18.308214+01:00[Europe/London]")
public class GetStoragePoolsByNameResponseMetadata {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_USED_BY = "used_by";
  @SerializedName(SERIALIZED_NAME_USED_BY)
  private List<String> usedBy = null;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private Config9 config;


  public GetStoragePoolsByNameResponseMetadata name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "default", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetStoragePoolsByNameResponseMetadata driver(String driver) {
    
    this.driver = driver;
    return this;
  }

   /**
   * Get driver
   * @return driver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "zfs", value = "")

  public String getDriver() {
    return driver;
  }


  public void setDriver(String driver) {
    this.driver = driver;
  }


  public GetStoragePoolsByNameResponseMetadata usedBy(List<String> usedBy) {
    
    this.usedBy = usedBy;
    return this;
  }

  public GetStoragePoolsByNameResponseMetadata addUsedByItem(String usedByItem) {
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
  @ApiModelProperty(example = "[\"/1.0/instances/alp1\",\"/1.0/instances/alp10\",\"/1.0/instances/alp11\",\"/1.0/instances/alp12\",\"/1.0/instances/alp13\",\"/1.0/instances/alp14\",\"/1.0/instances/alp15\",\"/1.0/instances/alp16\",\"/1.0/instances/alp17\",\"/1.0/instances/alp18\",\"/1.0/instances/alp19\",\"/1.0/instances/alp2\",\"/1.0/instances/alp20\",\"/1.0/instances/alp3\",\"/1.0/instances/alp4\",\"/1.0/instances/alp5\",\"/1.0/instances/alp6\",\"/1.0/instances/alp7\",\"/1.0/instances/alp8\",\"/1.0/instances/alp9\",\"/1.0/images/62e850a334bb9d99cac00b2e618e0291e5e7bb7db56c4246ecaf8e46fa0631a6\"]", value = "")

  public List<String> getUsedBy() {
    return usedBy;
  }


  public void setUsedBy(List<String> usedBy) {
    this.usedBy = usedBy;
  }


  public GetStoragePoolsByNameResponseMetadata config(Config9 config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Config9 getConfig() {
    return config;
  }


  public void setConfig(Config9 config) {
    this.config = config;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStoragePoolsByNameResponseMetadata getStoragePoolsByNameResponseMetadata = (GetStoragePoolsByNameResponseMetadata) o;
    return Objects.equals(this.name, getStoragePoolsByNameResponseMetadata.name) &&
        Objects.equals(this.driver, getStoragePoolsByNameResponseMetadata.driver) &&
        Objects.equals(this.usedBy, getStoragePoolsByNameResponseMetadata.usedBy) &&
        Objects.equals(this.config, getStoragePoolsByNameResponseMetadata.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, driver, usedBy, config);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStoragePoolsByNameResponseMetadata {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    usedBy: ").append(toIndentedString(usedBy)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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


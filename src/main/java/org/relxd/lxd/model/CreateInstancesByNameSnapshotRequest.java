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

/**
 * CreateInstancesByNameSnapshotRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-30T13:16:18.308214+01:00[Europe/London]")
public class CreateInstancesByNameSnapshotRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATEFUL = "stateful";
  @SerializedName(SERIALIZED_NAME_STATEFUL)
  private Boolean stateful;


  public CreateInstancesByNameSnapshotRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the snapshot
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-snapshot", value = "Name of the snapshot")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateInstancesByNameSnapshotRequest stateful(Boolean stateful) {
    
    this.stateful = stateful;
    return this;
  }

   /**
   * Whether to include state too
   * @return stateful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether to include state too")

  public Boolean getStateful() {
    return stateful;
  }


  public void setStateful(Boolean stateful) {
    this.stateful = stateful;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstancesByNameSnapshotRequest createInstancesByNameSnapshotRequest = (CreateInstancesByNameSnapshotRequest) o;
    return Objects.equals(this.name, createInstancesByNameSnapshotRequest.name) &&
        Objects.equals(this.stateful, createInstancesByNameSnapshotRequest.stateful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, stateful);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstancesByNameSnapshotRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stateful: ").append(toIndentedString(stateful)).append("\n");
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


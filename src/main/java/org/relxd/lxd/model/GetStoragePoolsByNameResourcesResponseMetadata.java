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
import org.relxd.lxd.model.SpaceInodes;

/**
 * GetStoragePoolsByNameResourcesResponseMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-24T09:07:38.931+02:00[Africa/Harare]")
public class GetStoragePoolsByNameResourcesResponseMetadata {
  public static final String SERIALIZED_NAME_SPACE = "space";
  @SerializedName(SERIALIZED_NAME_SPACE)
  private SpaceInodes space;

  public static final String SERIALIZED_NAME_INODES = "inodes";
  @SerializedName(SERIALIZED_NAME_INODES)
  private SpaceInodes inodes;


  public GetStoragePoolsByNameResourcesResponseMetadata space(SpaceInodes space) {
    
    this.space = space;
    return this;
  }

   /**
   * Get space
   * @return space
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpaceInodes getSpace() {
    return space;
  }


  public void setSpace(SpaceInodes space) {
    this.space = space;
  }


  public GetStoragePoolsByNameResourcesResponseMetadata inodes(SpaceInodes inodes) {
    
    this.inodes = inodes;
    return this;
  }

   /**
   * Get inodes
   * @return inodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpaceInodes getInodes() {
    return inodes;
  }


  public void setInodes(SpaceInodes inodes) {
    this.inodes = inodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStoragePoolsByNameResourcesResponseMetadata getStoragePoolsByNameResourcesResponseMetadata = (GetStoragePoolsByNameResourcesResponseMetadata) o;
    return Objects.equals(this.space, getStoragePoolsByNameResourcesResponseMetadata.space) &&
        Objects.equals(this.inodes, getStoragePoolsByNameResourcesResponseMetadata.inodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(space, inodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStoragePoolsByNameResourcesResponseMetadata {\n");
    sb.append("    space: ").append(toIndentedString(space)).append("\n");
    sb.append("    inodes: ").append(toIndentedString(inodes)).append("\n");
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


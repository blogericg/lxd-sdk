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
import org.relxd.lxd.model.BackgroundOperationResponse;
import org.relxd.lxd.model.GetStoragePoolsByNameResponseAllOf;
import org.relxd.lxd.model.GetStoragePoolsByNameResponseMetadata;

/**
 * GetStoragePoolsByNameResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-24T09:07:38.931+02:00[Africa/Harare]")
public class GetStoragePoolsByNameResponse extends BackgroundOperationResponse {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private GetStoragePoolsByNameResponseMetadata metadata;

  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Integer errorCode;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;


  public GetStoragePoolsByNameResponse metadata(GetStoragePoolsByNameResponseMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetStoragePoolsByNameResponseMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(GetStoragePoolsByNameResponseMetadata metadata) {
    this.metadata = metadata;
  }


  public GetStoragePoolsByNameResponse errorCode(Integer errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  public GetStoragePoolsByNameResponse error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStoragePoolsByNameResponse getStoragePoolsByNameResponse = (GetStoragePoolsByNameResponse) o;
    return Objects.equals(this.metadata, getStoragePoolsByNameResponse.metadata) &&
        Objects.equals(this.errorCode, getStoragePoolsByNameResponse.errorCode) &&
        Objects.equals(this.error, getStoragePoolsByNameResponse.error) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, errorCode, error, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStoragePoolsByNameResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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


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

/**
 * GetOperationsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-23T12:53:01.261363+02:00[Africa/Harare]")
public class GetOperationsResponse {
  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private List<String> success = null;

  public static final String SERIALIZED_NAME_RUNNING = "running";
  @SerializedName(SERIALIZED_NAME_RUNNING)
  private List<String> running = null;


  public GetOperationsResponse success(List<String> success) {
    
    this.success = success;
    return this;
  }

  public GetOperationsResponse addSuccessItem(String successItem) {
    if (this.success == null) {
      this.success = new ArrayList<String>();
    }
    this.success.add(successItem);
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"/1.0/operations/c0fc0d0d-a997-462b-842b-f8bd0df82507\"]", value = "")

  public List<String> getSuccess() {
    return success;
  }


  public void setSuccess(List<String> success) {
    this.success = success;
  }


  public GetOperationsResponse running(List<String> running) {
    
    this.running = running;
    return this;
  }

  public GetOperationsResponse addRunningItem(String runningItem) {
    if (this.running == null) {
      this.running = new ArrayList<String>();
    }
    this.running.add(runningItem);
    return this;
  }

   /**
   * Get running
   * @return running
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"/1.0/operations/092a8755-fd90-4ce4-bf91-9f87d03fd5bc\"]", value = "")

  public List<String> getRunning() {
    return running;
  }


  public void setRunning(List<String> running) {
    this.running = running;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOperationsResponse getOperationsResponse = (GetOperationsResponse) o;
    return Objects.equals(this.success, getOperationsResponse.success) &&
        Objects.equals(this.running, getOperationsResponse.running);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, running);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOperationsResponse {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
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


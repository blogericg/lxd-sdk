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
import org.relxd.lxd.model.Fds1;

/**
 * Return (with wait-for-websocket&#x3D;true and interactive&#x3D;false)
 */
@ApiModel(description = "Return (with wait-for-websocket=true and interactive=false)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-24T09:07:38.931+02:00[Africa/Harare]")
public class CreateInstancesByNameExecResponse1 {
  public static final String SERIALIZED_NAME_FDS = "fds";
  @SerializedName(SERIALIZED_NAME_FDS)
  private Fds1 fds;


  public CreateInstancesByNameExecResponse1 fds(Fds1 fds) {
    
    this.fds = fds;
    return this;
  }

   /**
   * Get fds
   * @return fds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Fds1 getFds() {
    return fds;
  }


  public void setFds(Fds1 fds) {
    this.fds = fds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstancesByNameExecResponse1 createInstancesByNameExecResponse1 = (CreateInstancesByNameExecResponse1) o;
    return Objects.equals(this.fds, createInstancesByNameExecResponse1.fds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstancesByNameExecResponse1 {\n");
    sb.append("    fds: ").append(toIndentedString(fds)).append("\n");
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


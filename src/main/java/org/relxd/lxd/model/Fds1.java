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

/**
 * Fds1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-23T13:37:46.576+02:00[Africa/Harare]")
public class Fds1 {
  public static final String SERIALIZED_NAME_0 = "0";
  @SerializedName(SERIALIZED_NAME_0)
  private String _0;

  public static final String SERIALIZED_NAME_1 = "1";
  @SerializedName(SERIALIZED_NAME_1)
  private String _1;

  public static final String SERIALIZED_NAME_2 = "2";
  @SerializedName(SERIALIZED_NAME_2)
  private String _2;

  public static final String SERIALIZED_NAME_CONTROL = "control";
  @SerializedName(SERIALIZED_NAME_CONTROL)
  private String control;


  public Fds1 _0(String _0) {
    
    this._0 = _0;
    return this;
  }

   /**
   * Get _0
   * @return _0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f5b6c760c0aa37a6430dd2a00c456430282d89f6e1661a077a926ed1bf3d1c21", value = "")

  public String get0() {
    return _0;
  }


  public void set0(String _0) {
    this._0 = _0;
  }


  public Fds1 _1(String _1) {
    
    this._1 = _1;
    return this;
  }

   /**
   * Get _1
   * @return _1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f5b6c760c0aa37a6430dd2a00c456430282d89f6e1661a077a926ed1bf3d1c21", value = "")

  public String get1() {
    return _1;
  }


  public void set1(String _1) {
    this._1 = _1;
  }


  public Fds1 _2(String _2) {
    
    this._2 = _2;
    return this;
  }

   /**
   * Get _2
   * @return _2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f5b6c760c0aa37a6430dd2a00c456430282d89f6e1661a077a926ed1bf3d1c21", value = "")

  public String get2() {
    return _2;
  }


  public void set2(String _2) {
    this._2 = _2;
  }


  public Fds1 control(String control) {
    
    this.control = control;
    return this;
  }

   /**
   * Get control
   * @return control
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f5b6c760c0aa37a6430dd2a00c456430282d89f6e1661a077a926ed1bf3d1c21", value = "")

  public String getControl() {
    return control;
  }


  public void setControl(String control) {
    this.control = control;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fds1 fds1 = (Fds1) o;
    return Objects.equals(this._0, fds1._0) &&
        Objects.equals(this._1, fds1._1) &&
        Objects.equals(this._2, fds1._2) &&
        Objects.equals(this.control, fds1.control);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_0, _1, _2, control);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fds1 {\n");
    sb.append("    _0: ").append(toIndentedString(_0)).append("\n");
    sb.append("    _1: ").append(toIndentedString(_1)).append("\n");
    sb.append("    _2: ").append(toIndentedString(_2)).append("\n");
    sb.append("    control: ").append(toIndentedString(control)).append("\n");
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


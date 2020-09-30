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
 * ExpandedConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-30T13:16:18.308214+01:00[Europe/London]")
public class ExpandedConfig {
  public static final String SERIALIZED_NAME_LIMITS_CPU = "limits.cpu";
  @SerializedName(SERIALIZED_NAME_LIMITS_CPU)
  private String limitsCpu;

  public static final String SERIALIZED_NAME_VOLATILE_BASE_IMAGE = "volatile.base_image";
  @SerializedName(SERIALIZED_NAME_VOLATILE_BASE_IMAGE)
  private String volatileBaseImage;

  public static final String SERIALIZED_NAME_VOLATILE_ETH0_HWADDR = "volatile.eth0.hwaddr";
  @SerializedName(SERIALIZED_NAME_VOLATILE_ETH0_HWADDR)
  private String volatileEth0Hwaddr;


  public ExpandedConfig limitsCpu(String limitsCpu) {
    
    this.limitsCpu = limitsCpu;
    return this;
  }

   /**
   * Get limitsCpu
   * @return limitsCpu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "")

  public String getLimitsCpu() {
    return limitsCpu;
  }


  public void setLimitsCpu(String limitsCpu) {
    this.limitsCpu = limitsCpu;
  }


  public ExpandedConfig volatileBaseImage(String volatileBaseImage) {
    
    this.volatileBaseImage = volatileBaseImage;
    return this;
  }

   /**
   * Get volatileBaseImage
   * @return volatileBaseImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "97d97a3d1d053840ca19c86cdd0596cf1be060c5157d31407f2a4f9f350c78cc", value = "")

  public String getVolatileBaseImage() {
    return volatileBaseImage;
  }


  public void setVolatileBaseImage(String volatileBaseImage) {
    this.volatileBaseImage = volatileBaseImage;
  }


  public ExpandedConfig volatileEth0Hwaddr(String volatileEth0Hwaddr) {
    
    this.volatileEth0Hwaddr = volatileEth0Hwaddr;
    return this;
  }

   /**
   * Get volatileEth0Hwaddr
   * @return volatileEth0Hwaddr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00:16:3e:1c:94:38", value = "")

  public String getVolatileEth0Hwaddr() {
    return volatileEth0Hwaddr;
  }


  public void setVolatileEth0Hwaddr(String volatileEth0Hwaddr) {
    this.volatileEth0Hwaddr = volatileEth0Hwaddr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpandedConfig expandedConfig = (ExpandedConfig) o;
    return Objects.equals(this.limitsCpu, expandedConfig.limitsCpu) &&
        Objects.equals(this.volatileBaseImage, expandedConfig.volatileBaseImage) &&
        Objects.equals(this.volatileEth0Hwaddr, expandedConfig.volatileEth0Hwaddr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitsCpu, volatileBaseImage, volatileEth0Hwaddr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpandedConfig {\n");
    sb.append("    limitsCpu: ").append(toIndentedString(limitsCpu)).append("\n");
    sb.append("    volatileBaseImage: ").append(toIndentedString(volatileBaseImage)).append("\n");
    sb.append("    volatileEth0Hwaddr: ").append(toIndentedString(volatileEth0Hwaddr)).append("\n");
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


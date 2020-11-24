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
 * NetworkIPConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-24T09:07:38.931+02:00[Africa/Harare]")
public class NetworkIPConfig {
  public static final String SERIALIZED_NAME_IPV4_ADDRESS = "ipv4.address";
  @SerializedName(SERIALIZED_NAME_IPV4_ADDRESS)
  private String ipv4Address;

  public static final String SERIALIZED_NAME_IPV6_ADDRESS = "ipv6.address";
  @SerializedName(SERIALIZED_NAME_IPV6_ADDRESS)
  private String ipv6Address;

  public static final String SERIALIZED_NAME_IPV6_NAT = "ipv6.nat";
  @SerializedName(SERIALIZED_NAME_IPV6_NAT)
  private String ipv6Nat;


  public NetworkIPConfig ipv4Address(String ipv4Address) {
    
    this.ipv4Address = ipv4Address;
    return this;
  }

   /**
   * Get ipv4Address
   * @return ipv4Address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "none", value = "")

  public String getIpv4Address() {
    return ipv4Address;
  }


  public void setIpv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
  }


  public NetworkIPConfig ipv6Address(String ipv6Address) {
    
    this.ipv6Address = ipv6Address;
    return this;
  }

   /**
   * Get ipv6Address
   * @return ipv6Address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2001:470:b368:4242::1/64", value = "")

  public String getIpv6Address() {
    return ipv6Address;
  }


  public void setIpv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
  }


  public NetworkIPConfig ipv6Nat(String ipv6Nat) {
    
    this.ipv6Nat = ipv6Nat;
    return this;
  }

   /**
   * Get ipv6Nat
   * @return ipv6Nat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public String getIpv6Nat() {
    return ipv6Nat;
  }


  public void setIpv6Nat(String ipv6Nat) {
    this.ipv6Nat = ipv6Nat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkIPConfig networkIPConfig = (NetworkIPConfig) o;
    return Objects.equals(this.ipv4Address, networkIPConfig.ipv4Address) &&
        Objects.equals(this.ipv6Address, networkIPConfig.ipv6Address) &&
        Objects.equals(this.ipv6Nat, networkIPConfig.ipv6Nat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4Address, ipv6Address, ipv6Nat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkIPConfig {\n");
    sb.append("    ipv4Address: ").append(toIndentedString(ipv4Address)).append("\n");
    sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
    sb.append("    ipv6Nat: ").append(toIndentedString(ipv6Nat)).append("\n");
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


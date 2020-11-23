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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.relxd.lxd.model.Addresses;
import org.relxd.lxd.model.Counters;

/**
 * Eth02
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-23T13:37:46.576+02:00[Africa/Harare]")
public class Eth02 {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<Addresses> addresses = null;

  public static final String SERIALIZED_NAME_COUNTERS = "counters";
  @SerializedName(SERIALIZED_NAME_COUNTERS)
  private Counters counters;

  public static final String SERIALIZED_NAME_HWADDR = "hwaddr";
  @SerializedName(SERIALIZED_NAME_HWADDR)
  private String hwaddr;

  public static final String SERIALIZED_NAME_HOST_NAME = "host_name";
  @SerializedName(SERIALIZED_NAME_HOST_NAME)
  private String hostName;

  public static final String SERIALIZED_NAME_MTU = "mtu";
  @SerializedName(SERIALIZED_NAME_MTU)
  private BigDecimal mtu;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public Eth02 addresses(List<Addresses> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public Eth02 addAddressesItem(Addresses addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<Addresses>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Addresses> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<Addresses> addresses) {
    this.addresses = addresses;
  }


  public Eth02 counters(Counters counters) {
    
    this.counters = counters;
    return this;
  }

   /**
   * Get counters
   * @return counters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Counters getCounters() {
    return counters;
  }


  public void setCounters(Counters counters) {
    this.counters = counters;
  }


  public Eth02 hwaddr(String hwaddr) {
    
    this.hwaddr = hwaddr;
    return this;
  }

   /**
   * Get hwaddr
   * @return hwaddr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00:16:3e:ec:65:a8", value = "")

  public String getHwaddr() {
    return hwaddr;
  }


  public void setHwaddr(String hwaddr) {
    this.hwaddr = hwaddr;
  }


  public Eth02 hostName(String hostName) {
    
    this.hostName = hostName;
    return this;
  }

   /**
   * Get hostName
   * @return hostName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "vethBWTSU5", value = "")

  public String getHostName() {
    return hostName;
  }


  public void setHostName(String hostName) {
    this.hostName = hostName;
  }


  public Eth02 mtu(BigDecimal mtu) {
    
    this.mtu = mtu;
    return this;
  }

   /**
   * Get mtu
   * @return mtu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1500", value = "")

  public BigDecimal getMtu() {
    return mtu;
  }


  public void setMtu(BigDecimal mtu) {
    this.mtu = mtu;
  }


  public Eth02 state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "up", value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public Eth02 type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "broadcast", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Eth02 eth02 = (Eth02) o;
    return Objects.equals(this.addresses, eth02.addresses) &&
        Objects.equals(this.counters, eth02.counters) &&
        Objects.equals(this.hwaddr, eth02.hwaddr) &&
        Objects.equals(this.hostName, eth02.hostName) &&
        Objects.equals(this.mtu, eth02.mtu) &&
        Objects.equals(this.state, eth02.state) &&
        Objects.equals(this.type, eth02.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, counters, hwaddr, hostName, mtu, state, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eth02 {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
    sb.append("    hwaddr: ").append(toIndentedString(hwaddr)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


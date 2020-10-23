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
 * DiskConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-23T12:53:01.261363+02:00[Africa/Harare]")
public class DiskConfig {
  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_VOLUME_SIZE = "volume.size";
  @SerializedName(SERIALIZED_NAME_VOLUME_SIZE)
  private String volumeSize;

  public static final String SERIALIZED_NAME_ZFS_POOL_NAME = "zfs.pool_name";
  @SerializedName(SERIALIZED_NAME_ZFS_POOL_NAME)
  private String zfsPoolName;


  public DiskConfig size(String size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "61203283968", value = "")

  public String getSize() {
    return size;
  }


  public void setSize(String size) {
    this.size = size;
  }


  public DiskConfig source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/home/chb/mnt/l2/disks/default.img", value = "")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public DiskConfig volumeSize(String volumeSize) {
    
    this.volumeSize = volumeSize;
    return this;
  }

   /**
   * Get volumeSize
   * @return volumeSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public String getVolumeSize() {
    return volumeSize;
  }


  public void setVolumeSize(String volumeSize) {
    this.volumeSize = volumeSize;
  }


  public DiskConfig zfsPoolName(String zfsPoolName) {
    
    this.zfsPoolName = zfsPoolName;
    return this;
  }

   /**
   * Get zfsPoolName
   * @return zfsPoolName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "default", value = "")

  public String getZfsPoolName() {
    return zfsPoolName;
  }


  public void setZfsPoolName(String zfsPoolName) {
    this.zfsPoolName = zfsPoolName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiskConfig diskConfig = (DiskConfig) o;
    return Objects.equals(this.size, diskConfig.size) &&
        Objects.equals(this.source, diskConfig.source) &&
        Objects.equals(this.volumeSize, diskConfig.volumeSize) &&
        Objects.equals(this.zfsPoolName, diskConfig.zfsPoolName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, source, volumeSize, zfsPoolName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiskConfig {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
    sb.append("    zfsPoolName: ").append(toIndentedString(zfsPoolName)).append("\n");
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


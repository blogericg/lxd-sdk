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
import org.relxd.lxd.model.Aliases;
import org.relxd.lxd.model.Properties;
import org.relxd.lxd.model.UpdateSource;

/**
 * GetImagesFingerprintResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-23T12:53:01.261363+02:00[Africa/Harare]")
public class GetImagesFingerprintResponse {
  public static final String SERIALIZED_NAME_ALIASES = "aliases";
  @SerializedName(SERIALIZED_NAME_ALIASES)
  private List<Aliases> aliases = null;

  public static final String SERIALIZED_NAME_ARCHITECTURE = "architecture";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
  private String architecture;

  public static final String SERIALIZED_NAME_AUTO_UPDATE = "auto_update";
  @SerializedName(SERIALIZED_NAME_AUTO_UPDATE)
  private Boolean autoUpdate;

  public static final String SERIALIZED_NAME_CACHED = "cached";
  @SerializedName(SERIALIZED_NAME_CACHED)
  private Boolean cached;

  public static final String SERIALIZED_NAME_FINGERPRINT = "fingerprint";
  @SerializedName(SERIALIZED_NAME_FINGERPRINT)
  private String fingerprint;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Properties properties;

  public static final String SERIALIZED_NAME_UPDATE_SOURCE = "update_source";
  @SerializedName(SERIALIZED_NAME_UPDATE_SOURCE)
  private UpdateSource updateSource;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private BigDecimal size;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private String expiresAt;

  public static final String SERIALIZED_NAME_LAST_USED_AT = "last_used_at";
  @SerializedName(SERIALIZED_NAME_LAST_USED_AT)
  private String lastUsedAt;

  public static final String SERIALIZED_NAME_UPLOADED_AT = "uploaded_at";
  @SerializedName(SERIALIZED_NAME_UPLOADED_AT)
  private String uploadedAt;


  public GetImagesFingerprintResponse aliases(List<Aliases> aliases) {
    
    this.aliases = aliases;
    return this;
  }

  public GetImagesFingerprintResponse addAliasesItem(Aliases aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<Aliases>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * Get aliases
   * @return aliases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Aliases> getAliases() {
    return aliases;
  }


  public void setAliases(List<Aliases> aliases) {
    this.aliases = aliases;
  }


  public GetImagesFingerprintResponse architecture(String architecture) {
    
    this.architecture = architecture;
    return this;
  }

   /**
   * Get architecture
   * @return architecture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "x86_64", value = "")

  public String getArchitecture() {
    return architecture;
  }


  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }


  public GetImagesFingerprintResponse autoUpdate(Boolean autoUpdate) {
    
    this.autoUpdate = autoUpdate;
    return this;
  }

   /**
   * Get autoUpdate
   * @return autoUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getAutoUpdate() {
    return autoUpdate;
  }


  public void setAutoUpdate(Boolean autoUpdate) {
    this.autoUpdate = autoUpdate;
  }


  public GetImagesFingerprintResponse cached(Boolean cached) {
    
    this.cached = cached;
    return this;
  }

   /**
   * Get cached
   * @return cached
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getCached() {
    return cached;
  }


  public void setCached(Boolean cached) {
    this.cached = cached;
  }


  public GetImagesFingerprintResponse fingerprint(String fingerprint) {
    
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * Get fingerprint
   * @return fingerprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "54c8caac1f61901ed86c68f24af5f5d3672bdc62c71d04f06df3a59e95684473", value = "")

  public String getFingerprint() {
    return fingerprint;
  }


  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }


  public GetImagesFingerprintResponse filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ubuntu-bionic-18.04-amd64-server-20180201.tar.xz", value = "")

  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public GetImagesFingerprintResponse properties(Properties properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Properties getProperties() {
    return properties;
  }


  public void setProperties(Properties properties) {
    this.properties = properties;
  }


  public GetImagesFingerprintResponse updateSource(UpdateSource updateSource) {
    
    this.updateSource = updateSource;
    return this;
  }

   /**
   * Get updateSource
   * @return updateSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UpdateSource getUpdateSource() {
    return updateSource;
  }


  public void setUpdateSource(UpdateSource updateSource) {
    this.updateSource = updateSource;
  }


  public GetImagesFingerprintResponse _public(Boolean _public) {
    
    this._public = _public;
    return this;
  }

   /**
   * Get _public
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    this._public = _public;
  }


  public GetImagesFingerprintResponse size(BigDecimal size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123792592", value = "")

  public BigDecimal getSize() {
    return size;
  }


  public void setSize(BigDecimal size) {
    this.size = size;
  }


  public GetImagesFingerprintResponse createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-02-01T21:07:41Z", value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public GetImagesFingerprintResponse expiresAt(String expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1970-01-01T00:00:00Z", value = "")

  public String getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }


  public GetImagesFingerprintResponse lastUsedAt(String lastUsedAt) {
    
    this.lastUsedAt = lastUsedAt;
    return this;
  }

   /**
   * Get lastUsedAt
   * @return lastUsedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1970-01-01T00:00:00Z", value = "")

  public String getLastUsedAt() {
    return lastUsedAt;
  }


  public void setLastUsedAt(String lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
  }


  public GetImagesFingerprintResponse uploadedAt(String uploadedAt) {
    
    this.uploadedAt = uploadedAt;
    return this;
  }

   /**
   * Get uploadedAt
   * @return uploadedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-02-16T00:44:47Z", value = "")

  public String getUploadedAt() {
    return uploadedAt;
  }


  public void setUploadedAt(String uploadedAt) {
    this.uploadedAt = uploadedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetImagesFingerprintResponse getImagesFingerprintResponse = (GetImagesFingerprintResponse) o;
    return Objects.equals(this.aliases, getImagesFingerprintResponse.aliases) &&
        Objects.equals(this.architecture, getImagesFingerprintResponse.architecture) &&
        Objects.equals(this.autoUpdate, getImagesFingerprintResponse.autoUpdate) &&
        Objects.equals(this.cached, getImagesFingerprintResponse.cached) &&
        Objects.equals(this.fingerprint, getImagesFingerprintResponse.fingerprint) &&
        Objects.equals(this.filename, getImagesFingerprintResponse.filename) &&
        Objects.equals(this.properties, getImagesFingerprintResponse.properties) &&
        Objects.equals(this.updateSource, getImagesFingerprintResponse.updateSource) &&
        Objects.equals(this._public, getImagesFingerprintResponse._public) &&
        Objects.equals(this.size, getImagesFingerprintResponse.size) &&
        Objects.equals(this.createdAt, getImagesFingerprintResponse.createdAt) &&
        Objects.equals(this.expiresAt, getImagesFingerprintResponse.expiresAt) &&
        Objects.equals(this.lastUsedAt, getImagesFingerprintResponse.lastUsedAt) &&
        Objects.equals(this.uploadedAt, getImagesFingerprintResponse.uploadedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, architecture, autoUpdate, cached, fingerprint, filename, properties, updateSource, _public, size, createdAt, expiresAt, lastUsedAt, uploadedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetImagesFingerprintResponse {\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    autoUpdate: ").append(toIndentedString(autoUpdate)).append("\n");
    sb.append("    cached: ").append(toIndentedString(cached)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    updateSource: ").append(toIndentedString(updateSource)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    lastUsedAt: ").append(toIndentedString(lastUsedAt)).append("\n");
    sb.append("    uploadedAt: ").append(toIndentedString(uploadedAt)).append("\n");
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


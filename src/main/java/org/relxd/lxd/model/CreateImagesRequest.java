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
import java.util.ArrayList;
import java.util.List;
import org.relxd.lxd.model.Aliases;
import org.relxd.lxd.model.Properties3;
import org.relxd.lxd.model.Source10;

/**
 * Source image dictionary (transfers a remote image)
 */
@ApiModel(description = "Source image dictionary (transfers a remote image)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-30T13:16:18.308214+01:00[Europe/London]")
public class CreateImagesRequest {
  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;

  public static final String SERIALIZED_NAME_AUTO_UPDATE = "auto_update";
  @SerializedName(SERIALIZED_NAME_AUTO_UPDATE)
  private Boolean autoUpdate;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Properties3 properties;

  public static final String SERIALIZED_NAME_ALIASES = "aliases";
  @SerializedName(SERIALIZED_NAME_ALIASES)
  private List<Aliases> aliases = new ArrayList<Aliases>();

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private Source10 source;

  public static final String SERIALIZED_NAME_COMPRESSION_ALGORITHM = "compression_algorithm";
  @SerializedName(SERIALIZED_NAME_COMPRESSION_ALGORITHM)
  private String compressionAlgorithm;


  public CreateImagesRequest filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * Used for export (optional)
   * @return filename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "filename", value = "Used for export (optional)")

  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public CreateImagesRequest _public(Boolean _public) {
    
    this._public = _public;
    return this;
  }

   /**
   * Whether the image can be downloaded by untrusted users (defaults to false)
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the image can be downloaded by untrusted users (defaults to false)")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    this._public = _public;
  }


  public CreateImagesRequest autoUpdate(Boolean autoUpdate) {
    
    this.autoUpdate = autoUpdate;
    return this;
  }

   /**
   * Whether the image should be auto-updated (optional; defaults to false)
   * @return autoUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the image should be auto-updated (optional; defaults to false)")

  public Boolean getAutoUpdate() {
    return autoUpdate;
  }


  public void setAutoUpdate(Boolean autoUpdate) {
    this.autoUpdate = autoUpdate;
  }


  public CreateImagesRequest properties(Properties3 properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Properties3 getProperties() {
    return properties;
  }


  public void setProperties(Properties3 properties) {
    this.properties = properties;
  }


  public CreateImagesRequest aliases(List<Aliases> aliases) {
    
    this.aliases = aliases;
    return this;
  }

  public CreateImagesRequest addAliasesItem(Aliases aliasesItem) {
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * Set initial aliases (\&quot;image_create_aliases\&quot; API extension)
   * @return aliases
  **/
  @ApiModelProperty(required = true, value = "Set initial aliases (\"image_create_aliases\" API extension)")

  public List<Aliases> getAliases() {
    return aliases;
  }


  public void setAliases(List<Aliases> aliases) {
    this.aliases = aliases;
  }


  public CreateImagesRequest source(Source10 source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(required = true, value = "")

  public Source10 getSource() {
    return source;
  }


  public void setSource(Source10 source) {
    this.source = source;
  }


  public CreateImagesRequest compressionAlgorithm(String compressionAlgorithm) {
    
    this.compressionAlgorithm = compressionAlgorithm;
    return this;
  }

   /**
   * Override the compression algorithm for the image (optional)
   * @return compressionAlgorithm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xz", value = "Override the compression algorithm for the image (optional)")

  public String getCompressionAlgorithm() {
    return compressionAlgorithm;
  }


  public void setCompressionAlgorithm(String compressionAlgorithm) {
    this.compressionAlgorithm = compressionAlgorithm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateImagesRequest createImagesRequest = (CreateImagesRequest) o;
    return Objects.equals(this.filename, createImagesRequest.filename) &&
        Objects.equals(this._public, createImagesRequest._public) &&
        Objects.equals(this.autoUpdate, createImagesRequest.autoUpdate) &&
        Objects.equals(this.properties, createImagesRequest.properties) &&
        Objects.equals(this.aliases, createImagesRequest.aliases) &&
        Objects.equals(this.source, createImagesRequest.source) &&
        Objects.equals(this.compressionAlgorithm, createImagesRequest.compressionAlgorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, _public, autoUpdate, properties, aliases, source, compressionAlgorithm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateImagesRequest {\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    autoUpdate: ").append(toIndentedString(autoUpdate)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    compressionAlgorithm: ").append(toIndentedString(compressionAlgorithm)).append("\n");
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


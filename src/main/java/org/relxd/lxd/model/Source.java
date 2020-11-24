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
import org.relxd.lxd.model.Properties;
import org.relxd.lxd.model.Secrets;

/**
 * Source
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-24T09:07:38.931+02:00[Africa/Harare]")
public class Source {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_FINGERPRINT = "fingerprint";
  @SerializedName(SERIALIZED_NAME_FINGERPRINT)
  private String fingerprint;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Properties properties;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private String server;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private String certificate;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_BASE_IMAGE = "base-image";
  @SerializedName(SERIALIZED_NAME_BASE_IMAGE)
  private String baseImage;

  public static final String SERIALIZED_NAME_INSTANCE_ONLY = "instance_only";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ONLY)
  private Boolean instanceOnly;

  public static final String SERIALIZED_NAME_SECRETS = "secrets";
  @SerializedName(SERIALIZED_NAME_SECRETS)
  private Secrets secrets;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_LIVE = "live";
  @SerializedName(SERIALIZED_NAME_LIVE)
  private Boolean live;


  public Source type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Can be \&quot;image\&quot;, \&quot;migration\&quot;, \&quot;copy\&quot; or \&quot;none\&quot;.
   * @return type
  **/
  @ApiModelProperty(example = "image", required = true, value = "Can be \"image\", \"migration\", \"copy\" or \"none\".")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Source alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * Name of the alias.
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ubuntu/devel", value = "Name of the alias.")

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public Source fingerprint(String fingerprint) {
    
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * Fingerprint
   * @return fingerprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SHA-256", value = "Fingerprint")

  public String getFingerprint() {
    return fingerprint;
  }


  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }


  public Source properties(Properties properties) {
    
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


  public Source mode(String mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * One of \&quot;local\&quot; (default) or \&quot;pull\&quot;
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pull", value = "One of \"local\" (default) or \"pull\"")

  public String getMode() {
    return mode;
  }


  public void setMode(String mode) {
    this.mode = mode;
  }


  public Source server(String server) {
    
    this.server = server;
    return this;
  }

   /**
   * Remote server (pull mode only)
   * @return server
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://10.0.2.3:8443", value = "Remote server (pull mode only)")

  public String getServer() {
    return server;
  }


  public void setServer(String server) {
    this.server = server;
  }


  public Source protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Protocol (one of lxd or simplestreams, defaults to lxd)
   * @return protocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "lxd", value = "Protocol (one of lxd or simplestreams, defaults to lxd)")

  public String getProtocol() {
    return protocol;
  }


  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public Source certificate(String certificate) {
    
    this.certificate = certificate;
    return this;
  }

   /**
   * Optional PEM certificate. If not mentioned, system CA is used.
   * @return certificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PEM certificate", value = "Optional PEM certificate. If not mentioned, system CA is used.")

  public String getCertificate() {
    return certificate;
  }


  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  public Source secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Secret to use to retrieve the image (pull mode only).
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-secret-string", value = "Secret to use to retrieve the image (pull mode only).")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public Source operation(String operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Full URL to the remote operation (pull mode only).
   * @return operation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://10.0.2.3:8443/1.0/operations/<UUID>", value = "Full URL to the remote operation (pull mode only).")

  public String getOperation() {
    return operation;
  }


  public void setOperation(String operation) {
    this.operation = operation;
  }


  public Source baseImage(String baseImage) {
    
    this.baseImage = baseImage;
    return this;
  }

   /**
   * Optional, the base image the instance was created from
   * @return baseImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<fingerprint>", value = "Optional, the base image the instance was created from")

  public String getBaseImage() {
    return baseImage;
  }


  public void setBaseImage(String baseImage) {
    this.baseImage = baseImage;
  }


  public Source instanceOnly(Boolean instanceOnly) {
    
    this.instanceOnly = instanceOnly;
    return this;
  }

   /**
   * Whether to migrate only the instance without snapshots. Can be \&quot;true\&quot; or \&quot;false\&quot;.
   * @return instanceOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether to migrate only the instance without snapshots. Can be \"true\" or \"false\".")

  public Boolean getInstanceOnly() {
    return instanceOnly;
  }


  public void setInstanceOnly(Boolean instanceOnly) {
    this.instanceOnly = instanceOnly;
  }


  public Source secrets(Secrets secrets) {
    
    this.secrets = secrets;
    return this;
  }

   /**
   * Get secrets
   * @return secrets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Secrets getSecrets() {
    return secrets;
  }


  public void setSecrets(Secrets secrets) {
    this.secrets = secrets;
  }


  public Source source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Name of the source instance
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-old-instance", value = "Name of the source instance")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public Source live(Boolean live) {
    
    this.live = live;
    return this;
  }

   /**
   * Whether migration is performed live
   * @return live
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether migration is performed live")

  public Boolean getLive() {
    return live;
  }


  public void setLive(Boolean live) {
    this.live = live;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Source source = (Source) o;
    return Objects.equals(this.type, source.type) &&
        Objects.equals(this.alias, source.alias) &&
        Objects.equals(this.fingerprint, source.fingerprint) &&
        Objects.equals(this.properties, source.properties) &&
        Objects.equals(this.mode, source.mode) &&
        Objects.equals(this.server, source.server) &&
        Objects.equals(this.protocol, source.protocol) &&
        Objects.equals(this.certificate, source.certificate) &&
        Objects.equals(this.secret, source.secret) &&
        Objects.equals(this.operation, source.operation) &&
        Objects.equals(this.baseImage, source.baseImage) &&
        Objects.equals(this.instanceOnly, source.instanceOnly) &&
        Objects.equals(this.secrets, source.secrets) &&
        Objects.equals(this.source, source.source) &&
        Objects.equals(this.live, source.live);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, alias, fingerprint, properties, mode, server, protocol, certificate, secret, operation, baseImage, instanceOnly, secrets, source, live);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Source {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    baseImage: ").append(toIndentedString(baseImage)).append("\n");
    sb.append("    instanceOnly: ").append(toIndentedString(instanceOnly)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    live: ").append(toIndentedString(live)).append("\n");
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


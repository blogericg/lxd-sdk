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
 * CreateCertificatesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-23T12:53:01.261363+02:00[Africa/Harare]")
public class CreateCertificatesRequest {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private String certificate;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;


  public CreateCertificatesRequest type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Certificate type (keyring), currently only client
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "client", value = "Certificate type (keyring), currently only client")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CreateCertificatesRequest certificate(String certificate) {
    
    this.certificate = certificate;
    return this;
  }

   /**
   * If provided, a valid x509 certificate. If not, the client certificate of the connection will be used
   * @return certificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PEM certificate", value = "If provided, a valid x509 certificate. If not, the client certificate of the connection will be used")

  public String getCertificate() {
    return certificate;
  }


  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  public CreateCertificatesRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * An optional name for the certificate. If nothing is provided, the host in the TLS header for the request is used.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "foo", value = "An optional name for the certificate. If nothing is provided, the host in the TLS header for the request is used.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateCertificatesRequest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The trust password for that server (only required if untrusted)
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "server-trust-password", value = "The trust password for that server (only required if untrusted)")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCertificatesRequest createCertificatesRequest = (CreateCertificatesRequest) o;
    return Objects.equals(this.type, createCertificatesRequest.type) &&
        Objects.equals(this.certificate, createCertificatesRequest.certificate) &&
        Objects.equals(this.name, createCertificatesRequest.name) &&
        Objects.equals(this.password, createCertificatesRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, certificate, name, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCertificatesRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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


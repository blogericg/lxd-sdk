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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * CreateInstancesRequestConfigValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-23T13:37:46.576+02:00[Africa/Harare]")
public class CreateInstancesRequestConfigValue {
  public static final String SERIALIZED_NAME_CONFIG_VALUE_TO_SET = "configValueToSet";
  @SerializedName(SERIALIZED_NAME_CONFIG_VALUE_TO_SET)
  private Object configValueToSet;


  public CreateInstancesRequestConfigValue configValueToSet(Object configValueToSet) {
    
    this.configValueToSet = configValueToSet;
    return this;
  }

   /**
   * The config value to set
   * @return configValueToSet
  **/
  @ApiModelProperty(example = "2", required = true, value = "The config value to set")

  public Object getConfigValueToSet() {
    return configValueToSet;
  }


  public void setConfigValueToSet(Object configValueToSet) {
    this.configValueToSet = configValueToSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstancesRequestConfigValue createInstancesRequestConfigValue = (CreateInstancesRequestConfigValue) o;
    return Objects.equals(this.configValueToSet, createInstancesRequestConfigValue.configValueToSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configValueToSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstancesRequestConfigValue {\n");
    sb.append("    configValueToSet: ").append(toIndentedString(configValueToSet)).append("\n");
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


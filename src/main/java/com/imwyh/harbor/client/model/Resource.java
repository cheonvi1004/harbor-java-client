/*
 * Harbor API
 * These APIs provide services for manipulating Harbor project.
 *
 * OpenAPI spec version: 1.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.imwyh.harbor.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.imwyh.harbor.client.model.RepPolicy;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Resource
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T14:29:11.153+08:00[Asia/Shanghai]")public class Resource {

  @SerializedName("replication_policies")
  private List<RepPolicy> replicationPolicies = null;
  public Resource replicationPolicies(List<RepPolicy> replicationPolicies) {
    this.replicationPolicies = replicationPolicies;
    return this;
  }

  public Resource addReplicationPoliciesItem(RepPolicy replicationPoliciesItem) {
    if (this.replicationPolicies == null) {
      this.replicationPolicies = new ArrayList<RepPolicy>();
    }
    this.replicationPolicies.add(replicationPoliciesItem);
    return this;
  }

  /**
  * The replication policy list.
  * @return replicationPolicies
  **/
  @Schema(description = "The replication policy list.")
  public List<RepPolicy> getReplicationPolicies() {
    return replicationPolicies;
  }
  public void setReplicationPolicies(List<RepPolicy> replicationPolicies) {
    this.replicationPolicies = replicationPolicies;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource resource = (Resource) o;
    return Objects.equals(this.replicationPolicies, resource.replicationPolicies);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(replicationPolicies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    
    sb.append("    replicationPolicies: ").append(toIndentedString(replicationPolicies)).append("\n");
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

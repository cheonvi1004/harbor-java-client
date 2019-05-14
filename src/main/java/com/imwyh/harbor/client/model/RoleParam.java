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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RoleParam
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T14:29:11.153+08:00[Asia/Shanghai]")public class RoleParam {

  @SerializedName("roles")
  private List<Integer> roles = null;

  @SerializedName("username")
  private String username = null;
  public RoleParam roles(List<Integer> roles) {
    this.roles = roles;
    return this;
  }

  public RoleParam addRolesItem(Integer rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<Integer>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
  * Role ID for updating project role member.
  * @return roles
  **/
  @Schema(description = "Role ID for updating project role member.")
  public List<Integer> getRoles() {
    return roles;
  }
  public void setRoles(List<Integer> roles) {
    this.roles = roles;
  }
  public RoleParam username(String username) {
    this.username = username;
    return this;
  }

  

  /**
  * Username relevant to a project role member.
  * @return username
  **/
  @Schema(description = "Username relevant to a project role member.")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleParam roleParam = (RoleParam) o;
    return Objects.equals(this.roles, roleParam.roles) &&
        Objects.equals(this.username, roleParam.username);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(roles, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleParam {\n");
    
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
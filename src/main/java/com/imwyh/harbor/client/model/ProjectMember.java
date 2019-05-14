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
import com.imwyh.harbor.client.model.UserEntity;
import com.imwyh.harbor.client.model.UserGroup;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * ProjectMember
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T14:29:11.153+08:00[Asia/Shanghai]")public class ProjectMember {

  @SerializedName("role_id")
  private Integer roleId = null;

  @SerializedName("member_user")
  private UserEntity memberUser = null;

  @SerializedName("member_group")
  private UserGroup memberGroup = null;
  public ProjectMember roleId(Integer roleId) {
    this.roleId = roleId;
    return this;
  }

  

  /**
  * The role id 1 for projectAdmin, 2 for developer, 3 for guest
  * @return roleId
  **/
  @Schema(description = "The role id 1 for projectAdmin, 2 for developer, 3 for guest")
  public Integer getRoleId() {
    return roleId;
  }
  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }
  public ProjectMember memberUser(UserEntity memberUser) {
    this.memberUser = memberUser;
    return this;
  }

  

  /**
  * Get memberUser
  * @return memberUser
  **/
  @Schema(description = "")
  public UserEntity getMemberUser() {
    return memberUser;
  }
  public void setMemberUser(UserEntity memberUser) {
    this.memberUser = memberUser;
  }
  public ProjectMember memberGroup(UserGroup memberGroup) {
    this.memberGroup = memberGroup;
    return this;
  }

  

  /**
  * Get memberGroup
  * @return memberGroup
  **/
  @Schema(description = "")
  public UserGroup getMemberGroup() {
    return memberGroup;
  }
  public void setMemberGroup(UserGroup memberGroup) {
    this.memberGroup = memberGroup;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectMember projectMember = (ProjectMember) o;
    return Objects.equals(this.roleId, projectMember.roleId) &&
        Objects.equals(this.memberUser, projectMember.memberUser) &&
        Objects.equals(this.memberGroup, projectMember.memberGroup);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(roleId, memberUser, memberGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectMember {\n");
    
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    memberUser: ").append(toIndentedString(memberUser)).append("\n");
    sb.append("    memberGroup: ").append(toIndentedString(memberGroup)).append("\n");
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
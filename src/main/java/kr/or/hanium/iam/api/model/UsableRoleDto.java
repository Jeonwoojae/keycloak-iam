package kr.or.hanium.iam.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kr.or.hanium.iam.api.model.TenantDto;
import kr.or.hanium.iam.tenant.repository.entity.UsableRole;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UsableRoleDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class UsableRoleDto   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("roleName")
  private String roleName;

  @JsonProperty("tenant")
  private TenantDto tenant;

  @JsonProperty("createdAt")
  private String createdAt;

  @JsonProperty("updatedAt")
  private String updatedAt;

  public UsableRoleDto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UsableRoleDto roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Get roleName
   * @return roleName
   */
  @ApiModelProperty(example = "student", required = true, value = "")
  @NotNull


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public UsableRoleDto tenant(TenantDto tenant) {
    this.tenant = tenant;
    return this;
  }

  /**
   * Get tenant
   * @return tenant
   */
  @ApiModelProperty(value = "")

  @Valid

  public TenantDto getTenant() {
    return tenant;
  }

  public void setTenant(TenantDto tenant) {
    this.tenant = tenant;
  }

  public UsableRoleDto createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Role register date/time
   * @return createdAt
   */
  @ApiModelProperty(example = "2022-07-28T05:01:43+09:00", value = "Role register date/time")


  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public UsableRoleDto updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Role update date/time
   * @return updatedAt
   */
  @ApiModelProperty(example = "2022-07-28T05:01:43+09:00", value = "Role update date/time")


  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsableRoleDto usableRoleDto = (UsableRoleDto) o;
    return Objects.equals(this.id, usableRoleDto.id) &&
            Objects.equals(this.roleName, usableRoleDto.roleName) &&
            Objects.equals(this.tenant, usableRoleDto.tenant) &&
            Objects.equals(this.createdAt, usableRoleDto.createdAt) &&
            Objects.equals(this.updatedAt, usableRoleDto.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, roleName, tenant, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsableRoleDto {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public UsableRole dtotoEntity(){
    UsableRole usableRole = new UsableRole();
    usableRole.builder()
            .id(this.id.longValue())
            .roleName(this.roleName)
            .tenant(this.tenant.dtotoEntity())
            .build();
    return usableRole;
  }
}


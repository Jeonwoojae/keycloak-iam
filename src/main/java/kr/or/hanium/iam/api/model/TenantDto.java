package kr.or.hanium.iam.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import kr.or.hanium.iam.tenant.repository.entity.Tenant;
import kr.or.hanium.iam.tenant.repository.entity.UsableRole;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TenantDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TenantDto   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("tenantName")
  private String tenantName;

  @JsonProperty("usableRole")
  @Valid
  private List<UsableRoleDto> usableRole = null;

  @JsonProperty("creaetedAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creaetedAt;

  @JsonProperty("updatedAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public TenantDto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @ApiModelProperty(example = "1", required = true, value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TenantDto tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  /**
   * Get tenantName
   * @return tenantName
   */
  @ApiModelProperty(example = "hanium 2022", required = true, value = "")
  @NotNull


  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public TenantDto usableRole(List<UsableRoleDto> usableRole) {
    this.usableRole = usableRole;
    return this;
  }

  public TenantDto addUsableRoleItem(UsableRoleDto usableRoleItem) {
    if (this.usableRole == null) {
      this.usableRole = new ArrayList<>();
    }
    this.usableRole.add(usableRoleItem);
    return this;
  }

  /**
   * Get usableRole
   *
   * @return usableRole
   */
  @ApiModelProperty(value = "")

  public List<UsableRoleDto> getUsableRole() {
    return this.usableRole;
  }

  public void setUsableRole(List<UsableRoleDto> usableRole) {
    this.usableRole = usableRole;
  }

  public TenantDto creaetedAt(OffsetDateTime creaetedAt) {
    this.creaetedAt = creaetedAt;
    return this;
  }

  /**
   * Tenant register date/time
   * @return creaetedAt
   */
  @ApiModelProperty(example = "2022-07-28T05:01:43+09:00", value = "Tenant register date/time")

  @Valid

  public OffsetDateTime getCreaetedAt() {
    return creaetedAt;
  }

  public void setCreaetedAt(OffsetDateTime creaetedAt) {
    this.creaetedAt = creaetedAt;
  }

  public TenantDto updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Tenant update date/time
   * @return updatedAt
   */
  @ApiModelProperty(example = "2022-07-28T05:01:43+09:00", value = "Tenant update date/time")

  @Valid

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
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
    TenantDto tenantDto = (TenantDto) o;
    return Objects.equals(this.id, tenantDto.id) &&
            Objects.equals(this.tenantName, tenantDto.tenantName) &&
            Objects.equals(this.usableRole, tenantDto.usableRole) &&
            Objects.equals(this.creaetedAt, tenantDto.creaetedAt) &&
            Objects.equals(this.updatedAt, tenantDto.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantName, usableRole, creaetedAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantDto {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    usableRole: ").append(toIndentedString(usableRole)).append("\n");
    sb.append("    creaetedAt: ").append(toIndentedString(creaetedAt)).append("\n");
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

  public Tenant dtotoEntity(){
    Tenant tenant = new Tenant();

    List<UsableRole> temp = null;
    this.usableRole.forEach(s -> temp.add(s.dtotoEntity()));
    tenant.builder()
            .id(this.id.longValue())
            .tenantName(this.getTenantName())
            .usableRoles(temp)
            .build();
    return tenant;
  }
}


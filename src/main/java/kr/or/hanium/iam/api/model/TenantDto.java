package kr.or.hanium.iam.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TenantDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TenantDto   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("regdate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime regdate;

  @JsonProperty("update")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime update;

  public TenantDto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TenantDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "hanium 2022", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TenantDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(example = "for student", value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TenantDto regdate(OffsetDateTime regdate) {
    this.regdate = regdate;
    return this;
  }

  /**
   * Tenant register date/time
   * @return regdate
  */
  @ApiModelProperty(example = "2022-07-28T05:01:43+09:00", value = "Tenant register date/time")

  @Valid

  public OffsetDateTime getRegdate() {
    return regdate;
  }

  public void setRegdate(OffsetDateTime regdate) {
    this.regdate = regdate;
  }

  public TenantDto update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

  /**
   * Tenant update date/time
   * @return update
  */
  @ApiModelProperty(example = "2022-07-28T05:01:43+09:00", value = "Tenant update date/time")

  @Valid

  public OffsetDateTime getUpdate() {
    return update;
  }

  public void setUpdate(OffsetDateTime update) {
    this.update = update;
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
        Objects.equals(this.name, tenantDto.name) &&
        Objects.equals(this.description, tenantDto.description) &&
        Objects.equals(this.regdate, tenantDto.regdate) &&
        Objects.equals(this.update, tenantDto.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, regdate, update);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    regdate: ").append(toIndentedString(regdate)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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
}


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
 * GroupDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class GroupDto   {
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

  public GroupDto id(Integer id) {
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

  public GroupDto name(String name) {
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

  public GroupDto description(String description) {
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

  public GroupDto regdate(OffsetDateTime regdate) {
    this.regdate = regdate;
    return this;
  }

  /**
   * Group register date/time
   * @return regdate
  */
  @ApiModelProperty(example = "2022-07-28T05:01:43+09:00", value = "Group register date/time")

  @Valid

  public OffsetDateTime getRegdate() {
    return regdate;
  }

  public void setRegdate(OffsetDateTime regdate) {
    this.regdate = regdate;
  }

  public GroupDto update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

  /**
   * Group update date/time
   * @return update
  */
  @ApiModelProperty(example = "2022-07-28T05:01:43+09:00", value = "Group update date/time")

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
    GroupDto groupDto = (GroupDto) o;
    return Objects.equals(this.id, groupDto.id) &&
        Objects.equals(this.name, groupDto.name) &&
        Objects.equals(this.description, groupDto.description) &&
        Objects.equals(this.regdate, groupDto.regdate) &&
        Objects.equals(this.update, groupDto.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, regdate, update);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupDto {\n");
    
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


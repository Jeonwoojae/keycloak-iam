package kr.or.hanium.iam.group.dto;

import kr.or.hanium.iam.group.repository.entity.Group;

import java.time.LocalDateTime;


public class GroupListResponseDto {

    private Long id;
    private String groupName;

    public GroupListResponseDto(Group entity){
        this.id = entity.getId();
        this.groupName = entity.getGroupName();
    }
}

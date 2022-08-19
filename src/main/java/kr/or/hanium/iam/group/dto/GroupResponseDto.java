package kr.or.hanium.iam.group.dto;

import kr.or.hanium.iam.group.repository.entity.Group;
import kr.or.hanium.iam.group.repository.entity.Role;
import kr.or.hanium.iam.user.repository.entity.User;
import lombok.Getter;

import java.util.List;

@Getter
public class GroupResponseDto {
    private Long id;
    private String groupName;
    private List<Role> roles;
    private List<User> users;

    public GroupResponseDto(Group entity){
        this.id = entity.getId();
        this.groupName= entity.getGroupName();
        this.roles=entity.getRoles();
        this.users=entity.getUsers();

    }

}

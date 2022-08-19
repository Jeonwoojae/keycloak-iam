package kr.or.hanium.iam.group.dto;


import kr.or.hanium.iam.group.repository.entity.Group;
import kr.or.hanium.iam.group.repository.entity.Role;
import kr.or.hanium.iam.user.repository.entity.User;
import lombok.*;

import java.util.List;

@Getter
@NoArgsConstructor
public class GroupCreateDto {

    private String groupName;
    private List<Role> roles;
    private List<User> users;


    @Builder
    public GroupCreateDto(String groupName,List<Role> roles,List<User> users ){
        this.groupName=groupName;
        this.roles=roles;
        this.users=users;
    }

    public Group toEntity(){
        return Group.builder()
                .groupName(groupName)
                .roles(roles)
                .users(users)
                .build();
    }

}

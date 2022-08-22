package kr.or.hanium.iam.user.dto;

import kr.or.hanium.iam.group.repository.entity.Group;
import kr.or.hanium.iam.user.repository.entity.User;
import lombok.Builder;

public class UserCreateDto {
    private String userName;
    private Group group;

    @Builder
    public UserCreateDto(String userName,Group group ){
        this.userName=userName;
        this.group=group;
    }

    public User toEntity() {
        return User.builder()
                .userName(userName)
                .group(group)
                .build();
    }
}

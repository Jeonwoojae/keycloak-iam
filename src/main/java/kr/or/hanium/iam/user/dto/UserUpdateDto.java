package kr.or.hanium.iam.user.dto;

import kr.or.hanium.iam.group.repository.entity.Group;
import lombok.Getter;

@Getter
public class UserUpdateDto {
    private Long id;
    private String userName;

}

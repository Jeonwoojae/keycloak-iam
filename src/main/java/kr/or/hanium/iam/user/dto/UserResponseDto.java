package kr.or.hanium.iam.user.dto;

import kr.or.hanium.iam.group.repository.entity.Group;
import kr.or.hanium.iam.user.repository.entity.User;
import lombok.Getter;

@Getter
public class UserResponseDto {

        private Long id;
        private String userName;
        private Group group;

        public UserResponseDto(User entity){
            this.id = entity.getId();
            this.userName= entity.getUserName();
            this.group = entity.getGroup();
        }
    }

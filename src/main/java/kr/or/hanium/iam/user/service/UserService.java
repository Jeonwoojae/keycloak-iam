package kr.or.hanium.iam.user.service;

import kr.or.hanium.iam.user.dto.UserCreateDto;
import kr.or.hanium.iam.user.dto.UserResponseDto;
import kr.or.hanium.iam.user.dto.UserUpdateDto;
import kr.or.hanium.iam.user.repository.entity.User;

public interface UserService {

    // 사용자 생성
    public Long create(UserCreateDto userCreateDto);

    // id를 통한 get
    public User getById(Long id);

    // 사용자 정보 수정
    public Long update(UserUpdateDto userUpdateDto);

    // 사용자 삭제
    public Long delete(Long id);

}

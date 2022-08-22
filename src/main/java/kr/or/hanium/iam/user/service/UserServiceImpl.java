package kr.or.hanium.iam.user.service;

import kr.or.hanium.iam.user.dto.UserCreateDto;
import kr.or.hanium.iam.user.dto.UserResponseDto;
import kr.or.hanium.iam.user.dto.UserUpdateDto;
import kr.or.hanium.iam.user.repository.UserRepository;
import kr.or.hanium.iam.user.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Transactional
    public Long create(UserCreateDto userCreateDto) {
        return userRepository.save(userCreateDto.toEntity()).getId();
    }

    @Transactional
    public User getById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 사용자입니다."));
    }

    @Transactional
    public Long update(UserUpdateDto userUpdateDto) {
        User user = userRepository.findById(userUpdateDto.getId()).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 사용자입니다."));
        user.update(userUpdateDto.getUserName());
        return user.getId();
    }

    @Transactional
        public Long delete(Long id){
            User user = userRepository.findById(id)
                    .orElseThrow(()->new IllegalArgumentException("존재하지 않는 사용자입니다."));

            userRepository.delete(user);
            return id;
        }

    }

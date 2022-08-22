package kr.or.hanium.iam.user.controller;


import kr.or.hanium.iam.user.dto.UserCreateDto;
import kr.or.hanium.iam.user.dto.UserUpdateDto;
import kr.or.hanium.iam.user.repository.entity.User;
import kr.or.hanium.iam.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("")
    public Long save(@RequestBody UserCreateDto userCreateDto) {
        return userService.create(userCreateDto);
    }

    @GetMapping("/{id}")
    public User getOne(@RequestParam Long id) {
        return userService.getById(id);
    }

    @PutMapping("")
    public Long update(@RequestBody UserUpdateDto userUpdateDto) {
        return userService.update(userUpdateDto);
    }

    @DeleteMapping("/{id}")
    public Long delete(@RequestParam Long id) {
        return userService.delete(id);
    }
}

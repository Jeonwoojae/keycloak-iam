package kr.or.hanium.iam.group.controller;



import kr.or.hanium.iam.group.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GroupController {
    private final GroupService groupService;


}

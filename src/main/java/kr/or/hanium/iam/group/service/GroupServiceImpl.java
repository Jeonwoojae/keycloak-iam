package kr.or.hanium.iam.group.service;


import kr.or.hanium.iam.group.dto.GroupCreateDto;
import kr.or.hanium.iam.group.dto.GroupListResponseDto;
import kr.or.hanium.iam.group.dto.GroupResponseDto;
import kr.or.hanium.iam.group.repository.entity.Group;
import kr.or.hanium.iam.group.repository.entity.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class GroupServiceImpl implements GroupService {
    private final GroupRepository groupRepository;


    @Transactional
    public Long create(GroupCreateDto requestDto){
        return groupRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public GroupResponseDto searchById(long id){
        Group group = groupRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 그룹은 존재하지 않습니다."));

        return new GroupResponseDto(group);
    }

    @Transactional(readOnly = true)
    public List<GroupListResponseDto> searchAllDesc(){
        return groupRepository.findAllByOrderByIdDesc().stream()
                .map(GroupListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public void delete(Long id){
        Group group = groupRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 그룹이 존재하지 않습니다."));

        groupRepository.delete(group);
    }

}

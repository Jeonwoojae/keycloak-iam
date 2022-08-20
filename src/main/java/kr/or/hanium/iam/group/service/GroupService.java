package kr.or.hanium.iam.group.service;

import kr.or.hanium.iam.group.dto.GroupCreateDto;
import kr.or.hanium.iam.group.dto.GroupListResponseDto;
import kr.or.hanium.iam.group.dto.GroupResponseDto;

import java.util.List;

public interface GroupService {

    //그룹 생성
    public Long create(GroupCreateDto requestDto);
    //ID로 그룹 서칭
    public GroupResponseDto searchById(long id);
    //그룹 전체 리스트로 조회
    public List<GroupListResponseDto> searchAllDesc();
    //그룹 삭제
    public void delete(Long id);


}

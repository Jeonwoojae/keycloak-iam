package kr.or.hanium.iam.group.repository.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface GroupRepository extends JpaRepository<Group,Long> {
    List<Group> findAllByOrderByIdDesc();
    //SELECT * FROM `Group` ORDER BY `id` DESC;
}


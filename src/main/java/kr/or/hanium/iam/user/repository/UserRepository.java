package kr.or.hanium.iam.user.repository;

import kr.or.hanium.iam.user.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

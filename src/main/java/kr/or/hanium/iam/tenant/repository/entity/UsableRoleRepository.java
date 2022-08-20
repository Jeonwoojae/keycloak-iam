package kr.or.hanium.iam.tenant.repository.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsableRoleRepository extends JpaRepository<UsableRole, Long> {
}

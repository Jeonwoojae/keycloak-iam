package kr.or.hanium.iam.tenant.repository.entity;

import kr.or.hanium.iam.tenant.repository.entity.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Long> {
}

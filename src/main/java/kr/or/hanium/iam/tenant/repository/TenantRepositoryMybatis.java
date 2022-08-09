package kr.or.hanium.iam.tenant.repository;

import java.util.List;

import kr.or.hanium.iam.tenant.repository.entity.TenantEntity;

public interface TenantRepositoryMybatis {
	List<TenantEntity> getTenantList();
	TenantEntity getTenant(int id);
	int postTenant(TenantEntity tenantEntity);
	int putTenant(TenantEntity tenantEntity);
	int deleteTenant(TenantEntity tenantEntity);
}

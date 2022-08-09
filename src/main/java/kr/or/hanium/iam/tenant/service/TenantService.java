package kr.or.hanium.iam.tenant.service;

import java.util.List;

import kr.or.hanium.iam.tenant.service.vo.TenantVo;

public interface TenantService {
	List<TenantVo> getTenantList();
	TenantVo getTenant(Integer id);  
	int postTenant(TenantVo newTenantVo);
	int putTenant(TenantVo tenantVo);
	int deleteTenant(TenantVo tenantVo);
}

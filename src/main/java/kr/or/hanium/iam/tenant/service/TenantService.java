package kr.or.hanium.iam.tenant.service;

import kr.or.hanium.iam.api.model.TenantDto;
import kr.or.hanium.iam.tenant.repository.entity.Tenant;
import kr.or.hanium.iam.tenant.repository.entity.TenantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TenantService {
    List<TenantDto> getTenantList();
    TenantDto getTenant(Long id);
    int postTenant(Tenant newTenant);
    int putTenant(Tenant tenant);
    int deleteTenant(Long id);



}

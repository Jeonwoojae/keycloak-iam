package com.hoony.msa;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import kr.or.hanium.iam.tenant.repository.TenantRepositoryMybatis;
import kr.or.hanium.iam.tenant.repository.entity.TenantEntity;
import kr.or.hanium.iam.tenant.service.TenantService;
import kr.or.hanium.iam.tenant.service.TenantServiceImpl;
import kr.or.hanium.iam.tenant.service.vo.TenantVo;

@ExtendWith(MockitoExtension.class)
public class TenantServiceTests {
	
	@Mock
	private TenantRepositoryMybatis tenantRepositoryMybatis;
    
	@Test
    public void test_getTenantList() {
    	
		List<TenantEntity> list = new ArrayList<>();
		TenantEntity tenantEntity = new TenantEntity();
		tenantEntity.setId(1);
		tenantEntity.setName("tenant1");
		tenantEntity.setDescription("tenant1 desc");
		list.add(tenantEntity);

		tenantEntity = new TenantEntity();
		tenantEntity.setId(2);
		tenantEntity.setName("tenant2");
		tenantEntity.setDescription("tenant2 desc");
		list.add(tenantEntity);

        when(tenantRepositoryMybatis.getTenantList()).thenReturn(list);
        
        TenantService tenantService = new TenantServiceImpl(tenantRepositoryMybatis);

        List<TenantVo> tenantList = tenantService.getTenantList();
        assertThat(tenantList).extracting("id", "name").contains(
                tuple(1, "tenant1"),
                tuple(2, "tenant2")
                );
    }
}

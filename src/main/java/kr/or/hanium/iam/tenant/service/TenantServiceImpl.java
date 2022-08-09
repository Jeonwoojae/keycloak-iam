package kr.or.hanium.iam.tenant.service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kr.or.hanium.iam.tenant.repository.TenantRepositoryMybatis;
import kr.or.hanium.iam.tenant.repository.entity.TenantEntity;
import kr.or.hanium.iam.tenant.service.vo.TenantVo;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TenantServiceImpl implements TenantService {

	private final TenantRepositoryMybatis tenantRepositoryMybatis;
	
	public TenantServiceImpl(TenantRepositoryMybatis tenantRepositoryMybatis) {
		this.tenantRepositoryMybatis = tenantRepositoryMybatis;
	}
	
	
	@Override
	public List<TenantVo> getTenantList() {
		List<TenantVo> list = new ArrayList<TenantVo>();
		
		for(TenantEntity tenantEntity: tenantRepositoryMybatis.getTenantList()) {
			TenantVo tenantVO = new TenantVo();
			tenantVO.setId(tenantEntity.getId());
			tenantVO.setName(tenantEntity.getName());
			tenantVO.setDescription(tenantEntity.getDescription());
			tenantVO.setRegdate(tenantEntity.getRegdate());
			tenantVO.setUpdate(tenantEntity.getUpdate());
			list.add(tenantVO);
		}
		
		return list;
	}

	@Override
	public TenantVo getTenant(Integer id) {
		TenantEntity tenantEntity = tenantRepositoryMybatis.getTenant(id);
		
		TenantVo tenantVO = new TenantVo();
		tenantVO.setId(tenantEntity.getId());
		tenantVO.setName(tenantEntity.getName());
		tenantVO.setDescription(tenantEntity.getDescription());
		tenantVO.setRegdate(tenantEntity.getRegdate());
		tenantVO.setUpdate(tenantEntity.getUpdate());
		return tenantVO;
	}
	
	@Override
	public int postTenant(TenantVo tenantVo) {
		tenantVo.setRegdate(OffsetDateTime.now());
		tenantVo.setUpdate(OffsetDateTime.now());
        
		TenantEntity tenantEntity = new TenantEntity();
		tenantEntity.setName(tenantVo.getName());
		tenantEntity.setDescription(tenantVo.getDescription());
		tenantEntity.setRegdate(tenantVo.getRegdate());
		tenantEntity.setUpdate(tenantVo.getUpdate());
        
		return tenantRepositoryMybatis.postTenant(tenantEntity);
	}


	@Override
	public int putTenant(TenantVo tenantVo) {
		tenantVo.setRegdate(OffsetDateTime.now());
		tenantVo.setUpdate(OffsetDateTime.now());
        
		TenantEntity tenantEntity = new TenantEntity();
		tenantEntity.setName(tenantVo.getName());
		tenantEntity.setDescription(tenantVo.getDescription());
		tenantEntity.setRegdate(tenantVo.getRegdate());
		tenantEntity.setUpdate(tenantVo.getUpdate());
		
		return tenantRepositoryMybatis.putTenant(tenantEntity);
	}


	@Override
	public int deleteTenant(TenantVo tenantVo) {
		TenantEntity tenantEntity = new TenantEntity();
		tenantEntity.setId(tenantVo.getId());
		
		return tenantRepositoryMybatis.deleteTenant(tenantEntity);
	}

}

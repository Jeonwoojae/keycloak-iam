//package kr.or.hanium.iam.tenant.service;
//
//import java.time.OffsetDateTime;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import kr.or.hanium.iam.api.model.TenantDto;
//import kr.or.hanium.iam.tenant.repository.entity.Tenant;
//import org.springframework.stereotype.Service;
//
//import kr.or.hanium.iam.tenant.repository.entity.TenantRepository;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//@Transactional
//public class TenantServiceImpl implements TenantService {
//
//	private final TenantRepository tenantRepository;
//
//	public TenantServiceImpl(TenantRepository tenantRepository) {
//		this.tenantRepository = tenantRepository;
//	}
//
//
//	@Override
//	public List<Tenant> getTenantList() {
//		List<Tenant> list = new ArrayList<Tenant>();
//
//		for(Tenant tenantEntity: tenantRepository.findAll()) {
//			Tenant tenantVO = new Tenant();
//			tenantVO.builder()
//					.id(tenantEntity.getId())
//					.tenantName(tenantEntity.getTenantName())
//					.usableRoles(tenantEntity.getUsableRoles())
//					.build();
//			list.add(tenantVO);
//		}
//
//		return list;
//	}
//
//	@Override
//	public TenantDto getTenant(Long id) {
//		Tenant tenantVo = tenantRepository.findById(id).get();
//		TenantDto.
//	.(tenantEntity.get());
//		tenantVO.setName(tenantEntity.getTenantName());
//		tenantVO.setDescription(tenantEntity.getUsableRoles());
//		tenantVO.setRegdate(tenantEntity.getRegdate());
//		tenantVO.setUpdate(tenantEntity.getUpdate());
//		return tenantVO;
//	}
//
//	@Override
//	public int postTenant(TenantVo tenantVo) {
//		tenantVo.setRegdate(OffsetDateTime.now());
//		tenantVo.setUpdate(OffsetDateTime.now());
//
//		TenantEntity tenantEntity = new TenantEntity();
//		tenantEntity.setName(tenantVo.getName());
//		tenantEntity.setDescription(tenantVo.getDescription());
//		tenantEntity.setRegdate(tenantVo.getRegdate());
//		tenantEntity.setUpdate(tenantVo.getUpdate());
//
//		return tenantRepository.postTenant(tenantEntity);
//	}
//
//
//	@Override
//	public int putTenant(Tenant tenantVo) {
//		tenantVo.setRegdate(OffsetDateTime.now());
//		tenantVo.setUpdate(OffsetDateTime.now());
//
//		TenantEntity tenantEntity = new TenantEntity();
//		tenantEntity.setName(tenantVo.getName());
//		tenantEntity.setDescription(tenantVo.getDescription());
//		tenantEntity.setRegdate(tenantVo.getRegdate());
//		tenantEntity.setUpdate(tenantVo.getUpdate());
//
//		return tenantRepository.putTenant(tenantEntity);
//	}
//
//
//	@Override
//	public int deleteTenant(Long id) {
//		tenantRepository.delete(tenantRepository.findById(id).get());
//		return 0;
//	}
//
//}

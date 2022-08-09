package kr.or.hanium.iam.tenant.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;



import io.swagger.annotations.Api;
import kr.or.hanium.iam.api.TenantApi;
import kr.or.hanium.iam.api.model.TenantDto;
import kr.or.hanium.iam.tenant.service.TenantService;
import kr.or.hanium.iam.tenant.service.vo.TenantVo;

@Controller
@Api(tags = "tenant")
public class TenantController implements TenantApi {
	
	private final TenantService tenantService;
	
	public TenantController(TenantService tenantService) {
		this.tenantService = tenantService;
	}
	
	@Override
	public ResponseEntity<List<TenantDto>> getTenantList() {
		List<TenantDto> list = new ArrayList<>();
		for(TenantVo tenantVO : tenantService.getTenantList()) {
			TenantDto tenantDto = new TenantDto();
			tenantDto.setId(tenantVO.getId());
			tenantDto.setName(tenantVO.getName());
			tenantDto.setDescription(tenantVO.getDescription());
			
			list.add(tenantDto);
		}
		return ResponseEntity.ok().body(list);
	}
	
	@Override
	public ResponseEntity<TenantDto> getTenant(Integer id) {
		TenantVo tenantVO = tenantService.getTenant(id);
		
		TenantDto tenantDto = new TenantDto();
		tenantDto.setId(tenantVO.getId());
		tenantDto.setName(tenantVO.getName());
		tenantDto.setDescription(tenantVO.getDescription());
		
		return ResponseEntity.ok().body(tenantDto);
	}
	
	@Override
	public ResponseEntity<TenantDto> postTenant(@Valid TenantDto tenantDto) {
		
		TenantVo tenantVo = new TenantVo();
		tenantVo.setName(tenantDto.getName());
		tenantVo.setDescription(tenantDto.getDescription());
		
		tenantService.postTenant(tenantVo);
		
        return ResponseEntity.status(HttpStatus.CREATED).body(tenantDto);
	}

	@Override
	public ResponseEntity<TenantDto> putTenant(Integer id, @Valid TenantDto tenantDto) {
		TenantVo tenantVo = new TenantVo();
		tenantVo.setName(tenantDto.getName());
		tenantVo.setDescription(tenantDto.getDescription());
		
		tenantService.putTenant(tenantVo);
		return ResponseEntity.ok().body(tenantDto);
	}

	@Override
	public ResponseEntity<TenantDto> deleteTenant(Integer id) {
		TenantVo tenantVo = new TenantVo();
		tenantVo.setId(id);
		
		tenantService.deleteTenant(tenantVo);
		
		TenantDto tenantDto = new TenantDto();
		tenantDto.setId(tenantVo.getId());
		
		return ResponseEntity.ok().body(tenantDto);
	}
}

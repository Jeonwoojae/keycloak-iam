package kr.or.hanium.iam.tenant.controller;

import io.swagger.annotations.Api;
import kr.or.hanium.iam.api.TenantApi;
import kr.or.hanium.iam.api.model.TenantDto;
import kr.or.hanium.iam.api.model.UsableRoleDto;
import kr.or.hanium.iam.tenant.repository.entity.Tenant;
import kr.or.hanium.iam.tenant.repository.entity.TenantRepository;
import kr.or.hanium.iam.tenant.repository.entity.UsableRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@Api(tags = "tenant")
public class TenantController implements TenantApi{

    private final TenantRepository tenantRepository;

    public  TenantController(TenantRepository tenantRepository){
        this.tenantRepository = tenantRepository;
    }

    @Override
    public ResponseEntity<TenantDto> deleteTenant(Integer id) {
        TenantDto tenantDto = new TenantDto();
        tenantDto = tenantRepository.findById(id.longValue())
                .get().entitytoDto();

        tenantRepository.deleteById(id.longValue());
        return ResponseEntity.ok().body(tenantDto);
    }

    @Override
    public ResponseEntity<TenantDto> getTenant(Integer id) {
        Tenant tenantVo = tenantRepository.findById(id.longValue()).get();

        TenantDto tenantDto = new TenantDto();
        tenantDto = tenantVo.entitytoDto();

        return ResponseEntity.ok().body(tenantDto);
    }

    @Override
    public ResponseEntity<List<TenantDto>> getTenantList() {
        List<TenantDto> list = new ArrayList<>();
        for(Tenant tenantVO : tenantRepository.findAll()) {
            TenantDto tenantDto = new TenantDto();
            tenantDto = tenantVO.entitytoDto();
            list.add(tenantDto);
        }
        return ResponseEntity.ok().body(list);

    }

    @Override
    public ResponseEntity<UsableRoleDto> getUsableRole(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<TenantDto> postTenant(TenantDto tenantDto) {
        Tenant tenantVo = new Tenant();
        tenantVo = tenantDto.dtotoEntity();
        tenantRepository.save(tenantVo);

        return ResponseEntity.status(HttpStatus.CREATED).body(tenantDto);
    }

    @Override
    public ResponseEntity<TenantDto> putTenant(Integer id, TenantDto tenantDto) {
        Tenant tenantVo = new Tenant();
        tenantVo = tenantDto.dtotoEntity();
        tenantRepository.save(tenantVo);

        return ResponseEntity.ok().body(tenantDto);
    }
}

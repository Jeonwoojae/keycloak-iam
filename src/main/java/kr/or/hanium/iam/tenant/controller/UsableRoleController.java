package kr.or.hanium.iam.tenant.controller;

import kr.or.hanium.iam.api.UsableroleApi;
import kr.or.hanium.iam.api.model.TenantDto;
import kr.or.hanium.iam.api.model.UsableRoleDto;
import kr.or.hanium.iam.tenant.repository.entity.Tenant;
import kr.or.hanium.iam.tenant.repository.entity.UsableRole;
import kr.or.hanium.iam.tenant.repository.entity.UsableRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class UsableRoleController implements UsableroleApi {

    private final UsableRoleRepository usableRoleRepository;

    public UsableRoleController(UsableRoleRepository usableRoleRepository){
        this.usableRoleRepository = usableRoleRepository;
    }
    @Override
    public ResponseEntity<UsableRoleDto> deleteUsableRole(Integer id) {
        UsableRoleDto usableRoleDto = new UsableRoleDto();
        usableRoleDto = usableRoleRepository.findById(id.longValue())
                .get().entitytoDto();
        usableRoleRepository.deleteById(id.longValue());
        return ResponseEntity.ok().body(usableRoleDto);
    }

    @Override
    public ResponseEntity<List<UsableRoleDto>> getUsableRoleList() {
        List<UsableRoleDto> list = new ArrayList<>();
        for(UsableRole usableRoleVO : usableRoleRepository.findAll()) {
            UsableRoleDto usableRoleDto = new UsableRoleDto();
            usableRoleDto = usableRoleVO.entitytoDto();
            list.add(usableRoleDto);
        }
        return ResponseEntity.ok().body(list);
    }

    @Override
    public ResponseEntity<UsableRoleDto> postUsableRole(UsableRoleDto usableRoleDto) {
        UsableRole usableRoleVo = new UsableRole();
        usableRoleVo = usableRoleDto.dtotoEntity();
        usableRoleRepository.save(usableRoleVo);

        return ResponseEntity.status(HttpStatus.CREATED).body(usableRoleDto);

    }

    @Override
    public ResponseEntity<UsableRoleDto> putUsableRole(Integer id, UsableRoleDto usableRoleDto) {
        UsableRole usableRoleVo = new UsableRole();
        usableRoleVo = usableRoleDto.dtotoEntity();
        usableRoleRepository.save(usableRoleVo);

        return ResponseEntity.ok().body(usableRoleDto);
    }
}

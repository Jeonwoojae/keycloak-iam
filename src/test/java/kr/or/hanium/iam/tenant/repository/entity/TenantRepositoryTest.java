package kr.or.hanium.iam.tenant.repository.entity;

import kr.or.hanium.iam.tenant.repository.entity.Tenant;
import kr.or.hanium.iam.tenant.repository.entity.TenantRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class TenantRepositoryTest {

    @Autowired
    private TenantRepository tenantRepository;

    @AfterEach
    public void cleanup(){
        tenantRepository.deleteAll();
    }

    @Test
    void setTenant() {
//        given
        tenantRepository.save(Tenant.builder()
                .tenantName("tenant1").usableRoles(null)
                .build());

//        when
        List<Tenant> tenantlist = tenantRepository.findAll();

//        then
        Tenant tenant = tenantlist.get(0);
        assertThat(tenant.getTenantName()).isEqualTo("tenant1");

    }

}
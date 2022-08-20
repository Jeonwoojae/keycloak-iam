package kr.or.hanium.iam.tenant.repository.entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class UsableRoleRepositroyTest {

    @Autowired
    private UsableRoleRepository usableRoleRepository;

    @AfterEach
    public void cleanup(){
        usableRoleRepository.deleteAll();
    }

    @Test
    void setUsableRole() {
//        given
        usableRoleRepository.save(UsableRole.builder()
                .roleName("role1").tenant(null)
                .build());

//        when
        List<UsableRole> usableRolelist = usableRoleRepository.findAll();

//        then
        UsableRole usableRole = usableRolelist.get(0);
        assertThat(usableRole.getRoleName()).isEqualTo("role1");

    }
}
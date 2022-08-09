package com.hoony.msa;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.TestPropertySource;

import kr.or.hanium.iam.tenant.repository.TenantRepositoryMybatis;
import kr.or.hanium.iam.tenant.repository.entity.TenantEntity;


@MybatisTest
@TestPropertySource(properties = { "spring.config.location=classpath:application-test.properties" })
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TenantRepositoryTests {

    @Autowired
    private TenantRepositoryMybatis tenantRepositoryMybatis;
    
	@Test
    public void test_getTenantList() {

        List<TenantEntity> list = tenantRepositoryMybatis.getTenantList();
        assertThat(list).extracting("id", "name").contains(
                tuple(1, "hanium"),
                tuple(2, "hanium2")
                );
    }
}

package kr.or.hanium.iam.tenant.controller;

import kr.or.hanium.iam.tenant.repository.entity.Tenant;
import kr.or.hanium.iam.tenant.repository.entity.TenantRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(TenantController.class)
@RunWith(SpringRunner.class)
@SpringBootTest
class TenantControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private TenantRepository tenantRepository;

    @Test
    public void test_getTenantList() throws Exception {
        List<Tenant> list = new ArrayList<Tenant>();
        Tenant tenantVo = new Tenant();
        tenantVo.builder()
                .id(1L)
                .tenantName("tenant1")
                .usableRoles(null)
                .build();
        list.add(tenantVo);

        tenantVo.builder()
                .id(2L)
                .tenantName("tenant2")
                .usableRoles(null)
                .build();
        list.add(tenantVo);

        when(tenantRepository.findAll()).thenReturn(list);

        this.mvc.perform(get("/api/v1/tenants")).andExpect(status().isOk()).andExpect(jsonPath("$.[0].id", is(1)))
                .andExpect(jsonPath("$.[0].name", is("tenant1"))).andExpect(jsonPath("$.[1].id", is(2)))
                .andExpect(jsonPath("$.[1].name", is("tenant2")));
    }

}
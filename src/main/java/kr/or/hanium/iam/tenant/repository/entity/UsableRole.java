package kr.or.hanium.iam.tenant.repository.entity;

import kr.or.hanium.iam.api.model.UsableRoleDto;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@ToString(exclude = "tenant")
@Table(name="USABLEROLES")
public class UsableRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(length = 30, nullable = false)
    private String roleName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tenant_id")
    private Tenant tenant;

    @CreatedDate
    @Column(updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @Builder
    public UsableRole(Long id, String roleName, Tenant tenant){
        this.id = id;
        this.roleName = roleName;
        this.tenant = tenant;
    }

    public UsableRoleDto entitytoDto(){
        UsableRoleDto dto = new UsableRoleDto();
        dto.setId(this.id.intValue());
        dto.setRoleName(this.roleName);
        dto.setTenant(this.tenant.entitytoDto());

        return dto;
    }
}
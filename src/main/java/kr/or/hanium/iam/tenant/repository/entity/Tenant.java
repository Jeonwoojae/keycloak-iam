package kr.or.hanium.iam.tenant.repository.entity;

import kr.or.hanium.iam.api.model.TenantDto;
import kr.or.hanium.iam.api.model.UsableRoleDto;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="TENANTS")
public class Tenant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;

	@Column(length = 20, nullable = false)
	private String tenantName;

	@OneToMany(mappedBy = "tenant", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<UsableRole> usableRoles;

	@CreatedDate
	@Column(updatable = false, nullable = false)
	private LocalDateTime createdAt;

	@LastModifiedDate
	private LocalDateTime updatedAt;

//	@setter를 사용하지 않는다.(객체의 일관성)
	@Builder
	public Tenant(Long id, String tenantName, List<UsableRole> usableRoles)
	{
		this.id = id;
		this.tenantName = tenantName;
		this.usableRoles = usableRoles;
	}

	public TenantDto entitytoDto(){
		TenantDto dto = new TenantDto();
		dto.setId(this.getId().intValue());
		dto.setTenantName(this.getTenantName());

//		list로 되어있는 usablerole들을 어떻게 dto로?
		List<UsableRoleDto> temp = null;
		this.getUsableRoles().forEach(s -> temp.add(s.entitytoDto()));
		dto.setUsableRole(temp);

		return dto;
	}
}
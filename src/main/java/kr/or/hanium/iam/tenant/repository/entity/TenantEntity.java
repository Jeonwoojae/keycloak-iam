package kr.or.hanium.iam.tenant.repository.entity;

import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TenantEntity {
	private int id;
	private String name;
	private String description;
	private OffsetDateTime regdate;
	private OffsetDateTime update;
}

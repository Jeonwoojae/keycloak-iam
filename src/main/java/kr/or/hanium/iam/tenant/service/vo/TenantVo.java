package kr.or.hanium.iam.tenant.service.vo;

import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TenantVo {

	private int id;
	private String name;
	private String description;
	private OffsetDateTime regdate;
	private OffsetDateTime update;
}

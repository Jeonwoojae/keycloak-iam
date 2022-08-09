package kr.or.hanium.iam.tenant.repository.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.or.hanium.iam.tenant.repository.TenantRepositoryMybatis;
import kr.or.hanium.iam.tenant.repository.entity.TenantEntity;

@Mapper
public interface TenantRepositoryDaoMybatis extends TenantRepositoryMybatis {
	@Select("select id, `name`, description, `regdate`, `update` from tenant")
	List<TenantEntity> getTenantList();

	@Select("select id, `name`, description, `regdate`, `update` " + "from tenant where id = #{id}")
	public TenantEntity getTenant(int id);

	@Insert("insert into `tenant` (`name`, description, `regdate`, `update`)"
			+ "values (#{name}, #{description}, #{regdate}, #{update})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	public int postTenant(TenantEntity tenantEntity);

	@Update("update `tenant` set " + "`name` = #{name}," + "description = #{description}," + "`regdate` = #{regdate},"
			+ "`update` = #{update}" + " where id = #{id}")
	public int putTenant(TenantEntity tenantEntity);	
	
	@Delete("delete from `tenant` " + " where id = #{id}")
	public int deleteTenant(TenantEntity tenantEntity);
}

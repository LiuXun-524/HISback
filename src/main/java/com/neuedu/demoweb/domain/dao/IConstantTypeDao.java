package com.neuedu.demoweb.domain.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neuedu.demoweb.domain.entity.ConstantItem;
import com.neuedu.demoweb.domain.entity.ConstantType;

public interface IConstantTypeDao {
	
	@Insert("insert into t_constanttype values(null,#{constantTypeCode},#{constantTypeName},#{delMark})")
	public int save(ConstantType ct) throws Exception;
	@Select("select * from t_constanttype where constantTypeCode=#{constantTypeCode}")
	public ConstantType selectByConstantTypeCode(ConstantType ct);
	@Select("select * from t_constanttype where constantTypeName=#{constantTypeName}")
	public ConstantType selectByConstantTypeName(ConstantType ct);
	@Select("select * from t_constanttype")
	public List<ConstantType> findAll();
	
	@Update("UPDATE t_constanttype SET constantTypeCode=#{constantTypeCode},constantTypeName=#{constantTypeName} where id=#{id}")
	public int update(ConstantType ct);
	@Select("SELECT a.* "+
" from t_consantitem a, t_constanttype b "+
" WHERE a.constantTypeID=b.id "+
" AND b.constantTypeName=#{constantTypeName}")
	public List<ConstantItem> findAllDeptCate(String constantTypeName);
}

package com.neuedu.demoweb.domain.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neuedu.demoweb.domain.entity.ConstantItem;
import com.neuedu.demoweb.domain.entity.ConstantType;

public interface IConstantItemDao {

	@Select("select a.* "+
			"from t_consantitem a,t_constanttype b "+
			"where a.constantTypeID=b.id "+
			"and b.constantTypeName=#{constantTypeName} ")
	public List<ConstantItem> findConstantItemByTypeName(ConstantType ct);
	
	
	
@Insert("insert into t_consantitem values(null,#{constantTypeID},#{constantCode},#{constantName},1)")
	public int add(ConstantItem ci)throws Exception;


@Select("SELECT a.constantCode,a.constantName,b.constantTypeName"
		+ " FROM t_consantitem a,t_constanttype b"
		+ " WHERE a.constantTypeID = b.id")
public List<Map<String,Object>> findAll();


@Update({
    "<script>",
    "update t_consantItem set delMark=0 where id in ",
    "<foreach collection='array' item='item' index='index' separator=',' open='(' close=')'>",
    "#{item}",
    "</foreach>",
    "</script>"
})
public int delAll(String[] ids);




}

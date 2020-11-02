package com.neuedu.demoweb.domain.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neuedu.demoweb.domain.entity.Fmeditem;

public interface IFmeditemDao {
	@Select("select * from t_fmeditem")
	List<Fmeditem> findAll();
	@Update({
	    "<script>",
	    "update t_fmeditem set delMark=0 where id in ",
	    "<foreach collection='array' item='item' index='index' separator=',' open='(' close=')'>",
	    "#{item}",
	    "</foreach>",
	    "</script>"
	})
	int delAll(String[] split);
	@Insert("insert into t_fmeditem values(null,#{itemCode},#{itemName},#{format},#{price},#{expClassID},#{deptID},#{mnemonicCode},#{creationDate},#{lastUpdateDate},#{recordType},1)")
	int add(Fmeditem rl);
	@Update("update t_fmeditem set itemCode=#{itemCode},itemName=#{itemName},format=#{format},price=#{price},expClassID=#{expClassID},deptID=#{deptID},mnemonicCode=#{mnemonicCode},creationDate=#{creationDate},lastUpdateDate=#{lastUpdateDate},recordType=#{recordType} WHERE id=#{id}")
	int upDept(Fmeditem rl);

}

package com.neuedu.demoweb.domain.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neuedu.demoweb.domain.entity.RegistLevel;

public interface IRegistLevelDao {

	@Select("select * from t_registlevel")
	List<RegistLevel> findAll();

	@Update({
	    "<script>",
	    "update t_registlevel set delMark=0 where id in ",
	    "<foreach collection='array' item='item' index='index' separator=',' open='(' close=')'>",
	    "#{item}",
	    "</foreach>",
	    "</script>"
	})
	int delAll(String[] split);
	@Insert("insert into t_registlevel values(null,#{registCode},#{registName},#{sequenceNo},#{registFee},#{registQuota},1)")
	int add(RegistLevel rl);
	@Update("update t_registlevel set registCode=#{registCode},registName=#{registName},sequenceNo=#{sequenceNo},registFee=#{registFee},registQuota=#{registQuota} WHERE id=#{id}")
	int upDept(RegistLevel rl);
	@Select("select * from t_registlevel")
	List<RegistLevel> selectall();

}

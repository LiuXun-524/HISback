package com.neuedu.demoweb.domain.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.neuedu.demoweb.domain.entity.RegistLevel;

public interface IRegistLevelDao {

	@Select("select * from t_registlevel")
	List<RegistLevel> selectall();

}

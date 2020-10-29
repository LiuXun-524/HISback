package com.neuedu.demoweb.domain.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.neuedu.demoweb.domain.entity.Department;

public interface DepartmentDao {

	@Select("select * from t_department")
	public List<Department> selectall();

}

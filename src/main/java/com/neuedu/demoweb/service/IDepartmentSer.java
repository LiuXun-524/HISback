package com.neuedu.demoweb.service;

import java.util.List;
import java.util.Map;

import com.neuedu.demoweb.domain.entity.Department;
import com.neuedu.demoweb.domain.entity.RespMsg;

public interface IDepartmentSer {

	public List<Map<String,Object>> selectall();

	public List<Department> selectAllDept();

	public List<Map<String, Object>> selectDeptByDeptType(int deptType);

	public List<Map<String, Object>> selectDeptByDcid(int deptCategoryID);

	public List<Map<String, Object>> selectallByParam(Department dept);

	public RespMsg<?> add(Department dept);

	public RespMsg<?> upDept(Department dept);

}

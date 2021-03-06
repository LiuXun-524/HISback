package com.neuedu.demoweb.domain.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neuedu.demoweb.domain.entity.Department;


public interface DepartmentDao {

	@Select("SELECT  c.deptCode,c.deptName,a.constantName,c.deptType "+
			" from t_consantitem a,t_constanttype b,t_department c "+
			" WHERE a.constantTypeID=b.id "+
			" and c.deptCategoryID = a.id ")
	public List<Map<String,Object>> selectall();
	@Select("select * from t_department")
	public List<Department> selectAllDept();
	@Select("SELECT  c.deptCode,c.deptName,a.constantName,c.deptType "+
			" from t_consantitem a,t_constanttype b,t_department c "+
			" WHERE a.constantTypeID=b.id "+
			" and c.deptCategoryID = a.id "+
			" and c.deptType=#{typeId}")
	public List<Map<String, Object>> selectallByDeptType(int typeId);
	
	@Select("SELECT  c.deptCode,c.deptName,a.constantName,c.deptType "+
			" from t_consantitem a,t_constanttype b,t_department c "+
			" WHERE a.constantTypeID=b.id "+
			" and c.deptCategoryID = a.id "+
			" and c.deptCategoryID=#{deptCategoryID}")
	public List<Map<String, Object>> selectallByDcid(int deptCategoryID);
	
	public List<Map<String, Object>> selectallByParam(Department dept)throws Exception;
	@Insert("insert into t_department VALUES(null,#{deptCode},#{deptName},#{deptCategoryID},#{deptType},1)")
	public int add(Department dept);
	@Update("update t_department set deptCode=#{deptCode},deptName=#{deptName},deptCategoryID=#{deptCategoryID},deptType=#{deptType} WHERE id=#{id}")
	public int upDept(Department dept);
}

package com.neuedu.demoweb.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.demoweb.domain.entity.Department;
import com.neuedu.demoweb.domain.entity.RespMsg;
import com.neuedu.demoweb.service.IDepartmentSer;

@RestController
@RequestMapping("/sys/department")
public class DepartmentController {

	@Autowired
	IDepartmentSer ser;
	
	@RequestMapping("/add")
	public RespMsg<?> add(@RequestBody Department dept){
		RespMsg<?> rm = ser.add(dept);
		return rm;
	}
	@RequestMapping("/upDept")
	public RespMsg<?> upDept(@RequestBody Department dept){
		RespMsg<?> rm = ser.upDept(dept);
		return rm;
	}
	@RequestMapping("/selectall")
	public List<Department> selectall(){
		return ser.selectAllDept();
	}
	@RequestMapping("/findAllDeptPage")
	public PageInfo<Map<String,Object>> findAllDeptPage(int currentPage,int pageSize){
		PageHelper.startPage(currentPage,pageSize);
		List<Map<String,Object>> list=ser.selectall();
		PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}
	@GetMapping("/selectallByParam")
	public PageInfo<Map<String,Object>> selectallByParam(
			@RequestParam(value = "currentPage",required=true) Integer currentPage,
			@RequestParam(value = "pageSize",required=true)Integer pageSize,
			@RequestParam(value = "deptCategoryID",required=false) Integer deptCategoryID,
			@RequestParam(value = "deptType",required=false) Integer deptType
			){
		System.out.println(currentPage+","+pageSize+","+deptCategoryID+","+deptType);
		PageHelper.startPage(currentPage,pageSize);
		Department dept = null;
		if(deptCategoryID!=null||deptType!=null){
			dept = new Department();
			if(deptCategoryID!=null){
				dept.setDeptCategoryID(deptCategoryID);
			}
			if(deptType!=null){
				dept.setDeptType(deptType);
			}
		}
		List<Map<String,Object>> list=ser.selectallByParam(dept);
		PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}
	@RequestMapping("/findPartDept")
	public List<Map<String,Object>> findPartDept(int deptType){
		List<Map<String,Object>> list=ser.selectDeptByDeptType(deptType);
		return list;
	}
	@RequestMapping("/findPartDeptByDcid")
	public List<Map<String,Object>> findPartDeptByDcid(int deptType){
		System.out.println(deptType);
		List<Map<String,Object>> list=ser.selectDeptByDcid(deptType);
		return list;
	}
	
}

package com.neuedu.demoweb.service.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demoweb.domain.dao.DepartmentDao;
import com.neuedu.demoweb.domain.entity.Department;
import com.neuedu.demoweb.domain.entity.RespMsg;
import com.neuedu.demoweb.service.IDepartmentSer;
@Service
public class DepartmentSerImpl implements IDepartmentSer {

	@Autowired
	DepartmentDao dao;
	@Override
	public List<Map<String,Object>> selectall() {
		// TODO Auto-generated method stub
		Map<Integer, String> deptType = new HashMap<>();
		deptType.put(1, "临床");
		deptType.put(2, "医技");
		deptType.put(3, "财务");
		deptType.put(4, "行政");
		deptType.put(5, "其它");
		List<Map<String,Object>> list = dao.selectall();
		for (Iterator<Map<String, Object>> iterator = list.iterator(); iterator.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
			for (int i = 0; i < deptType.size(); i++) {
				if(map.get("deptType").equals(i)){
					map.put("deptType",deptType.get(i));
				}
			}
		}
		return list;
	}
	@Override
	public List<Map<String, Object>> selectallByParam(Department dept) {
		//*******动态拼接查询语句***************
		Map<Integer, String> deptType = new HashMap<>();
		deptType.put(1, "临床");
		deptType.put(2, "医技");
		deptType.put(3, "财务");
		deptType.put(4, "行政");
		deptType.put(5, "其它");
		List<Map<String, Object>> list = null;
		try {
			list = dao.selectallByParam(dept);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (Iterator<Map<String, Object>> iterator = list.iterator(); iterator.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
			for (int i = 0; i < deptType.size(); i++) {
				if(map.get("deptType").equals(i)){
					map.put("deptType",deptType.get(i));
				}
			}
		}
		return list;
	}
	@Override
	public List<Department> selectAllDept() {
		// TODO Auto-generated method stub
		return dao.selectAllDept();
	}
	@Override
	public List<Map<String, Object>> selectDeptByDeptType(int typeId) {
		Map<Integer, String> deptType = new HashMap<>();
		deptType.put(1, "临床");
		deptType.put(2, "医技");
		deptType.put(3, "财务");
		deptType.put(4, "行政");
		deptType.put(5, "其它");
		List<Map<String,Object>> list = dao.selectallByDeptType(typeId);
		for (Iterator<Map<String, Object>> iterator = list.iterator(); iterator.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
				if(map.get("deptType").equals(typeId)){
					map.put("deptType",deptType.get(typeId));
				}
		}
		return list;
	}
	@Override
	public List<Map<String, Object>> selectDeptByDcid(int deptCategoryID) {
		Map<Integer, String> deptType = new HashMap<>();
		deptType.put(1, "临床");
		deptType.put(2, "医技");
		deptType.put(3, "财务");
		deptType.put(4, "行政");
		deptType.put(5, "其它");
		List<Map<String,Object>> list = dao.selectallByDcid(deptCategoryID);
		for (Iterator<Map<String, Object>> iterator = list.iterator(); iterator.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
			for (int i = 0; i < deptType.size(); i++) {
				if(map.get("deptType").equals(i)){
					map.put("deptType",deptType.get(i));
				}
			}
		}
		return list;
	}
	@Override
	public RespMsg<?> add(Department dept) {
		RespMsg<?> rm = null;
		try {
			int re = dao.add(dept);
			if(re>0){
				rm = new RespMsg<>(1, "添加成功");
			}else{
				rm = new RespMsg<>(-2, "添加失败");
			}
		} catch (Exception e) {
			rm = new RespMsg<>(-1, "科室名称重复！");
			System.out.println("科室名称重复,已规定不能重复");
		}
		return rm;
	}
	@Override
	public RespMsg<?> upDept(Department dept) {
		RespMsg<?> rm = null;
		try {
			int re = dao.upDept(dept);
			System.out.println("修改状态码"+re);
			if(re>0){
				rm = new RespMsg<>(1, "修改成功");
			}else{
				rm = new RespMsg<>(-2, "修改失败");
			}
		} catch (Exception e) {
			rm = new RespMsg<>(-1, "数据库错误！");
			System.out.println("数据库错误！");
		}
		return rm;
	}

}

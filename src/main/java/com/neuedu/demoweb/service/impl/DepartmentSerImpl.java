package com.neuedu.demoweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demoweb.domain.dao.DepartmentDao;
import com.neuedu.demoweb.domain.entity.Department;
import com.neuedu.demoweb.service.IDepartmentSer;
@Service
public class DepartmentSerImpl implements IDepartmentSer {

	@Autowired
	DepartmentDao dao;
	@Override
	public List<Department> selectall() {
		// TODO Auto-generated method stub
		return dao.selectall();
	}

}

package com.neuedu.demoweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.demoweb.domain.entity.Department;
import com.neuedu.demoweb.service.IDepartmentSer;

@RestController
@RequestMapping("/sys/department")
public class DepartmentController {

	@Autowired
	IDepartmentSer ser;
	@RequestMapping("/selectall")
	public List<Department> selectall(){
		return ser.selectall();
	}
}

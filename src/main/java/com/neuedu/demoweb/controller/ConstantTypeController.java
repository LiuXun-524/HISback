package com.neuedu.demoweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.demoweb.domain.entity.ConstantType;
import com.neuedu.demoweb.domain.entity.RespMsg;
import com.neuedu.demoweb.service.IConstantTypeSer;

@RestController//包含ResponseBody和Controller
@RequestMapping("/sys/constantType")
public class ConstantTypeController {

	@Autowired
	IConstantTypeSer ser;
	@RequestMapping("/add")
	public RespMsg<?> add(@RequestBody ConstantType ct){
		System.out.println(ct.toString());
		RespMsg<?> rm = ser.add(ct);
		return rm;
	}
	@RequestMapping("/update")
	public RespMsg<?> update(@RequestBody ConstantType ct){
		System.out.println(ct.toString());
		RespMsg<?> rm = ser.update(ct);
		return rm;
	}
	
	@RequestMapping("/findAll")
	public List<ConstantType> findAll(){
		List<ConstantType> ctList = ser.findAll();
		return ctList;
	}
	@RequestMapping("/findAllConstantTypePage")
	public PageInfo<ConstantType> findAllConstantTypePage(int currentPage,int pageSize){
		PageHelper.startPage(currentPage,pageSize);
		List<ConstantType> list=ser.findAll();
		PageInfo<ConstantType> pageInfo = new PageInfo<>(list);

		return pageInfo;
	}
	
}

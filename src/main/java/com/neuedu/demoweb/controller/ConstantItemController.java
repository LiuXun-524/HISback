package com.neuedu.demoweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.demoweb.domain.entity.ConstantItem;
import com.neuedu.demoweb.domain.entity.RespMsg;
import com.neuedu.demoweb.service.IConstantItemService;

@RestController
@RequestMapping("/sys/constantItem")
public class ConstantItemController {

	@Autowired
	IConstantItemService ser;
	
	@RequestMapping("/findConstantItemByTypeName")
	public List<ConstantItem> findConstantItemByTypeName(String constantTypeName){
		List<ConstantItem> cil = ser.findConstantItemByTypeName(constantTypeName);
		return cil;
		
	}
	@RequestMapping("/add")
	public RespMsg<?> add(@RequestBody ConstantItem ci){
		RespMsg<?> rm = ser.add(ci);
		return rm;
		
	}
	@RequestMapping("/delAll")
	public RespMsg<?> delAll(String idsstr){
		System.out.println(idsstr);
		RespMsg<?> rm = ser.delAll(idsstr);
		return rm;
		
	}
	
	@RequestMapping("/findAllConstantItemPage")
	public PageInfo<ConstantItem> findAllConstantItemPage(int currentPage,int pageSize){
		PageHelper.startPage(currentPage,pageSize);
		List<ConstantItem> list=ser.findAll();
		PageInfo<ConstantItem> pageInfo = new PageInfo<>(list);

		return pageInfo;
	}
	
}

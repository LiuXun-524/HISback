package com.neuedu.demoweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.demoweb.domain.entity.ExpenseClass;
import com.neuedu.demoweb.domain.entity.RespMsg;
import com.neuedu.demoweb.service.IExpenseClassSer;

@RestController
@RequestMapping("/sys/expenseClass")
public class ExpenseClassController {

	@Autowired
	IExpenseClassSer ser;
	
	@RequestMapping("/findAllPage")
	public PageInfo<ExpenseClass> findAllPage(int currentPage,int pageSize){
		PageHelper.startPage(currentPage,pageSize);
		List<ExpenseClass> list=ser.findAll();
		PageInfo<ExpenseClass> pageInfo = new PageInfo<>(list);

		return pageInfo;
	}
	@RequestMapping("/delAll")
	public RespMsg<?> delAll(String idsstr){
		System.out.println(idsstr);
		RespMsg<?> rm = ser.delAll(idsstr);
		return rm;
		
	}
	@RequestMapping("/add")
	public RespMsg<?> add(@RequestBody ExpenseClass rl){
		RespMsg<?> rm = ser.add(rl);
		return rm;
		
	}
	@RequestMapping("/update")
	public RespMsg<?> update(@RequestBody ExpenseClass rl){
		RespMsg<?> rm = ser.update(rl);
		return rm;
	}

}
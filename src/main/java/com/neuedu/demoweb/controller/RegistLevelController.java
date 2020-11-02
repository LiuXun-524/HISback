package com.neuedu.demoweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.demoweb.domain.entity.RegistLevel;
import com.neuedu.demoweb.domain.entity.RespMsg;
import com.neuedu.demoweb.service.IRegistLevelSer;

@RestController
@RequestMapping("/sys/registlevel")
public class RegistLevelController {
	@Autowired
	IRegistLevelSer ser;
	
	@RequestMapping("/selectall")
	public List<RegistLevel> selectall(){
		List<RegistLevel> list=ser.selectall();
		
		return list;
	}
	@RequestMapping("/findAllPage")
	public PageInfo<RegistLevel> findAllPage(int currentPage,int pageSize){
		PageHelper.startPage(currentPage,pageSize);
		List<RegistLevel> list=ser.findAll();
		PageInfo<RegistLevel> pageInfo = new PageInfo<>(list);

		return pageInfo;
	}
	@RequestMapping("/delAll")
	public RespMsg<?> delAll(String idsstr){
		System.out.println(idsstr);
		RespMsg<?> rm = ser.delAll(idsstr);
		return rm;
		
	}
	@RequestMapping("/add")
	public RespMsg<?> add(@RequestBody RegistLevel rl){
		RespMsg<?> rm = ser.add(rl);
		return rm;
		
	}
	@RequestMapping("/update")
	public RespMsg<?> update(@RequestBody RegistLevel rl){
		RespMsg<?> rm = ser.update(rl);
		return rm;
	}

}

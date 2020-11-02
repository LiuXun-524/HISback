package com.neuedu.demoweb.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.demoweb.domain.entity.Fmeditem;
import com.neuedu.demoweb.domain.entity.RespMsg;
import com.neuedu.demoweb.service.IFmeditemSer;

@RestController
@RequestMapping("/sys/fmeditem")
public class FmeditemController {
	@Autowired
	IFmeditemSer ser;
	
	@RequestMapping("/findAllPage")
	public PageInfo<Fmeditem> findAllPage(int currentPage,int pageSize){
		PageHelper.startPage(currentPage,pageSize);
		List<Fmeditem> list=ser.findAll();
		PageInfo<Fmeditem> pageInfo = new PageInfo<>(list);

		return pageInfo;
	}
	@RequestMapping("/delAll")
	public RespMsg<?> delAll(String idsstr){
		System.out.println(idsstr);
		RespMsg<?> rm = ser.delAll(idsstr);
		return rm;
		
	}
	@RequestMapping("/add")
	public RespMsg<?> add(@RequestBody Fmeditem rl){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss");
		String format = sdf.format(date);
		rl.setLastUpdateDate(format);
		rl.setCreationDate(format);
		RespMsg<?> rm = ser.add(rl);
		return rm;
		
	}
	@RequestMapping("/update")
	public RespMsg<?> update(@RequestBody Fmeditem rl){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss");
		String format = sdf.format(date);
		rl.setLastUpdateDate(format);
		RespMsg<?> rm = ser.update(rl);
		return rm;
	}

}


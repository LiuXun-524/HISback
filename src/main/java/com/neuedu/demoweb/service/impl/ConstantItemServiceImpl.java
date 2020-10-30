package com.neuedu.demoweb.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demoweb.domain.dao.IConstantItemDao;
import com.neuedu.demoweb.domain.entity.ConstantItem;
import com.neuedu.demoweb.domain.entity.ConstantType;
import com.neuedu.demoweb.domain.entity.RespMsg;
import com.neuedu.demoweb.service.IConstantItemService;
@Service
public class ConstantItemServiceImpl implements IConstantItemService{

	@Autowired
	IConstantItemDao dao;
	
	@Override
	public List<ConstantItem> findConstantItemByTypeName(String constantTypeName) {
		// TODO Auto-generated method stub、
		ConstantType ct = new ConstantType();
		ct.setConstantTypeName(constantTypeName);
		
		List<ConstantItem> cil = dao.findConstantItemByTypeName(ct);
		return cil;
	}

	@Override
	public RespMsg<?> add(ConstantItem ci) {
		// TODO Auto-generated method stub
		RespMsg<?> rm = null;
		try {
			int re = dao.add(ci);
			if(re>0){
				rm = new RespMsg<>(1, "添加成功");
			}else{
				rm = new RespMsg<>(-2, "添加失败");
			}
		} catch (Exception e) {
			rm = new RespMsg<>(-1, "常数项名称重复");
			System.out.println("常数项名称重复,已规定不能重复");
		}
		return rm;
	}

	@Override
	public List<Map<String, Object>> findAll() {
		List<Map<String, Object>> list = dao.findAll();
		return list;
	}

	@Override
	public RespMsg<?> delAll(String idsstr) {
		RespMsg<?> rm = null;
		int res = dao.delAll(idsstr.split(","));
		if(res>0){
			rm = new RespMsg<>(1, "删除成功");
		}else{
			rm = new RespMsg<>(-1, "删除失败");
		}
		return rm;
	}

	

}

package com.neuedu.demoweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demoweb.domain.dao.IConstantTypeDao;
import com.neuedu.demoweb.domain.entity.ConstantItem;
import com.neuedu.demoweb.domain.entity.ConstantType;
import com.neuedu.demoweb.domain.entity.RespMsg;
import com.neuedu.demoweb.service.IConstantTypeSer;
@Service
public class ConstantTypeSer implements IConstantTypeSer {

	@Autowired
	IConstantTypeDao dao;
	@SuppressWarnings({  "rawtypes", "unchecked" })
	@Override
	public RespMsg add(ConstantType ct) {
		RespMsg rm = null;
		ConstantType db_ct1 = dao.selectByConstantTypeCode(ct);
		if(db_ct1==null){
			
			ConstantType db_ct2 = dao.selectByConstantTypeName(ct);
			if(db_ct2==null){
				
				try {
					int re = dao.save(ct);
					if(re>0){
						rm = new RespMsg(1,"添加成功");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else{
				rm = new RespMsg(-2,"已存在此常数类型名称");
			}
		}else{
			rm = new RespMsg(-1,"已存在此常数类编码");
		}
		return rm;
	}
	@Override
	public List<ConstantType> findAll() {
		List<ConstantType> ctList  = dao.findAll();
		return ctList;
	}
	@Override
	public List<ConstantItem> findAllDeptCate(String constantTypeName) {
		List<ConstantItem> ctList  = dao.findAllDeptCate(constantTypeName);
		return ctList;
	}
	@SuppressWarnings("rawtypes")
	@Override
	public RespMsg<?> update(ConstantType ct) {
		RespMsg rm = null;
		try {
			int re = dao.update(ct);
			if(re>0){
				rm = new RespMsg(1,"修改成功");
			}else{
				rm = new RespMsg(-1,"修改失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
			rm = new RespMsg<>(-3, "数据库错误");
		}
		return rm;
	}

}

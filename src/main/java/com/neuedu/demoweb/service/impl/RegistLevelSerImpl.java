package com.neuedu.demoweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demoweb.domain.dao.IRegistLevelDao;
import com.neuedu.demoweb.domain.entity.RegistLevel;
import com.neuedu.demoweb.domain.entity.RespMsg;
import com.neuedu.demoweb.service.IRegistLevelSer;
@Service
public class RegistLevelSerImpl implements IRegistLevelSer {

	@Autowired
	IRegistLevelDao dao;
	@Override
	public List<RegistLevel> findAll() {
		List<RegistLevel> list = dao.findAll();
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
	@Override
	public RespMsg<?> add(RegistLevel rl) {
		RespMsg<?> rm = null;
		try {
			int re = dao.add(rl);
			if(re>0){
				rm = new RespMsg<>(1, "添加成功");
			}else{
				rm = new RespMsg<>(-2, "添加失败");
			}
		} catch (Exception e) {
			rm = new RespMsg<>(-1, "数据库错误");
			System.out.println("数据库错误");
		}
		return rm;
	}
	@Override
	public RespMsg<?> update(RegistLevel rl) {
		RespMsg<?> rm = null;
		try {
			int re = dao.upDept(rl);
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
	@Override
	public List<RegistLevel> selectall() {
		return dao.selectall();
	}

}

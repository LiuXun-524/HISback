package com.neuedu.demoweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demoweb.domain.dao.IUserDao;
import com.neuedu.demoweb.domain.entity.RespMsg;
import com.neuedu.demoweb.domain.entity.User;
import com.neuedu.demoweb.service.IUserService;
@Service
public class UserService implements IUserService{

	@Autowired
	IUserDao dao;
	
	@Override
	public RespMsg<?> save(User user) {
		RespMsg<?> rm = null;
		try {
			dao.save(user);
			rm = new RespMsg<User>(0,"注册成功");
		} catch (Exception e) {
			rm = new RespMsg<User>(999,"用户名重复");
		}
		
		return rm;
	}

	@Override
	public RespMsg<User> findUserByName(User user,HttpServletRequest request) {
		User u = dao.findUserByName(user);
		RespMsg<User> rm = null;
		if(u==null||u.equals(null)){
			rm = new RespMsg<User>(-1,"无此用户");
		}else{
			if(!user.getPassword().equals(u.getPassword())){
				rm = new RespMsg<User>(-2,"密码错误");
			}else{
				rm = new RespMsg<User>(0,"登录成功");
				List<User> list = new ArrayList<User>();
				list.add(u);
				rm.setList(list);
				HttpSession session = request.getSession();
				session.setAttribute("loginUser", u);
				session.setMaxInactiveInterval(30*60);
			}
		}
		
		return rm;
	}

	@Override
	public List<User> selectall() {
		List<User> list = dao.selectall();
		return list;
	}
	
}

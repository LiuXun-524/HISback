package com.neuedu.demoweb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.demoweb.domain.entity.RespMsg;
import com.neuedu.demoweb.domain.entity.User;
import com.neuedu.demoweb.service.IUserService;

@RestController//包含ResponseBody和Controller
@RequestMapping("/sys/user")
public class UserController {

	@Autowired
	IUserService ser;
	
	@RequestMapping("/add")
	public RespMsg<?> save(@RequestBody User user){
		System.out.println(user.toString());
		RespMsg<?> rm = ser.save(user);
		return rm;
		
	}
	@RequestMapping("/findUserByName")
	public RespMsg<User> findUserByName(@RequestBody User user,HttpServletRequest request){
		System.out.println(user.toString());
		RespMsg<User> rm = ser.findUserByName(user,request);
		return rm;
		
	}
}

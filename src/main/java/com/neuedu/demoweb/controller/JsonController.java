package com.neuedu.demoweb.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.demoweb.domain.entity.User;
import com.neuedu.demoweb.service.IUserService;
/**
 * 实体类
 * list
 * Map<String,object>
 */


@RestController
public class JsonController {
	
	@Autowired
	IUserService ser;
	
	/*@RequestMapping("/user.action")
	public int save(){
		User user1 = new User();
		user1.setId(2);
		user1.setName("wangfei");
		String format = new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss").format(new Date());
		user1.setBirthday(format);
		user1.setPwd("123");
		return ser.save(user1);
	}
	
	@RequestMapping("/json1.action")
	public User demo1(){
		//返回json对象
		User user1 = new User();
		user1.setId(2);
		user1.setName("wangfei");
		String format = new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss").format(new Date());
		user1.setBirthday(format);
		user1.setPwd("123");
		return user1;
		
	}
	@RequestMapping("/json2.action")
	public List<User> demo2(){
		//返json数组
		List<User> ulist = new ArrayList<User>();
		User user1 = new User();
		user1.setId(2);
		user1.setName("wangfei");
		user1.setBirthday(new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss").format(new Date()));
		user1.setPwd("123");
		User user2 = new User();
		user2.setId(2);
		user2.setName("wangfei");
		user2.setBirthday(new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss").format(new Date()));
		user2.setPwd("123");
		ulist.add(user2);
		ulist.add(user1);
		return ulist;
		
	}
	@RequestMapping("/json3.action")
	public Map<String,Object> demo3(){
		//返Map数组
		Map<String, Object> map = new HashMap<>();
		User user1 = new User();
		user1.setId(2);
		user1.setName("wangfei");
		user1.setBirthday(new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss").format(new Date()));
		user1.setPwd("123");
		User user2 = new User();
		user2.setId(2);
		user2.setName("wangfei");
		user2.setBirthday(new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss").format(new Date()));
		user2.setPwd("123");
		map.put("user1", user1);
		map.put("user2", user2);
		
		return map;
		
	}
	@RequestMapping("/json4.action")
	public List<Map<String,Object>> demo4(){
		//返ListMap
		Map<String, Object> map = new HashMap<>();
		List<Map<String,Object>> lm = new ArrayList<Map<String,Object>>();
		User user1 = new User();
		user1.setId(2);
		user1.setName("wangfei");
		user1.setBirthday(new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss").format(new Date()));
		user1.setPwd("123");
		User user2 = new User();
		user2.setId(2);
		user2.setName("wangfei");
		user2.setBirthday(new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss").format(new Date()));
		user2.setPwd("123");
		map.put("user1", user1);
		map.put("user2", user2);
		lm.add(map);
		return lm;
		
	}*/
}

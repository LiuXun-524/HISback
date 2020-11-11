package com.neuedu.demoweb.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.demoweb.domain.entity.RespMsg;
import com.neuedu.demoweb.domain.entity.User;
import com.neuedu.demoweb.service.IUserService;

@RestController//包含ResponseBody和Controller
@RequestMapping("/sys/user")
public class UserController {

	@Autowired
	IUserService ser;
	
	@RequestMapping("/selectall")
	public List<User> selectall(){
		List<User> list = ser.selectall();
		return list;
		
	}
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
	@RequestMapping("/findAllUserByParams")
	public List<Map<String,Object>> findAllUserByParams(
			@RequestParam(value = "registLeID",required=false) Integer registLeID,
			@RequestParam(value = "schedDate",required=false)String schedDate,
			@RequestParam(value = "noon",required=false) String noon,
			@RequestParam(value = "deptID",required=false) Integer deptID
			){
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = sdf.parse(schedDate);
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		List<Map<String,Object>> rm = ser.findAllUserByParams(registLeID,schedDate,noon,deptID);
		return rm;
		
	}
}

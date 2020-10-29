package com.neuedu.demoweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.demoweb.domain.entity.RegistLevel;
import com.neuedu.demoweb.service.IRegistLevelService;

@RestController
@RequestMapping("/sys/registLevel")
public class RegisterLeController {
	
	@Autowired
	IRegistLevelService ser;

	@RequestMapping("/selectall")
	public List<RegistLevel> selectall(){
		return ser.selectall();
	}
}

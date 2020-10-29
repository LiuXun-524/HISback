package com.neuedu.demoweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @RequestBody,@RsponseBody
 * @RestController=@Controller+ResponseBody
 * @author Administrator
 *
 */
@RestController
public class HelloWorldController {
	@RequestMapping("/hello.action")
	public String hello(){
		return "hello world";
	}
	
}

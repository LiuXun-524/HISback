package com.neuedu.demoweb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.neuedu.demoweb.service.impl.CTypeService;

@SpringBootTest
class DemoWebApplicationTests {
	
	public static void main(String[] args) {
		CTypeService ser = new CTypeService();
		ser.save();
	}
	@Test
	void contextLoads() {
		CTypeService ser = new CTypeService();
		ser.save();
	}

}

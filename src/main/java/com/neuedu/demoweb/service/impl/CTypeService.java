package com.neuedu.demoweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demoweb.domain.dao.IConstantTypeDao;
import com.neuedu.demoweb.domain.entity.ConstantType;
@Service
public class CTypeService {

	@Autowired
	IConstantTypeDao dao;
	
	public void save(){
		ConstantType ct = new ConstantType();
		ct.setConstantTypeCode("123");
		ct.setConstantTypeName("test");
		try {
			dao.save(ct);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}

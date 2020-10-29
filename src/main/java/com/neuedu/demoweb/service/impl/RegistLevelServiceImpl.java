package com.neuedu.demoweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.demoweb.domain.dao.IRegistLevelDao;
import com.neuedu.demoweb.domain.entity.RegistLevel;
import com.neuedu.demoweb.service.IRegistLevelService;
@Service
public class RegistLevelServiceImpl implements IRegistLevelService {

	@Autowired
	IRegistLevelDao dao;
	@Override
	public List<RegistLevel> selectall() {
		// TODO Auto-generated method stub
		
		return dao.selectall();
	}

}

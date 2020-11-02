package com.neuedu.demoweb.service;

import java.util.List;

import com.neuedu.demoweb.domain.entity.RegistLevel;
import com.neuedu.demoweb.domain.entity.RespMsg;

public interface IRegistLevelSer {

	public List<RegistLevel> findAll();

	public RespMsg<?> delAll(String idsstr);

	public RespMsg<?> add(RegistLevel rl);

	public RespMsg<?> update(RegistLevel rl);

	public List<RegistLevel> selectall();

}

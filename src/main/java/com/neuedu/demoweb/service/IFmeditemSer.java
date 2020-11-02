package com.neuedu.demoweb.service;

import java.util.List;

import com.neuedu.demoweb.domain.entity.Fmeditem;
import com.neuedu.demoweb.domain.entity.RespMsg;

public interface IFmeditemSer {

	public List<Fmeditem> findAll();

	public RespMsg<?> delAll(String idsstr);

	public RespMsg<?> add(Fmeditem rl);

	public RespMsg<?> update(Fmeditem rl);

}

package com.neuedu.demoweb.service;

import java.util.List;

import com.neuedu.demoweb.domain.entity.ConstantType;
import com.neuedu.demoweb.domain.entity.RespMsg;

public interface IConstantTypeSer {

	public RespMsg<?> add(ConstantType ct);

	public List<ConstantType> findAll();

	public RespMsg<?> update(ConstantType ct);

}

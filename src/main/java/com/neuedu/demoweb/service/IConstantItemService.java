package com.neuedu.demoweb.service;

import java.util.List;
import java.util.Map;

import com.neuedu.demoweb.domain.entity.ConstantItem;
import com.neuedu.demoweb.domain.entity.RespMsg;

public interface IConstantItemService {

	List<ConstantItem> findConstantItemByTypeName(String constantTypeName);

	RespMsg<?> add(ConstantItem ci);

	List<Map<String, Object>> findAll();

	RespMsg<?> delAll(String idsstr);


}

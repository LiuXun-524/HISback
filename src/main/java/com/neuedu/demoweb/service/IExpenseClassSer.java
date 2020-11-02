package com.neuedu.demoweb.service;

import java.util.List;

import com.neuedu.demoweb.domain.entity.ExpenseClass;
import com.neuedu.demoweb.domain.entity.RespMsg;

public interface IExpenseClassSer {

	List<ExpenseClass> findAll();

	RespMsg<?> delAll(String idsstr);

	RespMsg<?> add(ExpenseClass rl);

	RespMsg<?> update(ExpenseClass rl);

}

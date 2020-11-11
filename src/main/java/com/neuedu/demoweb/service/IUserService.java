package com.neuedu.demoweb.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;


import com.neuedu.demoweb.domain.entity.RespMsg;
import com.neuedu.demoweb.domain.entity.User;

public interface IUserService {
public RespMsg<?> save(User user);

public RespMsg<User> findUserByName(User user,HttpServletRequest request);

public List<User> selectall();

public List<Map<String,Object>> findAllUserByParams(int registLeID, String schedDate, String noon, int deptID);
}

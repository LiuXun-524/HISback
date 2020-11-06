package com.neuedu.demoweb.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;


import com.neuedu.demoweb.domain.entity.RespMsg;
import com.neuedu.demoweb.domain.entity.User;

public interface IUserService {
public RespMsg<?> save(User user);

public RespMsg<User> findUserByName(User user,HttpServletRequest request);

public List<User> selectall();
}

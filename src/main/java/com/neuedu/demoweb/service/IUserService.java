package com.neuedu.demoweb.service;

import javax.servlet.http.HttpServletRequest;


import com.neuedu.demoweb.domain.entity.RespMsg;
import com.neuedu.demoweb.domain.entity.User;

public interface IUserService {
public RespMsg<?> save(User user);

public RespMsg<User> findUserByName(User user,HttpServletRequest request);
}

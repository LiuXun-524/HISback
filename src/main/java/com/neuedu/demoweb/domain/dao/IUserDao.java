package com.neuedu.demoweb.domain.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.neuedu.demoweb.domain.entity.User;

public interface IUserDao {

	@Insert("insert into t_user "
+ "values(null,#{userName},#{password},#{realName},#{userType},#{docTitleID},#{isScheduling},#{deptID},#{registLeID},1)")
	public int save(User user) throws Exception;
@Select("select * from t_user where userName=#{userName}")
	public User findUserByName(User user);

}
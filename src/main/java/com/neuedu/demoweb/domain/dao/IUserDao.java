package com.neuedu.demoweb.domain.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.neuedu.demoweb.domain.entity.User;

public interface IUserDao {

	@Insert("insert into t_user "
+ "values(null,#{userName},#{password},#{realName},#{userType},#{docTitleID},#{isScheduling},#{deptID},#{registLeID},1)")
	public int save(User user) throws Exception;
@Select("select * from t_user where userName=#{userName}")
	public User findUserByName(User user);
@Select("select * from t_user")
public List<User> selectall();

@Select("SELECT b.* from t_scheduling a,t_user b where a.userID=b.id and a.schedDate=#{schedDate} and a.noon=#{noon} and a.deptID=#{deptID} and b.registLeID=#{registLeID}")
public List<Map<String,Object>> findAllUserByParams(@Param("registLeID") int registLeID,@Param("schedDate") String schedDate,@Param("noon") String noon, @Param("deptID") int deptID);

}
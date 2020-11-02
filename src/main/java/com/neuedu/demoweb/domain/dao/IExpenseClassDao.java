package com.neuedu.demoweb.domain.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neuedu.demoweb.domain.entity.ExpenseClass;

public interface IExpenseClassDao {
	@Select("select * from t_expenseclass")
	List<ExpenseClass> findAll();
	@Update({
	    "<script>",
	    "update t_expenseclass set delMark=0 where id in ",
	    "<foreach collection='array' item='item' index='index' separator=',' open='(' close=')'>",
	    "#{item}",
	    "</foreach>",
	    "</script>"
	})
	int delAll(String[] split);
	@Insert("insert into t_expenseclass values(null,#{expCode},#{expName},1)")
	int add(ExpenseClass rl);
	@Update("update t_expenseclass set expCode=#{expCode},expName=#{expName} WHERE id=#{id}")
	int upDept(ExpenseClass rl);

}

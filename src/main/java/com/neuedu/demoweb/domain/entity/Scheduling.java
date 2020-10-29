package com.neuedu.demoweb.domain.entity;

public class Scheduling {
	private int id;
	private String schedDate;
	private int deptID;
	private int userID;
	private String noon;
	private int ruleID=1;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSchedDate() {
		return schedDate;
	}
	public void setSchedDate(String schedDate) {
		this.schedDate = schedDate;
	}
	public int getDeptID() {
		return deptID;
	}
	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getNoon() {
		return noon;
	}
	public void setNoon(String noon) {
		this.noon = noon;
	}
	public int getRuleID() {
		return ruleID;
	}
	public void setRuleID(int ruleID) {
		this.ruleID = ruleID;
	}
	
	
	

}

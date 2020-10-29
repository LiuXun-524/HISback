package com.neuedu.demoweb.domain.entity;

public class ConstantItem {
	private int id;
	private int constantTypeID;
	private String constantCode;
	private String constantName;
	private int delMark=1;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getConstantTypeID() {
		return constantTypeID;
	}
	public void setConstantTypeID(int constantTypeID) {
		this.constantTypeID = constantTypeID;
	}
	
	public String getConstantCode() {
		return constantCode;
	}
	public void setConstantCode(String constantCode) {
		this.constantCode = constantCode;
	}
	public String getConstantName() {
		return constantName;
	}
	public void setConstantName(String constantName) {
		this.constantName = constantName;
	}
	public int getDelMark() {
		return delMark;
	}
	public void setDelMark(int delMark) {
		this.delMark = delMark;
	}
	
	
	

}

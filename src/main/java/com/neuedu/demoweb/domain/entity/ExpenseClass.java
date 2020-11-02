package com.neuedu.demoweb.domain.entity;

public class ExpenseClass {
	
	private int id;
	private String expCode;
	private String expName;
	private int delMark=1;
	public String getExpCode() {
		return expCode;
	}
	public void setExpCode(String expCode) {
		this.expCode = expCode;
	}
	public String getExpName() {
		return expName;
	}
	public void setExpName(String expName) {
		this.expName = expName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDelMark() {
		return delMark;
	}
	public void setDelMark(int delMark) {
		this.delMark = delMark;
	}
}

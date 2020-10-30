package com.neuedu.demoweb.domain.entity;

public class Department {
	private int id;
	private String deptCode;
	private String deptName;
	private int deptCategoryID;
	private int deptType;
	private int delMark=1;
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", deptCode=" + deptCode + ", deptName=" + deptName + ", deptCategoryID="
				+ deptCategoryID + ", deptType=" + deptType + ", delMark=" + delMark + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptCategoryID() {
		return deptCategoryID;
	}
	public void setDeptCategoryID(int deptCategoryID) {
		this.deptCategoryID = deptCategoryID;
	}
	public int getDeptType() {
		return deptType;
	}
	public void setDeptType(int deptType) {
		this.deptType = deptType;
	}
	public int getDelMark() {
		return delMark;
	}
	public void setDelMark(int delMark) {
		this.delMark = delMark;
	}
	
	
	

}

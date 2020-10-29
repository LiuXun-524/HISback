package com.neuedu.demoweb.domain.entity;

public class ConstantType {
	private int id;
	private String constantTypeCode;
	private String constantTypeName;
	private int delMark=1;
	
	@Override
	public String toString() {
		return "ConstantType [id=" + id + ", constantTypeCode=" + constantTypeCode + ", constantTypeName="
				+ constantTypeName + ", delMark=" + delMark + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConstantTypeCode() {
		return constantTypeCode;
	}
	public void setConstantTypeCode(String constantTypeCode) {
		this.constantTypeCode = constantTypeCode;
	}
	public String getConstantTypeName() {
		return constantTypeName;
	}
	public void setConstantTypeName(String constantTypeName) {
		this.constantTypeName = constantTypeName;
	}
	public int getDelMark() {
		return delMark;
	}
	public void setDelMark(int delMark) {
		this.delMark = delMark;
	}
	
	
	

}

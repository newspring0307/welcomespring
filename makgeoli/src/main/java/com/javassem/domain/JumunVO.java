package com.javassem.domain;

import java.sql.Date;

public class JumunVO {
	private int jumunNo;
	private String id;
	private String jumunFirstName;
	private Date regDate;
	private int jumunAmount;
	private int jumunSum;
	public JumunVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JumunVO(int jumunNo, String id, String jumunFirstName, Date regDate, int jumunAmount, int jumunSum) {
		super();
		this.jumunNo = jumunNo;
		this.id = id;
		this.jumunFirstName = jumunFirstName;
		this.regDate = regDate;
		this.jumunAmount = jumunAmount;
		this.jumunSum = jumunSum;
	}
	public int getJumunNo() {
		return jumunNo;
	}
	public void setJumunNo(int jumunNo) {
		this.jumunNo = jumunNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getJumunFirstName() {
		return jumunFirstName;
	}
	public void setJumunFirstName(String jumunFirstName) {
		this.jumunFirstName = jumunFirstName;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getJumunAmount() {
		return jumunAmount;
	}
	public void setJumunAmount(int jumunAmount) {
		this.jumunAmount = jumunAmount;
	}
	public int getJumunSum() {
		return jumunSum;
	}
	public void setJumunSum(int jumunSum) {
		this.jumunSum = jumunSum;
	}
	
	
}

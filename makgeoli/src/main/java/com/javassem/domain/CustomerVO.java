package com.javassem.domain;


//VO(Value Object) : 테이블 구조와 유사 (한 테이블에 하나의 VO)

public class CustomerVO {

	private int cus_no;
	private String name;
	private String id;
	private String pw;
	private String birth;
	private String tel;
	public CustomerVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerVO(int cus_no, String name, String id, String pw, String birth, String tel) {
		super();
		this.cus_no = cus_no;
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.birth = birth;
		this.tel = tel;
	}
	public int getCus_no() {
		return cus_no;
	}
	public void setCus_no(int cus_no) {
		this.cus_no = cus_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	

}
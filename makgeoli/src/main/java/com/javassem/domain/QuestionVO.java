package com.javassem.domain;

import java.util.Date;

//VO(Value Object) : 테이블 구조와 유사 (한 테이블에 하나의 VO)

public class QuestionVO {

	private int seq;
	private String id;
	private Date regDate;
	private String title;
	private String content;
	
	
	public QuestionVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QuestionVO(int seq, String id, Date regDate, String title, String content) {
		super();
		this.seq = seq;
		this.id = id;
		this.regDate = regDate;
		this.title = title;
		this.content = content;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}


	
}
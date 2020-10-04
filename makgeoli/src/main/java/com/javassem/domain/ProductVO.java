package com.javassem.domain;

import org.springframework.web.multipart.MultipartFile;

//VO(Value Object) : 테이블 구조와 유사 (한 테이블에 하나의 VO)

public class ProductVO {

	private int productId;
	private String productName;
	private int productPrice;
	private String productInfo;
	private String productUrl;
	private MultipartFile productPhoto;
	public ProductVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductVO(int productId, String productName, int productPrice, String productInfo, String productUrl,
			MultipartFile productPhoto) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productInfo = productInfo;
		this.productUrl = productUrl;
		this.productPhoto = productPhoto;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductInfo() {
		return productInfo;
	}
	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}
	public String getProductUrl() {
		return productUrl;
	}
	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}
	public MultipartFile getProductPhoto() {
		return productPhoto;
	}
	public void setProductPhoto(MultipartFile productPhoto) {
		this.productPhoto = productPhoto;
	}


	
}
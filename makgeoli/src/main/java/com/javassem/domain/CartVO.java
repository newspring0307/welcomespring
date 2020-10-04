package com.javassem.domain;

public class CartVO {
	private int cartId;
	private String id;
	private String name;
	private int productId;
	private String productName;
	private String productPrice;
	private int cartAmount;
	private int money;
	public CartVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartVO(int cartId, String id, String name, int productId, String productName, String productPrice,
			int cartAmount, int money) {
		super();
		this.cartId = cartId;
		this.id = id;
		this.name = name;
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.cartAmount = cartAmount;
		this.money = money;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public int getCartAmount() {
		return cartAmount;
	}
	public void setCartAmount(int cartAmount) {
		this.cartAmount = cartAmount;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}

package com.javassem.dao;

import java.util.List;

import com.javassem.domain.CartVO;

public interface CartDAO {
	
	void insertCart(CartVO vo);
	
	List<CartVO> listCart(String id);
	
	void deleteCart(int cartId);
	
	void deleteCartAll(String id);
	
	void modifyCart(CartVO vo);
	
	int sumMoney(String id);
	int sumAmount(String id);
	
	int countCart(int productId,String userId);
	
	void updateCart(CartVO vo);
}

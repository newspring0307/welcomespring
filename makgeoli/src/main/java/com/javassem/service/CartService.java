package com.javassem.service;

import java.util.List;

import com.javassem.domain.CartVO;

public interface CartService {
	void insertCart(CartVO vo);
	List<CartVO> listCart(String id);
	void deleteCart(int cartId);
	void modifyCart(CartVO vo);
	int sumMoney(String id);
	int sumAmount(String id);
	int countCart(int productId,String id);
	void updateCart(CartVO vo);
	void deleteCartAll(String id);
}

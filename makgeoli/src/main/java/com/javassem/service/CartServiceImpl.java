package com.javassem.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

import com.javassem.dao.BoardDAOImpl;
import com.javassem.dao.CartDAOImpl;
import com.javassem.domain.CartVO;

public class CartServiceImpl implements CartService{

	@Autowired 
	private CartDAOImpl cartDao;
	
	//1.장바구니 추가
	@Override
	public void insertCart(CartVO vo) {
		cartDao.insertCart(vo);		
	}
	//2.장바구니 목록
	@Override
	public List<CartVO> listCart(String id){
		return cartDao.listCart(id);
	}
	//3.장바구니 삭제
	@Override
	public void deleteCart(int cartId) {
		cartDao.deleteCart(cartId);
	}
	@Override
	public void deleteCartAll(String id) {
		cartDao.deleteCartAll(id);
	}
	//4.장바구니 수정
	@Override
	public void modifyCart(CartVO vo) {
		cartDao.modifyCart(vo);
	}
	//5.장바구니 금액 합계
	@Override
	public int sumMoney(String id) {
		return cartDao.sumMoney(id);
	}
	//5.장바구니 금액 합계
	@Override
	public int sumAmount(String id) {
		return cartDao.sumAmount(id);
	}
	//6.장바구니 상품 확인
	@Override
	public int countCart(int productId,String id) {
		return cartDao.countCart(productId , id);
	}
	//7.장바구니 상품 수량 변경
	@Override
	public void updateCart(CartVO vo) {
		cartDao.updateCart(vo);		
	}
}


package com.javassem.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.javassem.domain.CartVO;
import com.javassem.service.CartService;

@Repository
public class CartDAOImpl implements CartService{
	@Inject
	SqlSession sqlSession;
	
	//1.장바구니 추가
	@Override
	public void insertCart(CartVO vo) {
		
		sqlSession.insert("cart.insertCart",vo);		
	}
	//2.장바구니 목록
	@Override
	public List<CartVO> listCart(String id){
		return sqlSession.selectList("cart.listCart",id); 
	}
	//3.장바구니 삭제
	@Override
	public void deleteCart(int cartId) {
		sqlSession.delete("cart.deleteCart",cartId);
	}
	@Override
	public void deleteCartAll(String id) {
		sqlSession.delete("cart.deleteCartAll",id);
	}
	//4.장바구니 수정
	@Override
	public void modifyCart(CartVO vo) {
		sqlSession.update("cart.modifyCart",vo);
	}
	//5.장바구니 금액 합계
	@Override
	public int sumMoney(String id) {
		sqlSession.selectOne("cart.sumMoney",id);
		return sqlSession.selectOne("cart.sumMoney",id);
	}
	//5.장바구니 금액 합계
	@Override
	public int sumAmount(String id) {
		sqlSession.selectOne("cart.sumAmount",id);
		return sqlSession.selectOne("cart.sumAmount",id);
	}
	//6.장바구니 동일한 상품 레코드 확인
	@Override
	public int countCart(int productId,String id) {
		Map<String, Object>map = new HashMap<String,Object>();
		map.put("productId",productId);
		map.put("id", id);
		return sqlSession.selectOne("cart.countCart",map);
	}
	//7.장바구니 상품수량 변경
	@Override
	public void updateCart(CartVO vo) {
		sqlSession.update("cart.updateCart",vo);
		
	}
}

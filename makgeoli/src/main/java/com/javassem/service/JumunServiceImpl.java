package com.javassem.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

import com.javassem.dao.JumunDAOImpl;
import com.javassem.domain.JumunVO;

public class JumunServiceImpl implements JumunService{

	@Autowired 
	private JumunDAOImpl jumunDao;
	
	//1.장바구니 추가
	@Override
	public void insertJumun(JumunVO vo) {
		jumunDao.insertJumun(vo);		
	}
	//2.장바구니 목록
	@Override
	public List<JumunVO> jumunList(String id){
		return jumunDao.jumunList(id);
	}
	//3.장바구니 삭제
	@Override
	public void deleteJumun(int jumunId) {
		jumunDao.deleteJumun(jumunId);
	}
	//4.장바구니 수정
	@Override
	public void modifyJumun(JumunVO vo) {
		jumunDao.modifyJumun(vo);
	}
	
	//6.장바구니 상품 확인
	@Override
	public int countJumun(int productId,String id) {
		return jumunDao.countJumun(productId , id);
	}
	//7.장바구니 상품 수량 변경
	@Override
	public void updateJumun(JumunVO vo) {
		jumunDao.updateJumun(vo);		
	}
}


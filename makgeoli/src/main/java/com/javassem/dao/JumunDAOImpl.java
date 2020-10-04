package com.javassem.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.javassem.domain.JumunVO;
import com.javassem.service.JumunService;

@Repository
public class JumunDAOImpl implements JumunService{
	@Inject
	SqlSession sqlSession;
	
	//1.장바구니 추가
	@Override
	public void insertJumun(JumunVO vo) {
		
		sqlSession.insert("jumun.insertJumun",vo);		
	}
	//2.장바구니 목록
	@Override
	public List<JumunVO> jumunList(String id){
		return sqlSession.selectList("jumun.jumunList",id); 
	}
	//3.장바구니 삭제
	@Override
	public void deleteJumun(int JumunId) {
		sqlSession.delete("jumun.deleteJumun",JumunId);
	}
	//4.장바구니 수정
	@Override
	public void modifyJumun(JumunVO vo) {
		sqlSession.update("jumun.modifyJumun",vo);
	}
	//6.장바구니 동일한 상품 레코드 확인
	@Override
	public int countJumun(int productId,String id) {
		Map<String, Object>map = new HashMap<String,Object>();
		map.put("productId",productId);
		map.put("id", id);
		return sqlSession.selectOne("jumun.countJumun",map);
	}
	//7.장바구니 상품수량 변경
	@Override
	public void updateJumun(JumunVO vo) {
		sqlSession.update("jumun.updateJumun",vo);
		
	}
}

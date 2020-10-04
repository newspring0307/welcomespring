package com.javassem.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javassem.domain.ProductVO;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	//01.상품목록

	public List<ProductVO> listProduct(ProductVO vo){
		return mybatis.selectList("ProductDAO.listProduct", vo);
	}
	//02.상품상세

	public ProductVO detailProduct(ProductVO vo) {
		return mybatis.selectOne("ProductDAO.detailProduct", vo);			
	}
	//03.상품수정

	public void updateProduct(ProductVO vo) {		
	} 
	

	public void deleteProduct(ProductVO vo) {
		
	}
}

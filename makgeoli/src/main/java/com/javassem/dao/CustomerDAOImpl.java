package com.javassem.dao;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javassem.domain.CustomerVO;

@Repository("customerDAO")
public class CustomerDAOImpl implements CustomerDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis; 

	public void insertCustomer(CustomerVO vo) {
		System.out.println("===> Mybatis insertCustomer() 호출");
		mybatis.insert("CustomerDAO.insertCustomer", vo);
	}

	public CustomerVO logInCustomer(CustomerVO vo) {
		System.out.println("===> Mybatis getCustomer() 호출");
		return mybatis.selectOne("CustomerDAO.logInCustomer", vo);
	}
}
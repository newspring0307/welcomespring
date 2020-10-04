package com.javassem.service;



import com.javassem.domain.CustomerVO;



public interface CustomerService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	void insertCustomer(CustomerVO vo);

	CustomerVO logInCustomer(CustomerVO vo);

}

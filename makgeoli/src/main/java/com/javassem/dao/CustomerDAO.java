package com.javassem.dao;


import com.javassem.domain.CustomerVO;

public interface CustomerDAO {
	public void insertCustomer(CustomerVO vo);
//
//	public void updateCustomer(CustomerVO vo) ;
//
//	public void deleteCustomer(CustomerVO vo);

	public CustomerVO logInCustomer(CustomerVO vo) ;
//
//	public List<CustomerVO> getCustomerList(CustomerVO vo) ;
}

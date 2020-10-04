package com.javassem.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javassem.dao.CustomerDAOImpl;
import com.javassem.domain.CustomerVO;


@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired //Resources랑 기능 똑같음.그래도 오토와이어드로 통일
	private CustomerDAOImpl customerDAO;

	public void insertCustomer(CustomerVO vo) {

		customerDAO.insertCustomer(vo);
	}

//	public void updateCustomer(CustomerVO vo) {
//		customerDAO.updateCustomer(vo);
//	}
//
//	public void deleteCustomer(CustomerVO vo) {
//		customerDAO.deleteCustomer(vo);
//	}

	public CustomerVO logInCustomer(CustomerVO vo) {
		return customerDAO.logInCustomer(vo);
	}
//
//	public List<CustomerVO> getCustomerList(CustomerVO vo) {
//		return customerDAO.getCustomerList(vo);
//	}
}
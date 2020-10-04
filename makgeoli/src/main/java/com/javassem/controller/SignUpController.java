package com.javassem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;

import com.javassem.domain.CustomerVO;
import com.javassem.service.CustomerService;


@Controller
@RequestMapping("/signUp")
public class SignUpController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/signUp.do")
	public void test3() {	
	}			
	
	@RequestMapping(value="/signUpSave.do")
	public void test4(CustomerVO vo) {
		customerService.insertCustomer(vo);
		
		
		
	}		
}

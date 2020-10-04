package com.javassem.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.javassem.domain.CustomerVO;
import com.javassem.service.CustomerService;


@Controller
@SessionAttributes("id")
@RequestMapping("/logIn")
public class LogInController {

	@Autowired //@Resource도 알아두기
	private CustomerService customerService;
	
	@RequestMapping(value="/logOut.do")
	public String test4(HttpSession session) throws Exception{
		session=null;
	return "logIn/logIn";
	}
	
	
	@RequestMapping(value="/logIn.do")
	public void test2() {		
	}	
	
	
	@RequestMapping(value="/logInCheck.do")
	public String test3(CustomerVO vo, HttpSession session) throws Exception{
		try {
		    String id=vo.getId();
		    String pw=vo.getPw();
			CustomerVO result = customerService.logInCustomer(vo);				
			
			if(id.equals(result.getId()) && pw.equals(result.getPw())){
		         session.setAttribute("id",id);
		    }	
		}
		catch(Exception e){ 
			session.setAttribute("id",null);			
			return "logIn/logIn";
		} 
		return "redirect:/";
	}
	
//	@RequestMapping(value="/logOut.do")
//	public String test4(HttpSession session) throws Exception{
//		session.invalidate();
//		
//		return "redirect:/";
//	}
	
}

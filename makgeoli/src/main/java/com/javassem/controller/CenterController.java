package com.javassem.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/center")
public class CenterController {

	
	@RequestMapping(value="/center.do")
	public void test1() {	
	}	
	@RequestMapping(value="/center1.do")
	public void test2() {	
	}	
	@RequestMapping(value="/center2.do")
	public void test3() {	
	}	
	@RequestMapping(value="/center3.do")
	public void test4() {	
	}		
}

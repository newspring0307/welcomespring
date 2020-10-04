package com.javassem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javassem.domain.ProductVO;
import com.javassem.service.ProductService;


@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired //@Resource도 알아두기
	private ProductService productService; //자동으로 주입
	
	@RequestMapping("/productList.do")
	public void test1(ProductVO vo, Model m) {
		System.out.println("1");
	
		//boardService.getBoardList(BoardVO vo, Model m);를 대신하는게 위의 매개변수..?잘 모르겠음
		//BoardVO vo : 이전 화면에서 넘어오는 파라미터 저장(현재는 데이터 없음)
		//Model m : 뷰단으로 데이터 전송할 때 필요한 객체
		List<ProductVO> result = productService.listProduct(vo);
		System.out.println("2");
		m.addAttribute("productList",result); //이렇게하거나 result대신 boardService.getBoardList(vo)넣거나.(한번쓸때)
	}	
	//2.상품 상세보기
	
	@RequestMapping("/productDetail.do")
	public void detail(ProductVO vo , Model m) {
		ProductVO result = productService.detailProduct(vo);
		m.addAttribute("productDetail",result);
	}

		
//	//1.상품 전체 목록
//	@RequestMapping("/toCart.do")
//	public String list() {
//		mav.setViewName("/product/productList");
//		mav.addObject("list",productService.listProduct());
//		return mav;
//		}
	}

	
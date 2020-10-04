package com.javassem.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.javassem.domain.CartVO;
import com.javassem.domain.QuestionVO;
import com.javassem.service.CartService;


@Controller
@RequestMapping("/cart")
public class CartController {
	
	
	@Autowired
	CartService cartService;
	//1.장바구니 추가
	@RequestMapping("/cartInsert.do")
	public String insert( CartVO vo, HttpSession session) {

		System.out.println("1");
		String id = (String) session.getAttribute("id");
		
		vo.setId(id);
		
		//장바구니에 기존 상품이 있는지 검사
		int count = cartService.countCart(vo.getProductId(),id);

		System.out.println(count);
		if(count==0) {
			//없으면 insert
			cartService.insertCart(vo);

			System.out.println("추가되었습니다.");
		}else {

			cartService.updateCart(vo);

			System.out.println("갯수가 수정되었습니다.");
		}
		return "cart/cartSave";
		
	
	
	}
	//2.장바구니 목록
	@RequestMapping("/getCartList.do")
	public ModelAndView list(HttpSession session, ModelAndView mav) {
		String id = (String)session.getAttribute("id");//세션에 저장된 유저아이디
		Map<String, Object>map = new HashMap<String,Object>();
		List<CartVO> list = cartService.listCart(id);//장바구니 정보
		int sumMoney = cartService.sumMoney(id);//장바구니 전체금액 호출
		int fee = sumMoney >=100000? 0:3000;
		int sumAmount = cartService.sumAmount(id);//장바구니 전체금액 호출
		map.put("list", list); //장바구니 정보 맵에 저장
		map.put("count", list.size()); //장바구니 상품 유므
		map.put("sumMoney", sumMoney);//장바구니 전체 금액
		map.put("fee", fee); //배송 금액
		map.put("allSum", sumMoney+fee); //주문 상품 전체 금액
		map.put("allAmount", sumAmount); //주문 상품 전체 금액
		mav.setViewName("cart/cartList"); //뷰(jsp) 이름 저장
		mav.addObject("map", map); //맵 변수 저장
		return mav;
	}
	
	//3.장바구니 삭제
	@RequestMapping("/deleteCart.do")
	public String delete(@RequestParam int cartId) {
		System.out.println("삭제 전");
		cartService.deleteCart(cartId);
		return "redirect:../cart/getCartList.do";
	}
	//4.장바구니 수정
	@RequestMapping("/updateCart.do")
	public String update(@RequestParam int[] cartAmount, @RequestParam int[] productId, HttpSession session) {
		//session의 아이디
		String id = (String)session.getAttribute("id");
		//레코드의 갯수만큼 반복문 실행
		for(int i=0; i<productId.length; i++) {
			CartVO vo = new CartVO();
			vo.setId(id);
			vo.setCartAmount(cartAmount[i]);
			vo.setProductId(productId[i]);
			cartService.modifyCart(vo);
		}
		return "redirect:/cart/cartList.do";
	}
}

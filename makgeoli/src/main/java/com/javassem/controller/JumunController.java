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

import com.javassem.domain.BoardVO;
import com.javassem.domain.CartVO;
import com.javassem.domain.JumunVO;
import com.javassem.domain.ProductVO;
import com.javassem.domain.QuestionVO;
import com.javassem.service.CartService;
import com.javassem.service.JumunService;


@Controller
@RequestMapping("/jumun")
public class JumunController {
	
	
	@Autowired
	CartService cartService;
	@Autowired
	JumunService jumunService;
	//1.장바구니 추가
	@RequestMapping("/jumunInsert.do")
	public String insert( JumunVO vo, HttpSession session) {

		System.out.println("1");
		String id = (String) session.getAttribute("id");
		System.out.println("2");
		
		vo.setId(id);

		System.out.println("3.아이디 들어감");
		jumunService.insertJumun(vo);
		System.out.println("주문되었습니다.");
		cartService.deleteCartAll(id);
		return "jumun/jumunSave";	
	}
	
	
	@RequestMapping("/getJumunList.do")
	public String test1(JumunVO vo, Model m, HttpSession session) {
		System.out.println("1");
		String id = (String) session.getAttribute("id");
		
		vo.setId(id);
		//boardService.getBoardList(BoardVO vo, Model m);를 대신하는게 위의 매개변수..?잘 모르겠음
		//BoardVO vo : 이전 화면에서 넘어오는 파라미터 저장(현재는 데이터 없음)
		//Model m : 뷰단으로 데이터 전송할 때 필요한 객체
		List<JumunVO> result = jumunService.jumunList(id);
		System.out.println("2");
		m.addAttribute("jumunList",result); //이렇게하거나 result대신 boardService.getBoardList(vo)넣거나.(한번쓸때)
		return "jumun/jumunList";
	}	
}
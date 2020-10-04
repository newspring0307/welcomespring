package com.javassem.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javassem.domain.BoardVO;
import com.javassem.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired //@Resource도 알아두기
	private BoardService boardService; //자동으로 주입
	
	@RequestMapping("/{step}.do")
	public String viewPage(@PathVariable String step) {		
		return step;
	}

	@RequestMapping("/getBoard.do")
	public void getBoard(BoardVO vo,Model m) {
		BoardVO result = boardService.getBoard(vo);
		m.addAttribute("board",result);
	}
	

	
	@RequestMapping("/saveBoard.do")
	public String saveBoard(BoardVO vo) {
		boardService.insertBoard(vo);
	
		return "redirect:/getBoardList.do"; //그냥 return "boardList"를 하면 데이터를 갖고가지 못함. 단순 jsp출력
		//리다이렉트 -> 사용자 url을 변경시킴
	}
	
	
	@RequestMapping("/getBoardList.do")
	public void getBoardList(BoardVO vo, Model m) {
		
		//boardService.getBoardList(BoardVO vo, Model m);를 대신하는게 위의 매개변수..?잘 모르겠음
		//BoardVO vo : 이전 화면에서 넘어오는 파라미터 저장(현재는 데이터 없음)
		//Model m : 뷰단으로 데이터 전송할 때 필요한 객체
		List<BoardVO> result = boardService.getBoardList(vo);
		m.addAttribute("boardList",result); //이렇게하거나 result대신 boardService.getBoardList(vo)넣거나.(한번쓸때)
	}	
	
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		
		boardService.deleteBoard(vo);
		//boardService.getBoardList(BoardVO vo, Model m);를 대신하는게 위의 매개변수..?잘 모르겠음
		//BoardVO vo : 이전 화면에서 넘어오는 파라미터 저장(현재는 데이터 없음)
		//Model m : 뷰단으로 데이터 전송할 때 필요한 객체
		return "redirect:/getBoardList.do";
	}


}

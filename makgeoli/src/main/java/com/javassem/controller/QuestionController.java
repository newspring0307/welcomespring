package com.javassem.controller;

import java.util.List;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javassem.domain.QuestionVO;
import com.javassem.service.QuestionService;

@Controller
@RequestMapping("/question")
public class QuestionController {

	@Autowired //@Resource도 알아두기
	private QuestionService questionService; //자동으로 주입
	
	@RequestMapping(value="/questionList.do")
	public void test1(QuestionVO vo, Model m) {	

	List<QuestionVO> result = questionService.getQuestionList(vo);
	m.addAttribute("questionList",result); //이렇게하거나 result대신 boardService.getBoardList(vo)넣거나.(한번쓸때)
	}
	
	@RequestMapping(value="/questionWrite.do")
	public String test2(HttpSession session,Model model) throws Exception{
		Object logInfo = session.getAttribute("id");
		if(logInfo == null) {
			 return "redirect:/logIn/logIn.do";
			}
		else {
			return "redirect:/question/questionWritePage.do";
		}
	}
	
	@RequestMapping(value="/questionSave.do")
	public String test3(QuestionVO vo) {	
		questionService.insertQuestion(vo);	
		return "redirect:/question/questionList.do"; 
	}
	
	@RequestMapping(value="/questionWritePage.do")
	public void test4(QuestionVO vo) {	
	}
	

	@RequestMapping("/deleteQuestion.do")
	public String deleteQuestion(QuestionVO vo) {
		
		questionService.deleteQuestion(vo);
		return "redirect:/question/questionList.do";
	}
	@RequestMapping("/updateQuestion.do")
	public String updateQuestion(QuestionVO vo) {
		
		questionService.updateQuestion(vo);
		return "redirect:/question/questionList.do";
	}


	@RequestMapping("/getQuestion.do")
	public void getQuestion(QuestionVO vo,Model m) {
		QuestionVO result = questionService.getQuestion(vo);
		m.addAttribute("question",result);
	}
	@RequestMapping("/questionBack.do")
	public String getQuestion() {
		return "redirect:/center/center.do";
	}
}		


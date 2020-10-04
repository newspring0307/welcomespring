package com.javassem.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javassem.domain.QuestionVO;

@Repository("questionDAO")
public class QuestionDAOImpl implements QuestionDAO{
	
	@Autowired //자동으로 주입하ㅏㄹ수있게하는 스티커
	private SqlSessionTemplate mybatis; //스프링이 만든다음에 나한테 주입

	public void insertQuestion(QuestionVO vo) {
		System.out.println("===> Mybatis insertQuestion() 호출");
		mybatis.insert("QuestionDAO.insertQuestion", vo);
	}

	public void updateQuestion(QuestionVO vo) {
		System.out.println("===> Mybatis updateQuestion() 호출");
		mybatis.update("QuestionDAO.updateQuestion", vo);
	}

	public void deleteQuestion(QuestionVO vo) {
		System.out.println("===> Mybatis deleteQuestion() 호출");
		mybatis.delete("QuestionDAO.deleteQuestion", vo);
	}

	public QuestionVO getQuestion(QuestionVO vo) {
		System.out.println("===> Mybatis getQuestion() 호출");
		return mybatis.selectOne("QuestionDAO.getQuestion", vo);
	}

	public List<QuestionVO> getQuestionList(QuestionVO vo) {
		System.out.println("===> Mybatis getQuestionList() 호출");
		return mybatis.selectList("QuestionDAO.getQuestionList", vo);
	}
}
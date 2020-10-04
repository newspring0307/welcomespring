package com.javassem.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javassem.dao.QuestionDAOImpl;
import com.javassem.domain.QuestionVO;


@Service("questionService")
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired //Resources랑 기능 똑같음.그래도 오토와이어드로 통일
	private QuestionDAOImpl QuestionDAO;

	public void insertQuestion(QuestionVO vo) {

		QuestionDAO.insertQuestion(vo);
	}

	public void updateQuestion(QuestionVO vo) {
		QuestionDAO.updateQuestion(vo);
	}

	public void deleteQuestion(QuestionVO vo) {
		QuestionDAO.deleteQuestion(vo);
	}

	public QuestionVO getQuestion(QuestionVO vo) {
		return QuestionDAO.getQuestion(vo);
	}

	public List<QuestionVO> getQuestionList(QuestionVO vo) {
		return QuestionDAO.getQuestionList(vo);
	}
}
package com.javassem.dao;

import java.util.List;


import com.javassem.domain.QuestionVO;

public interface QuestionDAO {
	public void insertQuestion(QuestionVO vo);

	public void updateQuestion(QuestionVO vo) ;

	public void deleteQuestion(QuestionVO vo);

	public QuestionVO getQuestion(QuestionVO vo) ;

	public List<QuestionVO> getQuestionList(QuestionVO vo) ;
}

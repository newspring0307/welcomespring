package com.javassem.service;

import java.util.List;


import com.javassem.domain.QuestionVO;



public interface QuestionService {
	// CRUD 기능의 메소드 구현
	// 글 등록
	void insertQuestion(QuestionVO vo);

	// 글 수정
	void updateQuestion(QuestionVO vo);

	// 글 삭제
	void deleteQuestion(QuestionVO vo);

	// 글 상세 조회
	QuestionVO getQuestion(QuestionVO vo);

	// 글 목록 조회
	List<QuestionVO> getQuestionList(QuestionVO vo);
}

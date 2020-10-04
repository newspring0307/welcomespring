package com.javassem.service;

import java.util.List;

import com.javassem.domain.JumunVO;

public interface JumunService {
	void insertJumun(JumunVO vo);
	List<JumunVO> jumunList(String id);
	void deleteJumun(int JumunId);
	void modifyJumun(JumunVO vo);
	int countJumun(int productId,String id);
	void updateJumun(JumunVO vo);
}

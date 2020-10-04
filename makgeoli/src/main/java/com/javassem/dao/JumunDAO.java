package com.javassem.dao;

import java.util.List;

import com.javassem.domain.JumunVO;

public interface JumunDAO {
	
	void insertJumun(JumunVO vo);
	
	List<JumunVO> jumunList(String id);
	
	void deleteJumun(int JumunId);
	
	void modifyJumun(JumunVO vo);
	
	int sumJumunMoney(String id);
	
	int countJumun(int productId,String id);
	
	void updateJumun(JumunVO vo);
}

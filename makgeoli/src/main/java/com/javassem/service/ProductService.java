package com.javassem.service;

import java.util.List;

import com.javassem.domain.ProductVO;

public interface ProductService {

	// 글 수정
	void updateProduct(ProductVO vo);
	
	ProductVO detailProduct(ProductVO vo);

	void deleteProduct(ProductVO vo);

	List<ProductVO> listProduct(ProductVO vo);




}

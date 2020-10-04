package com.javassem.dao;

import java.util.List;


import com.javassem.domain.ProductVO;

public interface ProductDAO {

	void updateProduct(ProductVO vo);

	void deleteProduct(ProductVO vo);

	List<ProductVO> listProduct(ProductVO vo);

	ProductVO detailProduct(ProductVO vo);

}

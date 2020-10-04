package com.javassem.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javassem.dao.ProductDAO;
import com.javassem.dao.ProductDAOImpl;
import com.javassem.domain.ProductVO;


@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired 
	private ProductDAOImpl productDAO;
	

	public List<ProductVO> listProduct(ProductVO vo){
		return productDAO.listProduct(vo);
	}
	
	public ProductVO detailProduct(ProductVO vo) {
		return productDAO.detailProduct(vo);
	}
	

	public void updateProduct(ProductVO vo) {
		
	}

	public void deleteProduct(ProductVO vo) {
		
	}

	

}
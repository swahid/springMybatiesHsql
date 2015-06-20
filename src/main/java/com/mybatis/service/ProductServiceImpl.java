package com.mybatis.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mybatis.domain.Product;
import com.mybatis.persistance.ProductMapper;

public class ProductServiceImpl implements ProductService{

	@Autowired
	public ProductMapper productMapper;

	public void setProductMapper(ProductMapper productMapper) {
		this.productMapper = productMapper;
	}



	@Transactional
	public void insert(Product p){
		System.out.print("get data"+p.getPname());
		productMapper.insert(p);
		System.out.print("insert sucessfully");
	}


	@Transactional
	public Product getProductById(int id){
	return	productMapper.getProductById(id);
	}

	@Transactional
	public List<Product> getAllProduct(){
		return this.productMapper.getAllProduct();
	}



	@Transactional
	public void update(Product p) {
		this.productMapper.update(p);
		
	}



	@Transactional
	public void delete(Product p) {
		this.productMapper.delete(p);
		
	}
	
}

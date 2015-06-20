package com.mybatis.service;

import java.util.List;

import com.mybatis.domain.Product;

public interface ProductService {


	public void insert(Product p);
	public void update(Product p);
	public void delete(Product p);
	public List<Product> getAllProduct();
	public Product getProductById(int id);
}

package com.mb.dao;

import java.util.List;

import com.mb.entity.Product;

public interface ProductDao {
	public Product saveProduct(Product product);
	
	public List<Product>  findProducts();

}

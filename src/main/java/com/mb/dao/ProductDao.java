package com.mb.dao;

import java.util.List;

import com.mb.dto.ProductDto;
import com.mb.entity.Product;

public interface ProductDao {
	public Product saveProduct(ProductDto productDto);
	
	public List<Product>  findProducts();

}

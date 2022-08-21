package com.mb.service;

import java.util.List;

import com.mb.dto.ProductDto;
import com.mb.entity.Product;

public interface ProductService
{
//
//	public List<Product> search(String keyword);

	public Product save(ProductDto product);


	public List<Product>  getProductList();

}

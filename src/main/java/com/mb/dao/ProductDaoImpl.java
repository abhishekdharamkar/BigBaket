package com.mb.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mb.entity.Product;
import com.mb.exception.CustomException;
import com.mb.exception.ErrorCode;
import com.mb.repository.ProductRepository;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product saveProduct(Product product) {
		
		try {
			return productRepository.save(product);
			
		}catch(Exception e) {
			throw new CustomException("Error while saving Product", ErrorCode.INTERNAL_SERVER_ERROR);
		}
	}
	@Override
	public List<Product> findProducts() {
		
		return productRepository.findAll();
	}

}

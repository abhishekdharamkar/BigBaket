package com.mb.dao;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mb.dto.ProductDto;
import com.mb.entity.Category;
import com.mb.entity.Product;
import com.mb.exception.CustomException;
import com.mb.exception.ErrorCode;
import com.mb.repository.CategoryRepository;
import com.mb.repository.ProductRepository;
import java.util.Optional;
@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private CategoryRepository categoryRepository;
	@Override
	public Product saveProduct(ProductDto product) {
		
//		if (productRepository.existsById(product.getId()))
//		{
//			throw new CustomException("Product Already Exist",ErrorCode.INTERNAL_SERVER_ERROR);
//		}
		System.out.println("qwert"+categoryRepository.findById(product.getCategoryId()));

		Optional<Category> optionalCategory = categoryRepository.findById(product.getCategoryId());
	//  Optional<Show> optionalShow = showRepository.findById(bookingDetailDto.getShowId());
		Category category = optionalCategory.get();
		Product newProduct = new Product();
		
		newProduct = modelMapper.map(product, Product.class);
		newProduct.setCategory(category);
		try {
			System.out.println(""+newProduct);
			return productRepository.save(newProduct);
			
		}catch(Exception e) {
			throw new CustomException("Error while saving Product", ErrorCode.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public List<Product> findProducts() {
		
		return productRepository.findAll();
	}

}

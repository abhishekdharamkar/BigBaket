package com.mb.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.dao.ProductDao;
import com.mb.dto.ProductDto;
import com.mb.entity.Category;
import com.mb.entity.Product;
import com.mb.repository.CategoryRepository;
import com.mb.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService
{
	

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private ProductDao productDao;
	@Autowired
	private ProductRepository productRepo;
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Product> search(String name)
	{
		if (name != null)
		{
			return productRepo.findByProductname(name);
		}
		return productRepo.findAll();
	}

	@Override
	public Product save(ProductDto productDto)
	{
	
//		Product p = new Product();
//		p = modelMapper.map(productDto, Product.class);
		Optional<Category> optionalCategory = categoryRepository.findById(productDto.getCategoryId());
		Category category = optionalCategory.get();
		Product newProduct;
		
		newProduct = modelMapper.map(productDto, Product.class);
		newProduct.setCategory(category);
		
		return productDao.saveProduct(newProduct);
		 
	}

	
	@Override
	public List<Product> getProductList()
	{

		return productDao.findProducts();
	}
}

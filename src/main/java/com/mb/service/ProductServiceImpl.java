package com.mb.service;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.dao.ProductDao;
import com.mb.dto.ProductDto;
import com.mb.entity.Product;
import com.mb.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService
{
	

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private ProductDao productDao;

//	@Override
//	public List<Product> search(String keyword)
//	{
//		if (keyword != null)
//		{
//			return productRepo.search(keyword);
//		}
//		return productRepo.findAll();
//	}

	@Override
	public Product save(ProductDto productDto)
	{
		System.out.println("productDTO"+productDto);
//		Product p = new Product();
//		p = modelMapper.map(productDto, Product.class);
		return productDao.saveProduct(productDto);
		 
	}

	
	@Override
	public List<Product> getProductList()
	{

		return productDao.findProducts();
	}
}

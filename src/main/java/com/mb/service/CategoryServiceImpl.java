package com.mb.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.dao.CategoryDao;
import com.mb.dto.CategoryDto;
import com.mb.entity.Category;
import com.mb.entity.Product;

@Service
public class CategoryServiceImpl implements CategoryService {

	
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public Category save(CategoryDto categoryDto) {
		
		Category category=modelMapper.map(categoryDto, Category.class);
		return categoryDao.save(category);
	}

}

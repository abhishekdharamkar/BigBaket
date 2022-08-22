package com.mb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.dao.CategoryDao;
import com.mb.entity.Category;
import com.mb.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	
	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public String save(Category c) {
		return categoryDao.save(c);
	}

}

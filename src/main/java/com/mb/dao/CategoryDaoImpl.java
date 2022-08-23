package com.mb.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mb.entity.Category;
import com.mb.exception.CustomException;
import com.mb.exception.ErrorCode;
import com.mb.repository.CategoryRepository;

@Repository
public class CategoryDaoImpl implements CategoryDao{

	@Autowired
	private CategoryRepository categoryRepo;
	
	@Override
	public Category save(Category c) {
		try {
			
		return categoryRepo.save(c);
		
			
		}catch(Exception e) {
			throw new CustomException("Error while saving Category", ErrorCode.INTERNAL_SERVER_ERROR);
		}
	}

	
}

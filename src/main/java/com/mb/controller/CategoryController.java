package com.mb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mb.dto.CategoryDto;

import com.mb.response.ResponseMaker;
import com.mb.response.SuccessResponse;
import com.mb.service.CategoryService;

import static com.mb.constants.UrlConstants.BASE_URL;
import static com.mb.constants.UrlConstants.CATEGORY;

@RestController
@RequestMapping(BASE_URL)
@CrossOrigin(origins = "*")
public class CategoryController {

	@Autowired
	private CategoryService category;
	
	@Autowired
	private ResponseMaker responseMaker;
	
	@PostMapping(CATEGORY)
	public ResponseEntity<SuccessResponse<String>> category(@RequestBody CategoryDto categoryDto)
	{
		category.save(categoryDto);
		return responseMaker.successResponse("saved", HttpStatus.CREATED);
	}
}

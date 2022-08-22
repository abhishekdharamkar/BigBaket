package com.mb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mb.entity.Category;
import com.mb.entity.Product;
import com.mb.response.ResponseMaker;
import com.mb.response.SuccessResponse;
import com.mb.service.CategoryService;
import static com.mb.constants.UrlConstants.CATEGORY;

@RestController
public class CategoryController extends BaseController {

	@Autowired
	private CategoryService category;
	
	@Autowired
	private ResponseMaker responseMaker;
	
	@PostMapping(CATEGORY)
	public ResponseEntity<SuccessResponse<String>> category(@RequestBody Category p)
	{
		 category.save(p);
		return responseMaker.successResponse("saved", HttpStatus.CREATED);
	}
}

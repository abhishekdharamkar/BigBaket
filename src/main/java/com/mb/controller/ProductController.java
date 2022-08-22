package com.mb.controller;

import static com.mb.constants.UrlConstants.PRODUCT;
import static com.mb.constants.UrlConstants.SEARCH;
import static com.mb.constants.UrlConstants.PRODUCTS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mb.dto.ProductDto;
import com.mb.entity.Product;
import com.mb.response.ResponseMaker;
import com.mb.response.SuccessResponse;
import com.mb.service.ProductService;
@RestController
public class ProductController extends BaseController
{

	@Autowired
	private ProductService productService;
	
	
	@Autowired
	private ResponseMaker responseMaker;
	
	@GetMapping(PRODUCTS)
	public ResponseEntity<List<Product>> findProducts()
	{
	 return new ResponseEntity<>(productService.getProductList(), HttpStatus.OK);
	}

	/* This Method Is Use To Save The Multiple product In future */
	@PostMapping(PRODUCT)
	public ResponseEntity<SuccessResponse<Product>> saveProduct(@RequestBody ProductDto productDto)
	{
		Product product= productService.save(productDto);
		return responseMaker.successResponse(product, HttpStatus.CREATED);
	}

	@GetMapping(SEARCH)
	public List<Product> Search(@PathVariable(name = "keyword") String keyword)
	{
		System.out.println(keyword+"keyword...........................................................................................");
		List<Product> listProducts = productService.search(keyword);
		System.out.println(listProducts+"//////////////////");
		return listProducts;
	}


}

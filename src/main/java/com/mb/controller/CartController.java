package com.mb.controller;
import static com.mb.constants.UrlConstants.BASE_URL;
import static com.mb.constants.UrlConstants.CHECKOUT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mb.dto.CartDto;
import com.mb.response.ResponseMaker;
import com.mb.response.SuccessResponse;
import com.mb.service.CartService;

@RestController
@RequestMapping(BASE_URL)
@CrossOrigin(origins = "*")
public class CartController{

	@Autowired
	private CartService cartService;
	
	@Autowired
	private ResponseMaker responseMaker;
	
	@PostMapping(CHECKOUT)
	public ResponseEntity<SuccessResponse<String>> checkout(@RequestBody CartDto cartDto) {
		
		cartService.save(cartDto);
		return responseMaker.successResponse("success", HttpStatus.CREATED);
	}
}

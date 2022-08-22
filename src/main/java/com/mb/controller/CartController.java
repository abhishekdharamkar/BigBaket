package com.mb.controller;
import static com.mb.constants.UrlConstants.CHECKOUT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mb.dto.CartDto;
import com.mb.entity.Cart;
import com.mb.response.ResponseMaker;
import com.mb.response.SuccessResponse;
import com.mb.service.CartService;

@RestController
public class CartController extends BaseController {

	@Autowired
	private CartService cartService;
	
	@Autowired
	private ResponseMaker responseMaker;
	
	@PostMapping(CHECKOUT)
	public ResponseEntity<SuccessResponse<Cart>> Checkout(@RequestBody CartDto cartDto) {
		
		Cart cart= cartService.save(cartDto);
		return responseMaker.successResponse(cart, HttpStatus.CREATED);
	}
}

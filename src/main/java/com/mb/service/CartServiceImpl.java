package com.mb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.dao.CartDao;
import com.mb.dto.CartDto;
import com.mb.entity.Cart;

import io.swagger.v3.oas.annotations.servers.Server;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDao cartDao;
	
	@Override
	public Cart save(CartDto cartDto) {
		
		return cartDao.save(cartDto);
	}

}

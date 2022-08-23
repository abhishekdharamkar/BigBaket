package com.mb.dao;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mb.dto.CartDto;
import com.mb.entity.Cart;
import com.mb.exception.CustomException;
import com.mb.exception.ErrorCode;
import com.mb.repository.CartRepository;


@Repository
public class CartDaoImpl implements CartDao {
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public Cart save(CartDto cartDto) {
		Cart newCart;
		newCart = modelMapper.map(cartDto, Cart.class);
		try {
			return cartRepository.save(newCart);
			
		}catch(Exception e) {
			throw new CustomException("Error while saving Product", ErrorCode.INTERNAL_SERVER_ERROR);
		}
	}
}

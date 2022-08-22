package com.mb.dao;

import com.mb.dto.CartDto;
import com.mb.entity.Cart;

public interface CartDao {

	public Cart save(CartDto cartDto);
}

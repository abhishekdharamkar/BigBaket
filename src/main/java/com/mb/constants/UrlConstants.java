package com.mb.constants;

public class UrlConstants {


	private UrlConstants()
	{
		throw new IllegalStateException("Constants class.can't instatiate");
	}

	public static final String BASE_URL = "/api/v1";
	public static final String PRODUCT = "/product";
	public static final String PRODUCTS = "/products";
	public static final String CHECKOUT = "/checkout";
	public static final String CATEGORY ="/category";
	public static final String SEARCH ="/product/search";
}

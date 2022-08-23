package com.mb.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.mb.entity.Category;

public class ProductDto
{
	@NotBlank(message = "Name is mandatory")
	private String productname; //need to change the name

	@NotNull
	private double productprice;

	@NotNull
	private long categoryId;
	
	private String imageUrl;

	public String getProductname() {
		return productname;
	}

	public double getProductprice() {
		return productprice;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	@Override
	public String toString() {
		return "ProductDto [productname=" + productname + ", productprice=" + productprice + ", categoryId="
				+ categoryId + ", imageUrl=" + imageUrl + "]";
	}

	
	

}

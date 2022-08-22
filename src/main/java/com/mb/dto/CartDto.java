package com.mb.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CartDto
{
	
	@NotEmpty
	private String email;
	
	@NotEmpty
	private String items;
	
	@NotEmpty
	private String date;
	
	@NotNull
	private double total;

	public CartDto()
	{
	}

	public String getEmail() {
		return email;
	}

	public String getItems() {
		return items;
	}

	public String getDate() {
		return date;
	}

	public double getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return "CartDto [email=" + email + ", items=" + items + ", date=" + date + ", total=" + total + "]";
	}

	
	

}

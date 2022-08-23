package com.mb.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CartDto
{
	
	@NotBlank
	private String email;
	
	@NotBlank
	private String items;
	
	@NotBlank
	private Date date;
	
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

	public Date getDate() {
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

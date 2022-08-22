package com.mb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mb.controller.BaseController;

@Entity
@Table(name="carts")
public class Cart extends BaseController {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String email;
	
	private String items;
	
	private double total;
	
	private String date;
	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public Cart() {
		
	}

	

	@Override
	public String toString() {
		return "Cart [id=" + id + ", email=" + email + ", items=" + items + ", total=" + total + "]";
	}
	
	
	
	
}

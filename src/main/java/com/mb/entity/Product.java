package com.mb.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mb.audit.Auditable;

@Entity
@Table(name = "Product_List")
public class Product extends Auditable
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String productname;

	private double productprice;
	
	private String imageUrl;

//	@JsonIgnore
//	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
//	@JoinColumn(name = "category_id", nullable = false)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id", nullable = false, updatable = false)
	private Category category;

	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getProductname()
	{
		return productname;
	}

	public void setProductname(String productname)
	{
		this.productname = productname;
	}

	
	public double getProductprice()
	{
		return productprice;
	}

	public void setProductprice(double productprice)
	{
		this.productprice = productprice;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Product()
	{

	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productname=" + productname + ", productprice=" + productprice + ", imageUrl="
				+ imageUrl + ", category=" + category + "]";
	}
	
}

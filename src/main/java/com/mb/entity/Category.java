package com.mb.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;
    
    @NotEmpty
    @Column
    @Size (max = 25)
    private String name;
  //Here mappedBy indicates that the owner is in the other side
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "category", cascade = CascadeType.ALL)
//    private Set<Product> products = new HashSet<Product>();

    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public Set<Product> getProducts() {
//		return products;
//	}
//	public void setProducts(Set<Product> products) {
//		this.products = products;
//	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
}

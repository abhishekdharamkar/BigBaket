package com.mb.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mb.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>
{
	@Query("SELECT p FROM Product p WHERE CONCAT(p.productname) LIKE %?1%")
	public List<Product> findByProductname(String name);

	
}

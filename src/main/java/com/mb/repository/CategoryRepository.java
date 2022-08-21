package com.mb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mb.entity.Category;
import com.mb.entity.Product;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

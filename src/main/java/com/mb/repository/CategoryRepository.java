package com.mb.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.mb.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

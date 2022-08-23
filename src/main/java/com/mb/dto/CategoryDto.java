package com.mb.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CategoryDto {

	
	 @NotBlank
	 @Size (max = 25)
	 private String name;

	 public CategoryDto() {
		 
	 }
	public String getName() {
		return name;
	}

	
	@Override
	public String toString() {
		return "CategoryDto [name=" + name + "]";
	}

	 
}

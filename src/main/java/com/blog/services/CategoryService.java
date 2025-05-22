 package com.blog.services;

import java.util.List;

import com.blog.entities.Category;
import com.blog.payloads.CategoryDto;

public interface CategoryService {

	//Create
	public CategoryDto  createcategory(CategoryDto categoryDto);
	
	
	//Update
	public CategoryDto  updatecategory(CategoryDto categoryDto , Integer categoryId);
	
	
	//Delete
	public void  deletecategory(Integer categoryId);
	
	//get 
	public CategoryDto  getcategory(Integer categoryId);
	
	
	//get All
	
	List<CategoryDto> getCategories();


	
}

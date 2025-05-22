package com.blog.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entities.Category;
import com.blog.exceptions.ResourceNotFoundException;
import com.blog.payloads.CategoryDto;
import com.blog.repo.CategoryRepo;
import com.blog.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	

	@Override
	public CategoryDto createcategory(CategoryDto categoryDto) {
		
	Category cat = this.modelMapper.map(categoryDto , Category.class);
	Category addedcat = this.categoryRepo.save(cat);
		return this.modelMapper.map(addedcat, CategoryDto.class);
	}

	@Override
	public CategoryDto updatecategory(CategoryDto categoryDto, Integer categoryId) {
		
		Category cat = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category", "Category Id", categoryId));
		cat.setCategoryTitle(categoryDto.getCategoryTitle());
		cat.setCategoryDescription(categoryDto.getCategoryDescription());
		
		Category updatedcat = this.categoryRepo.save(cat);
		
		return this.modelMapper.map(updatedcat, CategoryDto.class);
	}

	@Override
	public void deletecategory(Integer categoryId) {
		Category cat = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category", "category Id", categoryId));
		this.categoryRepo.delete(cat);
	
	}

	@Override
	public CategoryDto getcategory(Integer categoryId) {
		Category cat = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category", "category Id", categoryId));
		return this.modelMapper.map(cat, CategoryDto.class);
	}

	@Override
	public List<CategoryDto> getCategories() {
	List<Category> categories = this.categoryRepo.findAll();
	List<CategoryDto> catDtos = categories.stream().map(cat-> this.modelMapper.map(cat , CategoryDto.class)).collect(Collectors.toList());
	
		return  catDtos;
	}

}

package com.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.payloads.ApiResponse;
import com.blog.payloads.CategoryDto;

import com.blog.services.CategoryService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/categories")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	 
	
	
	@PostMapping("/")
	public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody CategoryDto categoryDto) {

		CategoryDto createCategory = this.categoryService.createcategory(categoryDto);

		return new ResponseEntity<CategoryDto>(createCategory, HttpStatus.CREATED);
	}
	
	@PutMapping("/{catId}")
	public ResponseEntity<CategoryDto> updateCategory(@Valid @RequestBody CategoryDto categoryDto, @PathVariable Integer catId ) {

		CategoryDto updateCategory = this.categoryService.updatecategory(categoryDto, catId);

		return new ResponseEntity<CategoryDto>(updateCategory, HttpStatus.OK);
	}
	 

	@DeleteMapping("/{catId}")
	public ResponseEntity<ApiResponse> deletecategory(@PathVariable Integer catId) {
	this.categoryService.deletecategory(catId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("User Deleted Successfully...!", true), HttpStatus.OK);
	}
	
	
	@GetMapping("/{catId}")
	public ResponseEntity<CategoryDto> getCategory(@PathVariable Integer catId ) {
		
		CategoryDto categoryDto =this.categoryService.getcategory(catId);
		return new ResponseEntity<CategoryDto>(categoryDto, HttpStatus.OK);
		}

		
	@GetMapping("/")
	public ResponseEntity<List<CategoryDto>> getCategories()  {
		
		List<CategoryDto> categories =this.categoryService.getCategories();
		return  ResponseEntity.ok(categories);
		}
	
}


























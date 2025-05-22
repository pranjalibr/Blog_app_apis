package com.blog.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Singular;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	
	private Integer categotyId;
	@NotBlank
	@Size(min=4, message = "min size category title is 4")
	private String categoryTitle;
	
	@NotBlank
	@Size(min = 10,message = "min size category Description is 10")
	private String categoryDescription;
}

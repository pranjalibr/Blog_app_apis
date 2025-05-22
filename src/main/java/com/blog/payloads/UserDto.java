package com.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class UserDto {

	private Integer id;
	
	
	@NotBlank(message = "Name is required")
	@Size(min =4 , message = "username must be min of 4 chars")
	private String name;
	
	@Email(message ="Email address is not valid")
	private String email;

	
	
	@NotBlank(message = "Password is required")
	@Size(min =3 , max =10 , message = "Password must be min of 3 chars and max of 10 chars !!")
	
	private String password;
	
	@NotNull
	private String about;
//
//	 public Integer getId() {
//	        return id;
//	    }
//
//	    public void setId(Integer id) {
//	        this.id = id;
//	    }
//
//	    public String getName() {
//			return name;
//		}
//
//		public void setName(String name) {
//			this.name = name;
//		}
//
//		public String getEmail() {
//			return email;
//		}
//
//		public void setEmail(String email) {
//			this.email = email;
//		}
//
//		public String getPassword() {
//			return password;
//		}
//
//		public void setPassword(String password) {
//			this.password = password;
//		}
//
//		public String getAbout() {
//			return about;
//		}
//
//		public void setAbout(String about) {
//			this.about = about;
//		}
//		
//		


}

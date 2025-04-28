package com.blog.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class UserDto {

	private Integer Id;
	
	
	private String Name;
	
	
	private String Email;
	
	
	private String Password;
	
	
	private String About;

	 public Integer getId() {
	        return Id;
	    }

	    public void setId(Integer id) {
	        this.Id = id;
	    }

	    public String getName() {
			return Name;
		}

		public void setName(String name) {
			this.Name = name;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			this.Email = email;
		}

		public String getPassword() {
			return Password;
		}

		public void setPassword(String password) {
			this.Password = password;
		}

		public String getAbout() {
			return About;
		}

		public void setAbout(String about) {
			this.About = about;
		}
		
		


}

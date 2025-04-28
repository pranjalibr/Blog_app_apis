package com.blog.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {
	 @GetMapping("/hello")
	    public String hello() {
	        return "Hello from Spring Boot!";
	    }
}

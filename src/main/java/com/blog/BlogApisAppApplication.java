package com.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.blog.entities")

@EnableJpaRepositories(basePackages = "com.blog.repo")
@SpringBootApplication(scanBasePackages = "com.blog")
public class BlogApisAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApisAppApplication.class, args);
	}

}

package com.blog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.blog.repo.UserRepo;

@SpringBootTest
class BlogApisAppApplicationTests {
	
	private UserRepo userRepo;

	@Test
	void contextLoads() {
	}

	
	public void repoTest()
	{
		String className = this.userRepo.getClass().getName();
		String packName = this.userRepo.getClass().getPackageName();
		System.out.println(className);
		System.out.println(packName);
	}
}

package com.project.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootdockerApplication {
	
	@GetMapping("/")
	public String homeString () {
		return "Welcome to CI/CD Deployment for Springboot Application";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdockerApplication.class, args);
	}

}

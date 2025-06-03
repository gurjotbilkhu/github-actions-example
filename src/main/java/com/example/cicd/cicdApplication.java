package com.example.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class cicdApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to javatechie !";
	}

	//echo "# github-actions-example" >> README.md
	//git init
	//git add README.md
	//git commit -m "first commit"
	//git branch -M main
	//git remote add origin https://github.com/gurjotbilkhu/github-actions-example.git
	//git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(cicdApplication.class, args);
	}
}

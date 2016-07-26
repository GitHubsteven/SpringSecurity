package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SecurityApplication {

	@RequestMapping("/")
	@ResponseBody
	public String hello()
	{
		return "hello,world!";
	}
	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}
}

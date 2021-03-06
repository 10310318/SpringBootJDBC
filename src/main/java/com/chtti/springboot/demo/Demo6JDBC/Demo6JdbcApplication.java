package com.chtti.springboot.demo.Demo6JDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Demo6JdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo6JdbcApplication.class, args);
	}
	@GetMapping(value = "/")
	public String index(){
		return "Spring boot JDBC example";
	}
}

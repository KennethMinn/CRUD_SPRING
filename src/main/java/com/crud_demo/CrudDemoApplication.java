package com.crud_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean //When Spring Boot application starts, it looks for beans of type CommandLineRunner and runs them
	public CommandLineRunner commandLineRunner(String[] args){
		//lambda expression
		return runner -> {
			System.out.println("Hello world");
		};
	};
}

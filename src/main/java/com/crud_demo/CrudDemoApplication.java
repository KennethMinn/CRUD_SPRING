package com.crud_demo;

import com.crud_demo.dao.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentService studentService){
		return runner -> {
			//studentService.createStudent();
			//studentService.deleteStudent();
			System.out.println(studentService.getStudents());
		};
	}
}

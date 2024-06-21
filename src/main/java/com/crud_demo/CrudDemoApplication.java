package com.crud_demo;

import com.crud_demo.dao.StudentDAO;
import com.crud_demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	//When Spring Boot application starts, it looks for beans of type CommandLineRunner and runs them
	@Bean //to perform some setup or initialization tasks
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		//lambda expression
		return runner -> {
			createStudent(studentDAO);
		};
	}
	private void createStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("creating new student");
		Student student = new Student("Kenneth", "Minn", "kenneth@gmail.com");

		//save the student object
		System.out.println("saving student");
		studentDAO.save(student);

		//display the id of saved student
		System.out.println("id : " + student.getId());
	};
}

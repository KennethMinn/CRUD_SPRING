package com.crud_demo.dao;

import com.crud_demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Student> getStudents(){
        return studentRepo.findAll();
    }

    public void createStudent(){
        Student student = new Student("Shinn","Thant","st@gmail.com");
        studentRepo.save(student);
    }

    public void deleteStudent(){
        studentRepo.deleteById(2);
    }
}

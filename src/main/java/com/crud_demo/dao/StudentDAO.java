package com.crud_demo.dao;

import com.crud_demo.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);
}

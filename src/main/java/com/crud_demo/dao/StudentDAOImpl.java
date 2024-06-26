package com.crud_demo.dao;

import com.crud_demo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //repository -> db things
public class StudentDAOImpl implements StudentDAO{

    //define field for entity manager
    private final EntityManager entityManger;

    //inject entity manager using constructor injector
    @Autowired
    public StudentDAOImpl(EntityManager entityManger) {
        this.entityManger = entityManger;
    }

    @Override
    @Transactional //for mutation - invalidate the db
    public void save(Student theStudent) {
        this.entityManger.persist(theStudent);//saves the student to the db
    }

    @Override
    public Student findById(Integer id) {
        return entityManger.find(Student.class, id);
    }
}

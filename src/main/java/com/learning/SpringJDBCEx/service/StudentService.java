package com.learning.SpringJDBCEx.service;

import com.learning.SpringJDBCEx.model.Student;
import com.learning.SpringJDBCEx.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    @Autowired
    public StudentService(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s) {
        repo.save(s);

    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}

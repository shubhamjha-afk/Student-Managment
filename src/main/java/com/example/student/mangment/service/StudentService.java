package com.example.student.mangment.service;

import com.example.student.mangment.dao.Studentdao;
import com.example.student.mangment.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StudentService {
    @Autowired
    Studentdao studentdao;
    public List<Student> getall(){
        log.info("student {} ",studentdao.findAll());
        return studentdao.findAll();


    }

    public void addStudent(Student student) {
        studentdao.save(student);
    }

    public void editStudent(Student student) {
    }
}

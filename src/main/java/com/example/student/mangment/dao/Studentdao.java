package com.example.student.mangment.dao;

import com.example.student.mangment.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentdao extends JpaRepository<Student,Integer> {
}

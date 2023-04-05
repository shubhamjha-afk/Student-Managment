package com.example.student.mangment.controller;

import com.example.student.mangment.entity.Student;
import com.example.student.mangment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

        @Autowired
        private StudentService studentService;

        @GetMapping("/students")
        public String getStudentList(Model model) {
            List<Student> students = studentService.getall();
            model.addAttribute("students",students);
            return "student-List";
        }

     @GetMapping("/students/add")
     public String showAddStudentForm(Model model) {
         model.addAttribute("student", new Student());
         return "add-student";
     }
    @PostMapping("/students")
    public String addStudent(@ModelAttribute("student") Student student) {
        studentService.addStudent(student);
        return "redirect:/students";
    }
    @PostMapping("/students/edit/{id}")
    public String editStudent(@PathVariable Long id,  Student student) {
        studentService.editStudent(student);
        return "redirect:/students";
    }

    }




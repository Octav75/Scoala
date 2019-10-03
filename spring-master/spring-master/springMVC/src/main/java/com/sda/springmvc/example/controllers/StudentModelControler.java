package com.sda.springmvc.example.controllers;

import com.sda.springmvc.example.entities.StudentModel;
import com.sda.springmvc.example.repositories.StudentModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//import org.apache.maven.model.Model;

@Controller
public class StudentModelControler {
    private StudentModelRepository studentModelRepository;
    @Autowired
    public StudentModelControler (StudentModelRepository studentModelRepository) {
        this.studentModelRepository = studentModelRepository;
    }
    @GetMapping("/students")
    public String getAllStudents(Model model) {
        List<StudentModel> students = studentModelRepository.findAll();
        model.addAttribute("students", students);
        model.addAttribute("size", students.size());
        return "students";
    }
}


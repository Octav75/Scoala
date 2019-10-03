package com.sda.springmvc.example.controllers;

import com.sda.springmvc.example.entities.CourseModel;
import com.sda.springmvc.example.repositories.CourseModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//import org.apache.maven.model.Model;

@Controller
public class CourseModelControler {
    private CourseModelRepository courseModelRepository;
    @Autowired
    public CourseModelControler (CourseModelRepository studentModelRepository) {
        this.courseModelRepository = courseModelRepository;
    }
    @GetMapping("/courses")
    public String getAllStudents(Model model) {
        List<CourseModel> courses = courseModelRepository.findAll();
        model.addAttribute("courses", courses);
        model.addAttribute("size", courses.size());
        return "courses";
    }
}
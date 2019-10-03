package com.sda.school.entity.classModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/class")
public class ClassController {
    private ClassService classService;

    @Autowired
    public ClassController(ClassController classController) {this.classService = classService;}


}

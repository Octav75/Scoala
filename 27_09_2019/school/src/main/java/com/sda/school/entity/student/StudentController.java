package com.sda.school.entity.student;

import com.sda.school.exeption.NullIdException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("rest/student") // rest call care functioneaza pe baza de http
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
    public ResponseEntity<StudentModel> add(@RequestBody StudentModel studentModel) {
        StudentModel addedStudentModel = studentService.add(studentModel);
        return ResponseEntity.ok(addedStudentModel);
    }

    @GetMapping(produces = "application/json", path = "/{id}")
    public ResponseEntity<StudentModel> get(@PathVariable("id") Long id) {
        Optional<StudentModel> student = studentService.get(id);
        if (student.isPresent()) {
            return ResponseEntity.ok(student.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping
    public ResponseEntity<List<StudentModel>> get() {
        List<StudentModel> students = studentService.get();
        if (students.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(students);
        }
    }

    @DeleteMapping(path = "/(id)")
    public ResponseEntity delete(@PathVariable("id") Long id) {
        try {
            studentService.delete(id);
        } catch (EmptyResultDataAccessException e) {
            return ResponseEntity.notFound().build();
        }
        studentService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping(consumes = "application/json")
    public ResponseEntity<StudentModel> update(@RequestBody StudentModel studentModel) {
        try {
            Optional<StudentModel> updateStudent = studentService.update(studentModel);
            if (updateStudent.isPresent()) {
                return ResponseEntity.ok(updateStudent.get());
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (NullIdException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}

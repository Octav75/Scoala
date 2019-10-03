package com.sda.springmvc.example.repositories;

import com.sda.springmvc.example.entities.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface StudentModelRepository extends CrudRepository<StudentModel, Long> {
    List<StudentModel> findAll();
    List<StudentModel> findByName(String name);
}
